package starter;

public class TextMatcher {
    private String text;

    public TextMatcher(String text) {
        this.text = text;
    }

    public static TextMatcher textOf(String text) {
        return new TextMatcher(text);
    }

    public boolean matchesIgnoringCase(String expectedText) {
        return text.equalsIgnoreCase(expectedText);
    }
}
