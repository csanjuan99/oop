public class TransporteServiceImpl implements TransporteService {
    @Override
    public void organizarTransporte(String destino, Fecha fechaInicio, Fecha fechaFin, PreferenciasCliente preferencias) {
       
        System.out.println("Organizando transporte terrestre en " + destino + " del " + fechaInicio.getFechaInicio() + " al " + fechaFin.getFechaFin());

    }
}
