export default class Order {
    constructor(
        public id: number,
        public price: number,
        public iva: number,
        public payment_status: boolean,
        public shipping_status: boolean,
    ) {
        this.id = id;
        this.price = price;
        this.iva = iva;
        this.payment_status = payment_status;
        this.shipping_status = shipping_status;
    }

    get find() {
        return this;
    }

}

