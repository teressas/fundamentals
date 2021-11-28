import java.util.Date;
import java.util.Formatter;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s, How are you?", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis!") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }

    }
    
	// NINJA BONUS

	public String guestGreetingBonus(String name) {
        // use SDF to pull the hour of day
        String dayPeriod = "";
        String pattern = "k";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        int i = Integer.parseInt(date);

        // conditional statement to determine the day period
        if (i >= 1 && i <= 11) {
            dayPeriod = "Morning";
        }
        else if (i > 11 && i <= 17) {
            dayPeriod = "Afternoon";
        }
        else {
            dayPeriod = "Evening";
        }

        return String.format("Good %s, %s, How are you?", dayPeriod, name);
    }

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

