package Mediator;

class Usuario {
    private String nombre;
    private ChatMediator mediador;

    public Usuario(String nombre, ChatMediator mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public String getNombre() {
        return nombre;
    }

    public void enviarMensaje(String mensaje) {
        System.out.println(nombre + " envía mensaje: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibe mensaje: " + mensaje);
    }
}
