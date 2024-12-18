package data;

public class Order {
    Buyer buyer;
    Product product;
    int quantity;
    static int count = 0;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
