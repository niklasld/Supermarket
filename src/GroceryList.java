import java.util.ArrayList;

public class GroceryList {

    private int itemId, quantity;
    private ArrayList<Object> groceries = new ArrayList<Object>();

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

    public void setGroceryItems() {
        groceries.add(new GroceryItemOrder("1 stk. løg", 0, 1.10));
        groceries.add(new GroceryItemOrder("1kg Kartofler", 1, 15.50));
        groceries.add(new GroceryItemOrder("1kg Gulerødder", 2, 12.25));
        groceries.add(new GroceryItemOrder("500g hakket okse", 3, 32.50));
        groceries.add(new GroceryItemOrder("500g hakket flæsk", 4, 27.00));
        groceries.add(new GroceryItemOrder("500g Sandwitchbrød", 5, 11.50));
        groceries.add(new GroceryItemOrder("Iceberg salathoved", 6, 10.25));
        groceries.add(new GroceryItemOrder("Rød Prince", 7, 41.50));
        groceries.add(new GroceryItemOrder("Svampe på dåse", 8, 15.50));
        groceries.add(new GroceryItemOrder("1l Skummetmælk", 9, 8.50));
        groceries.add(new GroceryItemOrder("1l Letmælk", 10, 9.50));
        groceries.add(new GroceryItemOrder("1l Sødmælk", 11, 10.50));
        groceries.add(new GroceryItemOrder("2kg Hvedemel", 12, 15.50));
        groceries.add(new GroceryItemOrder("1 plade Maraubou", 13, 27.00));
        groceries.add(new GroceryItemOrder("Blandet slik pr. 100g", 14, 8.50));
        groceries.add(new GroceryItemOrder("Sølvpapir", 15, 5.50));
        groceries.add(new GroceryItemOrder("Bagepapir", 16, 12.50));
    }

    public void getGroceryItems() {
        ArrayList<Object> peter = new ArrayList<>();
        peter = groceries;
        for(GroceryItemOrder a : peter) {
            System.out.println(a);
        }

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
