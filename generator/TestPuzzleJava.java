import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // getTenRolls
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // getRandomLetter
        System.out.println(generator.getRandomLetter());
    
        // generatePassword
        System.out.println(generator.generatePassword());

        // getNewPasswordSet
        System.out.println(generator.getNewPasswordSet(3));

    }
}

