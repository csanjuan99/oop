public class AlojamientoServiceImpl implements AlojamientoService {
    @Override
    public void reservarAlojamiento(String destino, Fecha fechaInicio, Fecha fechaFin, PreferenciasCliente preferencias) {
      
        System.out.println("Reservando alojamiento para " + destino + " del " + fechaInicio.getFechaInicio() + " al " + fechaFin.getFechaFin());
        System.out.println("Preferencias: " + preferencias.getTipoAlojamiento());
      
    }
}
