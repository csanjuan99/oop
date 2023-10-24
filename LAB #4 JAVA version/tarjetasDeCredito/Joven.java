package tarjetasDeCredito;

public class Joven extends Tarjeta {
    public Joven(String numeroDeCuenta, double valorApertura) {
        super(numeroDeCuenta, valorApertura);
    }

    @Override
    public double cuotaDeManejo() {
        return 20000 - Descuento.BASICO.getValorDescontado(getValorApertura());
    }
}
