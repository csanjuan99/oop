public class Report {

    private Header header;
    private Body body;
    private Footer footer;


    public void setHeader(Header header) {
        this.header = header;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public void show() {
        System.out.println(header.toString());
        System.out.println(body.toString());
        System.out.println(footer.toString());
    }


}
