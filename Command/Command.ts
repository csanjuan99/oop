// Command Interface
interface Command {
    execute(): void;
}

// Receiver (Kitchen)
class Kitchen {
    preparePizza(): void {
        console.log('Kitchen: Preparing pizza...');
    }

    prepareBurger(): void {
        console.log('Kitchen: Preparing burger...');
    }
}

// Concrete Commands
class OrderPizzaCommand implements Command {
    private kitchen: Kitchen;

    constructor(kitchen: Kitchen) {
        this.kitchen = kitchen;
    }

    execute(): void {
        this.kitchen.preparePizza();
    }
}

class OrderBurgerCommand implements Command {
    private kitchen: Kitchen;

    constructor(kitchen: Kitchen) {
        this.kitchen = kitchen;
    }

    execute(): void {
        this.kitchen.prepareBurger();
    }
}

// Invoker (Waiter)
class Waiter {
    private command: Command | null = null;

    setCommand(command: Command): void {
        this.command = command;
    }

    executeCommand(): void {
        if (this.command) {
            this.command.execute();
        } else {
            console.log('Waiter: No command provided.');
        }
    }
}

// Client (Restaurant)
class Restaurant {
    public static main(): void {
        const kitchen = new Kitchen();
        const orderPizza = new OrderPizzaCommand(kitchen);
        const orderBurger = new OrderBurgerCommand(kitchen);
        const waiter = new Waiter();

        waiter.setCommand(orderPizza); // Client orders a pizza
        waiter.executeCommand();

        waiter.setCommand(orderBurger); // Client orders a burger
        waiter.executeCommand();
    }
}

// Running the example
Restaurant.main();
