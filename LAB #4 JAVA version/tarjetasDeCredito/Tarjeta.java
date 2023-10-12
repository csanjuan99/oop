package tarjetasDeCredito;

public abstract class Tarjeta
{
    public String numeroDeCuenta;
    private double valorApertura;

    public Tarjeta(String numeroDeCuenta, double valorApertura){
        this.numeroDeCuenta=numeroDeCuenta;
        this.valorApertura=valorApertura;
    }

    public abstract double cuotaDeManejo();

    public String toString(){
    	String nombreClase = getClass().getSimpleName();
        return "El valor de cuota  de : "+numeroDeCuenta+" es: $"+cuotaDeManejo()+" tipo de tarjeta "+nombreClase;
    }
    
    public double getValorApertura(){
        return valorApertura;
    }
}