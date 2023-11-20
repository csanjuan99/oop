package Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediador = new ChatMediatorImpl();

        Usuario usuario1 = new Usuario("Usuario1", mediador);
        Usuario usuario2 = new Usuario("Usuario2", mediador);
        Usuario usuario3 = new Usuario("Usuario3", mediador);

        mediador.agregarUsuario(usuario1);
        mediador.agregarUsuario(usuario2);
        mediador.agregarUsuario(usuario3);

        usuario1.enviarMensaje("¡Hola a todos!");
        usuario2.enviarMensaje("¿Cómo están?");
    }
}
