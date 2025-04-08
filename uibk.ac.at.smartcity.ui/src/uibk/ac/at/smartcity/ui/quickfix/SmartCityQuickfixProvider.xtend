package uibk.ac.at.smartcity.ui.quickfix;

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

import uibk.ac.at.smartcity.validation.SmartCityValidator;

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class SmartCityQuickfixProvider extends DefaultQuickfixProvider {
	
	// quickfix to capitalize the first letter of outer classes
	@Fix(SmartCityValidator.INVALID_ENTITY_NAME)
	def void capitalizeNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize first letter",	// label
		"Capitalize first letter of '" + issue.data.get(0) + "'",
		"upcase.png", 
		[
			context | val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1);
			xtextDocument.replace(issue.offset, 1, firstLetter.toFirstUpper)
		]
		)
	}
}
