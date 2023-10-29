public class ReportBuilder implements Builder {

    private Report report;

    public ReportBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.report = new Report();
    }

    @Override
    public void setHeader(Header header) {
        this.report.setHeader(header);
    }

    @Override
    public void setBody(Body body) {
        this.report.setBody(body);
    }

    @Override
    public void setFooter(Footer footer) {
        this.report.setFooter(footer);
    }

    public Report getResult() {
        return this.report;
    }
}
