public class Main {
    public static void main(String[] args) {
        Builder builder = new ReportBuilder();
        Director director = new Director(builder);

        director.build(
            new Header("Reporte mensual", "Carlos Sanjuan", "2021-01-01", "Reporte mensual de ventas de la empresa"),
            new Body("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
            new Footer("Carlos Sanjuan", "2021-01-01")
        );

        Report report = builder.getResult();
        report.show();
    }
}
