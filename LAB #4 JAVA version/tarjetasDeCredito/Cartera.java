package tarjetasDeCredito;

import java.util.ArrayList;

import java.util.List;

public class Cartera implements PatronCartera {
    private String nombreMes;
    private List<Tarjeta> tarjetas;

    public Cartera(String nombreMes) {
        this.nombreMes = nombreMes;
        this.tarjetas = new ArrayList<>();
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }

    @Override
    public void imprimirListaDeTarjetas() {
        System.out.println("*****Balance de " + nombreMes + "******");
        for (Tarjeta tarjeta : tarjetas) {
            System.out.println(tarjeta.toString());
        }
    }
}
