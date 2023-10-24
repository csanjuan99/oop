package tarjetasDeCredito;

public enum Descuento {
    BASICO(0.08),
    PLATINO(0.12),
    DIAMANTE(0.15);

    private double porcentaje;

    Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getValorDescontado(double monto) {
        return monto * porcentaje;
    }
}

