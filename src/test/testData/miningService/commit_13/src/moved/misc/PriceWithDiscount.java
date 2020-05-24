package misc;
public class PriceWithDiscount {

    int price;
    static int discount;

    public PriceWithDiscount(int price, int discount) {
        this.price = price;
        this.discount = discount;
    }

    public int getPrice() {
        return this.price;
    }

    public void applyDiscount() {
        price -= discount;
    }
}
