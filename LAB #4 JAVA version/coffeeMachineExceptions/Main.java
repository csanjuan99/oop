package coffeeMachineExceptions;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setOnzValue(50);
        coffee.setReceiveCash(1000);
        coffee.buyCoffee();
    }
}
