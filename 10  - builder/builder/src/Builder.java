public interface Builder {

    public void reset();
    public void setHeader(Header header);
    public void setBody(Body body);
    public void setFooter(Footer footer);
    public Report getResult();

}
