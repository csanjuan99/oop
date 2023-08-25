import Order from "./src/models/order.model";
const log : string = 'Start application...';

const main: () => void = () => {
    console.log(log);

    const order = new Order(1, 100, 0.19, true, false);

    console.log(order.findOne);

};

main();