public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.0;
        double caramelLattePrice = 3.0;
        double mochaCappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
        System.out.println(customer1 + readyMessage + "!");
        
        // Noah
        if (isReadyOrder4 == false) {
            System.out.println(customer4 + pendingMessage);
        }
        else {
            System.out.println(customer4 + "," + displayTotalMessage + mochaCappuccinoPrice);
        }

        // Sam
        double samTotalPrice = caramelLattePrice * 2;
        System.out.println(customer2 + "," + displayTotalMessage + samTotalPrice);

        if (isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage + "!");
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy

        if (dripCoffeePrice > caramelLattePrice) {
            double priceDiff = dripCoffeePrice - caramelLattePrice;
            System.out.println(customer3 + " , We owe you " + priceDiff);
        }
        else if (dripCoffeePrice < caramelLattePrice) {
            double priceDiff = caramelLattePrice - dripCoffeePrice;
            System.out.println(customer3 + " , You owe " + priceDiff);
        }
        else {
            System.out.println(customer3 + " , They're both the same price.");
        }
    }
}
