public class PreferenciasCliente {
    private String tipoAlojamiento;
    private String tipoActividad;

    public PreferenciasCliente(String tipoAlojamiento, String tipoActividad) {
        this.tipoAlojamiento = tipoAlojamiento;
        this.tipoActividad = tipoActividad;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
}
