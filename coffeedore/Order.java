import java.util.ArrayList;

public class Order {
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    // 

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        // this.ready = false;
        // this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.    
    public Order(String name) {
        this.name = name;
        this.ready = false;
        // this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS

    // ORDER ITEMS
    public void addItem(Item item) {
        // this.items = new ArrayList<Item>();
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    
    public double getOrderTotal() {
        double total = 0.0;
        // iterating through list of item objects
        // Can't pull data from this.items array, only object
        for(Item item: this.items) {
            total += item.getPrice();
        }
        return total;
    }

    // for (int i=0; i < this.items.size(); i++){
    //     total += this.items.get(i).getItemPrice();
    // }

    public void display() {
        System.out.printf("Customer Name: %s ", this.name);
        for (Item item: this.items) {
            System.out.println(item.getName() + "- $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    // GETTERS & SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
}
    
