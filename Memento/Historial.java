package Memento;

import java.util.Stack;

public class Historial {
    private final Stack<Memento> historial = new Stack<>();

    public void guardar(Memento memento) {
        historial.push(memento);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}
