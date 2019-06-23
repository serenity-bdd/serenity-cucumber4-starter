package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.Pause;
import starter.search.SearchFor;
import starter.search.SearchForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateTo  {

    public static Performable theDuckDuckGoHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(DuckDuckGoHomePage.class)
        );
    }
}