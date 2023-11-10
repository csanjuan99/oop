package Flyweight;

public class LibroConcretoFlyweight implements LibroFlyweight {
    private String titulo;
    private String autor;

    public LibroConcretoFlyweight(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void mostrarInformacion(int idBook) {
        System.out.println("Libro #" + idBook + ": " + titulo + " por " + autor);
    } 
}
