import java.util.Scanner;

public class PrintingName {
    static int delay;
    static int row;
    static int col;
    //Space
    public static void space() {
        for (int i = 1; i <= row/2; i++) {

            System.err.print(" ");
        }
    }

    // A
    public static void A(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1) || (j == row && i > 1) || (i == 1 && j > 1 && j < row)
                    || i == row / 2 + row / 4) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // B
    public static void B(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (j == row && i > 1 && i < row && i != row / 2 + 1) || (i == 1 && j > 1 && j < row)
                    || (i == row && j < row) || (i == row / 2 + 1 && j < row)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // C
    public static void C(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1 && i < row) || (i == 1 && j > 1) || (i == row && j > 1)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // D
    public static void D(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if (j == 1 || (j == row && i > 1 && i < row) || (i == 1 && j < row) || (i == row && j < row)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // E
    public static void E(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if (j == 1 || (i == 1) || (i == row) || (i == row / 2 + 1)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // F
    public static void F(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if (j == 1 || (i == 1) || (i == row / 2 + 1)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // G
    public static void G(int i) throws InterruptedException {
       for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1 && i < row) || (i == 1 && j > 1) || (i == row && j > 1 && j < row)
                    || (i >= row / 2 + 1 && j == row && i < row) || (i == row / 2 + 1 && j > row / 2 && j != row)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // H
    public static void H(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if (j == 1 || j == row || i == row / 2 + 1) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // I
    public static void I(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if (i == 1 || i == row || j == row / 2 + 1) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // J
    public static void J(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if (i == 1 || (j == row / 2 + 1 && i < row) || (i == row && j <= row / 2)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // K
    public static void K(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (i + j == row / 2 + 3 && i <= row / 2) || (i - row / 2 == j - 1 && i >= row / 2)) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    // L
    public static void L(int i) throws InterruptedException {
        for (int j = 1; j <= row; j++) {
            if (j == 1 || i == row) {
                Thread.sleep(delay);
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }


    // M
public static void M(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if (j == 1 || j == row || (i == j && i <= row / 2) || (j == row - i + 1 && i <= row / 2)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// N
public static void N(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if (j == 1 || j == row || i == j) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// O
public static void O(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if ((i == 1 && j > 1 && j < row) || (i == row && j > 1 && j < row)
                || (j == 1 && i > 1 && i < row) || (j == row && i > 1 && i < row)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// P
public static void P(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if (j == 1 || (i == 1 && j < row) || (i == row / 2 + 1 && j < row)
                || (j == row && i > 1 && i < row / 2 + 1)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// Q
public static void Q(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if ((i == 1 && j > 1 && j < row - 1) || (i == row - 1 && j > 1 && j < row - 1)
                || (j == 1 && i > 1 && i < row - 1) || (j == row - 1 && i > 1 && i < row - 1)
                || (i == j && i > row / 2)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// R
public static void R(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if (j == 1 || (i == 1 && j < row) || (i == row / 2 + 1 && j < row)
                || (j == row && i > 1 && i < row / 2 + 1) || (i == j && i >= row / 2 + 1)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// S
public static void S(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if ((i == 1 && j > 1) || (i == row / 2 + 1 && j > 1 && j < row)
                || (i == row && j < row) || (j == 1 && i < row / 2 + 1 && i > 1)
                || (j == row && i > row / 2 + 1 && i < row)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// T
public static void T(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if (i == 1 || j == row / 2 + 1) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// U
public static void U(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if ((j == 1 && i < row) || (j == row && i < row) || (i == row && j > 1 && j < row)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// V
public static void V(int i) throws InterruptedException {
    for (int j = 1; j <= col; j++) {
        if ((j == i && i <= row) || (j == col - i + 1 && i <= row)) {
            Thread.sleep(delay);
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
}

// W
public static void W(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
            if ((j == 1 ) || (j == row)|| (i+j==row+1 && i>row/2)||(i==j && i>row/2)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
}

// X
public static void X(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if (j == i || j == row - i + 1) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// Y
public static void Y(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if ((j == i && i <= row / 2) || (j == row - i + 1 && i <= row / 2) || (j == row / 2 + 1 && i > row / 2)) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}

// Z
public static void Z(int i) throws InterruptedException {
    for (int j = 1; j <= row; j++) {
        if (i == 1 || i == row || j == row - i + 1) {
            Thread.sleep(delay);
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
}


    public static void main(String[] args) throws InterruptedException {
        delay = 50;
        row = 7;
        col = 2 * row - 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine().toUpperCase();
        sc.close();

        for (int i = 1; i <= row; i++) {
            for (char ch : name.toCharArray()) {
                if (Character.isLetter(ch)) {
                    printChar(ch, i);
                } else {
                    space(); // for spaces or non-letter characters
                }
                space(); // space between letters
            }
            System.out.println();
        }
    }

    public static void printChar(char ch, int i) throws InterruptedException {
        switch (ch) {
            case 'A': A(i); break;
            case 'B': B(i); break;
            case 'C': C(i); break;
            case 'D': D(i); break;
            case 'E': E(i); break;
            case 'F': F(i); break;
            case 'G': G(i); break;
            case 'H': H(i); break;
            case 'I': I(i); break;
            case 'J': J(i); break;
            case 'K': K(i); break;
            case 'L': L(i); break;
            case 'M': M(i); break;
            case 'N': N(i); break;
            case 'O': O(i); break;
            case 'P': P(i); break;
            case 'Q': Q(i); break;
            case 'R': R(i); break;
            case 'S': S(i); break;
            case 'T': T(i); break;
            case 'U': U(i); break;
            case 'V': V(i); break;
            case 'W': W(i); break;
            case 'X': X(i); break;
            case 'Y': Y(i); break;
            case 'Z': Z(i); break;
            default: space(); break;
        }
    }
}