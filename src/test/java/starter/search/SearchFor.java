package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchFor extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        $(SearchForm.SEARCH_FIELD).clear();
        $(SearchForm.SEARCH_FIELD).type(term);
        $(SearchForm.SEARCH_BUTTON).click();
    }

    @Step("Search for term {0}")
    public void termOnSearchResultsPage(String term) {
        $(SearchForm.SEARCH_FIELD_ON_RESULT_PAGE).clear();
        $(SearchForm.SEARCH_FIELD_ON_RESULT_PAGE).type(term);
        $(SearchForm.SEARCH_BUTTON_ON_RESULT_PAGE).click();
    }

}
