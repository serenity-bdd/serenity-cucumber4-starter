package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.Collection;

public class SearchResult {
    public static Question<Collection<String>> titles() {
        return actor -> TextContent.of(SearchResultList.RESULT_TITLES).viewedBy(actor).asList();
    }
}
