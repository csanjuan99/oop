package coffeeMachineExceptions;

public class Coffee {

 private int cash;
 private int level;
 private int onzValue;
 private int onzPrice;
 private int receiveCash;

 public Coffee() {
     this.cash = 20000;
     this.level = 100;
     this.onzValue = 100;
     this.onzPrice = 0;
     this.receiveCash = 0;
 }

 public int getCoffeePrice() {
     if (onzPrice < 0) {
         throw new IllegalArgumentException("Precio de Onz debe ser mayor o igual a 0");
     }
     return onzPrice * onzValue;
 }

 public int getChange() {
     int change = receiveCash - getCoffeePrice();
     if (change < 0) {
         throw new IllegalArgumentException("No tiene suficiente dinero");
     }
     if (change == 0) {
         System.out.println("No hay cambio");
     }
     return change;
 }

 public void setOnzValue(int onzValue) {
     if (onzValue < 0) {
         throw new IllegalArgumentException("Precio de Onz debe ser mayor o igual a 0");
     }
     if (onzValue > level) {
         throw new IllegalArgumentException("El valor de Onz debe ser menor o igual que "
         		+ "level. El actual level es " + level);
     }
     this.onzValue = onzValue;
 }

 public void setReceiveCash(int receiveCash) {
     if (receiveCash < 0) {
         throw new IllegalArgumentException("El dinero recibido debe ser mayor o igual a 0");
     }
     this.receiveCash = receiveCash;
 }

 public int buyCoffee() {
     if (receiveCash < getCoffeePrice()) {
         throw new IllegalArgumentException("No tienes suficiente dinero para comprar café");
     }

     if (level < onzValue) {
         throw new IllegalArgumentException("No hay suficiente café disponible");
     }

     cash += getCoffeePrice();
     level -= onzValue;
     onzValue = 0;
     receiveCash = 0;

     System.out.println("La compra de Café fué exitosa!");
     return getChange();
 }
}
