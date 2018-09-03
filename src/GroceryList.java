import java.util.ArrayList;

public class GroceryList {

    private int itemId, quantity;

    public GroceryList(int itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //make this method
    /*public double getTotalCost() {
        double totalCost = 0;
        int a = -1;
        int itemId = a;
        int quantity = a;
        for (int i; i < items.size(); i++) {
            itemId = items.get(i).getSelectionId();
            quantity = items.get(i).getQuantity();
            if (itemId != a && quantity != a) {
                totalCost += groceries.get(itemId).getCost() * quantity;
            }
            itemId = a;
            quantity = a;
        }

        return totalCost;
    }*/
}
