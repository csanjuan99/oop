package prototypePattern;

public class Carro implements Vehicle {
 private String brand;

 public Carro(String brand) {
     this.brand = brand;
     
     System.out.println("Inicializando un marca de carro " + brand);
 }

 @Override
 public Vehicle clone() {
     
     try {
         return (Carro) super.clone();
     } catch (CloneNotSupportedException e) {
         e.printStackTrace();
         return null;
     }
 }

 @Override
 public void start() {
     System.out.println("Arrancar el coche de marca " + brand);
 }
}
