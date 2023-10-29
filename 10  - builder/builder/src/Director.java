public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build(Header header, Body body, Footer footer) {
        builder.reset();
        builder.setHeader(header);
        builder.setBody(body);
        builder.setFooter(footer);
    }

}
