package uibk.ac.at.smartcity;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Injector;

import uibk.ac.at.smartcity.generator.SmartCityGenerator;

public class SmartCityGeneratorLauncher {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage: SmartCityGeneratorLauncher <inputFile> <outputDirectory>");
            System.exit(1);
		}
        String outputDir = args[1];

		// Timing for the evaluation
		long startTime = System.currentTimeMillis();
		
		SmartCityStandaloneSetup.doSetup();
		Injector injector = new SmartCityStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		
		// load the ."smartcity" file
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		URI uri = URI.createFileURI(new File(args[0]).getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);
        try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		    System.err.println("Error loading the DSL file: " + e.getMessage());
            System.exit(1);
		}
        
        // get the generator and file system access
        SmartCityGenerator generator = injector.getInstance(SmartCityGenerator.class);        
        JavaIoFileSystemAccess fileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
        fileSystemAccess.setOutputPath(outputDir);

        generator.doGenerate(resource, fileSystemAccess, null);
        
        // stop the timing
        long endTime = System.currentTimeMillis();
        System.out.println("Generation completed in " + (endTime - startTime) + " ms.");

	}

}
