package tarjetasDeCredito;

public class Nomina extends Tarjeta {
    public Nomina(String numeroDeCuenta, double valorApertura) {
        super(numeroDeCuenta, valorApertura);
    }

    @Override
    public double cuotaDeManejo() {
        return 20000 - Descuento.PLATINO.getValorDescontado(getValorApertura());
    }
}
