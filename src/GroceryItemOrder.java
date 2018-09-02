public class GroceryItemOrder {

    private String name;
    private int quantity;
    private double price;

    public GroceryItemOrder(String name, double price) {
        this.name = name;
        this.quantity = 1;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        double cost = getQuantity()*getPrice();

        double totalcost = cost;
        return totalcost;
    }

    @Override
    //format toString nicely this is just a test
    public String toString() {
        return "GroceryItemOrder{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + getCost() +
                '}';
    }
}
