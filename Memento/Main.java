package Memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Historial historial = new Historial();

        editor.escribir("Primera versión del documento");
        historial.guardar(editor.guardar());

        editor.escribir("Segunda versión del documento");
        historial.guardar(editor.guardar());

        System.out.println("Contenido actual: " + editor.getContenido());

        // Deshacer a la versión anterior
        editor.restaurar(historial.deshacer());
        System.out.println("Contenido después de deshacer: " + editor.getContenido());
    }
}

