public class PlanificadorVacacionalFacade {
    private VueloService vueloService;
    private AlojamientoService alojamientoService;
    private ActividadTuristicaService actividadService;
    private TransporteService transporteService;
    private RestauranteService restauranteService;


    public void planificarVacaciones(String destino, Fecha fechaInicio, Fecha fechaFin, PreferenciasCliente preferencias) {
       
        vueloService.buscarVuelos(destino, fechaInicio, fechaFin, preferencias);
        alojamientoService.reservarAlojamiento(destino, fechaInicio, fechaFin, preferencias);
        actividadService.seleccionarActividades(destino, preferencias);
        transporteService.organizarTransporte(destino, fechaInicio, fechaFin, preferencias);
        restauranteService.reservarRestaurantes(destino, fechaInicio, fechaFin, preferencias);
    }
}
