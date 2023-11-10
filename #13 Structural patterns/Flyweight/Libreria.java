package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Libreria {
    private Map<String, LibroFlyweight> libros = new HashMap<>();

    public LibroFlyweight obtenerLibro(String titulo, String autor) {
        String key = titulo + "_" + autor;
        if (!libros.containsKey(key)) {
            libros.put(key, new LibroConcretoFlyweight(titulo, autor));
        }
        return libros.get(key);
    }
}
