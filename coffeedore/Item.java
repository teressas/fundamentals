import java.util.*;

public class Item {

    // MEMBER VARIABLES
    private String name;
    private double price;
    private int index;

    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly

    public Item(){}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // GETTERS & SETTERS  - for name and price
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

}

