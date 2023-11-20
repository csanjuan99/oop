package Mediator;
import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuario(Usuario usuario);
}
