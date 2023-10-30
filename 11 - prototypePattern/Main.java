package prototypePattern;

public class Main {

	public static void main(String[] args) {
		
        Carro carPrototype = new Carro("Toyota");

       
        Carro car1 = (Carro) carPrototype.clone();
        Carro car2 = (Carro) carPrototype.clone();

        car1.start();
        car2.start();

	}

}
