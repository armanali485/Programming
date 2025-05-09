import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamePrinting {
    static void printPattern(char character) {
        switch (character) {
            case 'A':
                A_Z.A();
                break;
            case 'B':
                A_Z.B();
                break;
            case 'C':
                A_Z.C();
                break;
            case 'D':
                A_Z.D();
                break;
            case 'E':
                A_Z.E();
                break;
            case 'F':
                A_Z.F();
                break;
            case 'G':
                A_Z.G();
                break;
            case 'H':
                A_Z.H();
                break;
            case 'I':
                A_Z.I();
                break;
            case 'J':
                A_Z.J();
                break;
            case 'K':
                A_Z.K();
                break;
            case 'L':
                A_Z.L();
                break;
            case 'M':
                A_Z.M();
                break;
            case 'N':
                A_Z.N();
                break;
            case 'O':
                A_Z.O();
                break;
            case 'P':
                A_Z.P();
                break;
            case 'Q':
                A_Z.Q();
                break;
            case 'R':
                A_Z.R();
                break;
            case 'S':
                A_Z.S();
                break;
            case 'T':
                A_Z.T();
                break;
            case 'U':
                A_Z.U();
                break;
            case 'V':
                A_Z.V();
                break;
            case 'W':
                A_Z.W();
                break;
            case 'X':
                A_Z.X();
                break;
            case 'Y':
                A_Z.Y();
                break;
            case 'Z':
                A_Z.Z();
                break;
            case ' ':
                A_Z.space();
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
