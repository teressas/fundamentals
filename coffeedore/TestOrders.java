import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
    CoffeeKiosk coffeeKiosk = new CoffeeKiosk();    

    coffeeKiosk.addMenuItem("drip coffee", 3.0);
    coffeeKiosk.addMenuItem("cappucino", 5.5);
    coffeeKiosk.addMenuItem("Mocha", 6.5);
    coffeeKiosk.addMenuItem("Latte", 4.5);
    coffeeKiosk.addMenuItem("Drip Coffee", 5.0);

    coffeeKiosk.displayMenu();

    coffeeKiosk.newOrder();
    }
}

