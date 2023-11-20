package Memento;

public class Editor {
    private String contenido;

    public void escribir(String nuevoContenido) {
        this.contenido = nuevoContenido;
    }

    public Memento guardar() {
        return new Memento(contenido);
    }

    public void restaurar(Memento memento) {
        this.contenido = memento.getContenido();
    }

    public String getContenido() {
        return contenido;
    }
}
