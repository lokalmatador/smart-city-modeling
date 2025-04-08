package uibk.ac.at.smartcity.ui.quickfix;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uibk.ac.at.smartcity.validation.SmartCityValidator;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class SmartCityQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(SmartCityValidator.INVALID_ENTITY_NAME)
  public void capitalizeNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String _get = issue.getData()[0];
    String _plus = ("Capitalize first letter of \'" + _get);
    String _plus_1 = (_plus + "\'");
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      final String firstLetter = xtextDocument.get((issue.getOffset()).intValue(), 1);
      xtextDocument.replace((issue.getOffset()).intValue(), 1, StringExtensions.toFirstUpper(firstLetter));
    };
    acceptor.accept(issue, "Capitalize first letter", _plus_1, 
      "upcase.png", _function);
  }
}
