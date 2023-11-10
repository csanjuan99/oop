public class VueloServiceImpl implements VueloService {
    @Override
    public void buscarVuelos(String destino, Fecha fechaInicio, Fecha fechaFin, PreferenciasCliente preferencias) {
        
        System.out.println("Buscando vuelos para " + destino + " del " + fechaInicio.getFechaInicio() + " al " + fechaFin.getFechaFin());
        System.out.println("Preferencias: " + preferencias.getTipoAlojamiento());

    }
}
