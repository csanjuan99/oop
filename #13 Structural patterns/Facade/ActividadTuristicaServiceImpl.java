public class ActividadTuristicaServiceImpl implements ActividadTuristicaService {
    @Override
    public void seleccionarActividades(String destino, PreferenciasCliente preferencias) {
        
        System.out.println("Seleccionando actividades turísticas en " + destino);
        System.out.println("Preferencias: " + preferencias.getTipoActividad());
       
    }
}
