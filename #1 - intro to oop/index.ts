import Order from "./src/models/order.model";

const main: () => void = () => {
    const log: string = 'Start application...';
    console.log(log);

    const order: Order = new Order(1, 100, 0.19, true, false);

    console.log(order.find);
};

main();
