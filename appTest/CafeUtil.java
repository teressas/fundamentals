import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil {
    
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        // System.out.println(sum);
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for(int i = 0; i < prices.length; i++) {
            sum += prices[i];
        } 
        return sum;
    }

    void displayMenu(ArrayList<String> menuItems) { 
        String name = "";
        for(int i = 0; i < menuItems.size(); i++){
            name = menuItems.get(i);
            System.out.println(i + " " + name);
        }
    }

    void addCustomer(ArrayList<String> customerWait) {
        // print Please enter your name
        System.out.println("Please enter your name:");

        // Prompts user to enter name, does this 4 times
        String userName = System.console().readLine();

        // Adds username from user input to array
        customerWait.add(userName);

        // stores the array.length - 1
        int num = customerWait.size()-1;

        // prints the user's name and the num of people ahead.
        String greeting = String.format("Hello, %s! There are %s people in front of you.", userName, num); 
        System.out.println(greeting);
        System.out.println(customerWait);

    }

    // void printPriceChart(String product, double price, int maxQuantity) {
    //     System.out.print(product);

    //     double price2 = price * 2;
    //     double price3 = price2 * 2;

    //     ArrayList<double> myPrices = new ArrayList<double>();
    //     myPrices.add(price);
    //     myPrices.add(price2);
    //     myPrices.add(price3);

    //     System.out.println(myPrices);

        // String name = "";
        // for(int i = 0; i < menuItems.size(); i++){
        //     name = menuItems.get(i);
        //     System.out.println(i + " " + name);
        // }
    //}
}