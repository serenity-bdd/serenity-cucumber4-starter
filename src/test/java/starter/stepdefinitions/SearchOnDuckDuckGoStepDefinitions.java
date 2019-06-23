package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class SearchOnDuckDuckGoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on the DuckDuckGo home page")
    public void on_the_DuckDuckGo_home_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
    }

    @When("she/he searches for {string}")
    public void search_for(String term) {

        withCurrentActor(
                SearchFor.term(term)
        );
    }

    @Then("all the result titles should contain the word {string}")
    public void all_the_result_titles_should_contain_the_word(String term) {
        withCurrentActor(
                Ensure.thatTheAnswersTo(SearchResult.titles())
                        .allMatch("a title containing '" + term + "'",
                                title -> title.toLowerCase().contains(term.toLowerCase()))

        );

        theActorInTheSpotlight().should(
                seeThat("search result titles",
                        SearchResult.titles(), hasSize(greaterThan(0))),
                seeThat("search result titles",
                        SearchResult.titles(), everyItem(containsIgnoringCase(term)))
        );
    }
}
