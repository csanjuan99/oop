public class Ejemplo {
  public static void main(String[] args) {
    ConcreteImplementationUno implementation1 = new ConcreteImplementationUno();

    IAbstraction abstraction1 = new ConcreteAbstraction(implementation1);

    abstraction1.draw();

    ConcreteImplementationDos implementation2 = new ConcreteImplementationDos();
    
    IAbstraction abstraction2 = new ConcreteAbstraction(implementation2);

    abstraction2.draw();
  }
}
