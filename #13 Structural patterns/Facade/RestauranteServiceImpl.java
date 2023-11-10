public class RestauranteServiceImpl implements RestauranteService {
    @Override
    public void reservarRestaurantes(String destino, Fecha fechaInicio, Fecha fechaFin, PreferenciasCliente preferencias) {
        
        System.out.println("Reservando restaurantes en " + destino + " del " + fechaInicio.getFechaInicio() + " al " + fechaFin.getFechaFin());
      
    }
}
