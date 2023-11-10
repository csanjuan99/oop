package Flyweight;

public class Main {
    public static void main(String[] args) {
        Libreria fabricaLibros = new Libreria();

        LibroFlyweight libro1 = fabricaLibros.obtenerLibro("El Principito", "Antoine de Saint-Exupéry");
        LibroFlyweight libro2 = fabricaLibros.obtenerLibro("El Principito", "Antoine de Saint-Exupéry");
        LibroFlyweight libro3 = fabricaLibros.obtenerLibro("Cien años de soledad", "Gabriel García Márquez");

        libro1.mostrarInformacion(1); 
        libro2.mostrarInformacion(2);  
        libro3.mostrarInformacion(3); 
}
}
