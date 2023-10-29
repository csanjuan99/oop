public class Body {
    private final String content;

    public Body(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Content: " + content;
    }
}
