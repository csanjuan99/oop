package Mediator;

import java.util.ArrayList;
import java.util.List;

class ChatMediatorImpl implements ChatMediator {
    private List<Usuario> usuarios;

    public ChatMediatorImpl() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.recibirMensaje(mensaje);
            }
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
