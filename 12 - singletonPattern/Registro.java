package singletonPattern;

public class Registro {
    
    private static Registro instancia;

    private Registro() {
    }

    public static Registro obtenerInstancia() {
        if (instancia == null) {
            instancia = new Registro();
        }
        return instancia;
    }

    public void agregarEntrada(String mensaje) {

        System.out.println("Registrando: " + mensaje);
    }

}

