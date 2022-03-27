package model;

public class Order {
    long id;
    double price;

    public Order(long id,double price){
        this.id = id;
        this.price = price;

    }

        public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void nextint(int i) {
    }
}
