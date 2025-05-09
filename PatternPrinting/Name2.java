import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Name2 {

    static String[] getCharacterPattern(char character) {
        switch (character) {
            case 'A': return trsy.A();
            case 'B': return trsy.B();
            // Add cases for all letters and space
            case ' ': return trsy.space();
            default: return trsy.space(); // Default to a blank for unsupported characters
        }
    }

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------Printing Name Using  g*---------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter Your Name: ");
        String name = new Scanner(System.in).nextLine().toUpperCase();

        List<String[]> patterns = new ArrayList<>();

        // Collect patterns for each character in the name
        for (char character : name.toCharArray()) {
            patterns.add(getCharacterPattern(character));
        }

        // Print all rows of the patterns side by side
        for (int row = 0; row < 7; row++) { // Assuming all patterns are 6 rows tall
            for (String[] pattern : patterns) {
                System.out.print(pattern[row] + "  "); // Add spacing between letters
            }
            System.out.println(); // Move to the next row
        }
    }
}
