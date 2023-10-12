package tarjetasDeCredito;

public class Visa extends Tarjeta {
    public Visa(String numeroDeCuenta, double valorApertura) {
        super(numeroDeCuenta, valorApertura);
    }

    @Override
    public double cuotaDeManejo() {
        return 20000 - Descuento.DIAMANTE.getValorDescontado(getValorApertura());
    }
}
