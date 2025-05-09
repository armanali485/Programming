import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class returnA_Z {
    static int row=7;
    static int col = 2*row-1;
    // A public static String[] A()

    public static String[] A() {
        String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
            
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1) || (j == row && i > 1) || (i == 1 && j > 1 && j < row)
                        || i == row / 2 + row / 4) {
                    p[i-1]+=("* ");
                } else {
                    p[i-1]+=("  ");
                }
            }
        }
        return p;
    }

    // B Printhing
    public static String[] B() {
        String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
            for (int j = 1; j <= row; j++) {
                if ((j == 1) || (j == row && i > 1 && i < row && i != row / 2 + 1) || (i == 1 && j > 1 && j < row)
                        || (i == row && j < row) || (i == row / 2 + 1 && j < row)) {
                    p[i-1]+=("* ");
                } else {
                    p[i-1]+=("  ");
                }
            }
        }
        return p;
        
    }

    // C Printhing
    public static String[] C() {
        String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1 && i < row) || (i == 1 && j > 1) || (i == row && j > 1)) {
                    p[i-1]+=("* ");
                } else {
                    p[i-1]+=("  ");
                }
            }
            
        }
        return p;
        
    }

    // D Printhing
    public static String[] D() {
        String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
            for (int j = 1; j <= row; j++) {
                if ((j == 1) || (i == 1 && j < row) || (i == row && j < row) || (j == row && i > 1 && i < row)) {
                    p[i-1]+=("* ");
                } else {
                    p[i-1]+=("  ");
                }
            }
            
        }
        return p;
        
    }

    // E Printhing
    public static String[] E() {
        String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1 && i < row && i != row / 2 + 1) || (i == 1 && j > 1) || (i == row && j > 1)
                        || (i == row / 2 + 1 && j > 1)) {
                    p[i-1]+=("* ");
                } else {
                    p[i-1]+=("  ");
                }
            }
            
        }
        return p;
        
    }

    // F Printhing
    public static String[] F() {
        String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1 && i != row / 2 + 1) || (i == 1 && j > 1) || (i == row / 2 + 1 && j > 1)) {
                    p[i-1]+=("* ");
                } else {
                    p[i-1]+=("  ");
                }
            }
            
        }
        return p;
        
    }
    // G Printhing
    public static String[] G(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1 && i < row) || (i == 1 && j > 1) || (i == row && j > 1 && j < row)
                    || (i > row / 2 + 1 && j == row && i < row) || (i == row / 2 + 1 && j > row / 2 && j != row)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}

    // H Printhing
    public static String[] H(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i != row / 2 + 1) || (i == row / 2 + 1 && j > 1 && j < row)
                    || (j == row && i != row / 2 + 1)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // I Printhing
    public static String[] I(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((i == 1) || (i == row) || (j == row / 2 + 1)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // J Printhing
    public static String[] J(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((i == 1) || (j == row / 2 + 1 && i > 1 && i < row) || (i == row && j < row / 2 + 1 && j != 1)
                    || (j == 1 && i > row / 2 + 1 && i != row)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // K Printhing
    public static String[] K(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (i + j == row / 2 + 3 && i <= row / 2) || (i - row / 2 == j - 1 && i >= row / 2)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // L Printhing
    public static String[] L(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i != row) || (i == row && j > 1)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // M Printhing
    public static String[] M(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (j == row && i > 1) || (i == j && i < row / 2 + 1)
                    || (i + j == row + 1 && i <= row / 2 + 1)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // N Printhing
    public static String[] N(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (j == row) || (i == j)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // O Printhing
    public static String[] O(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1 && i < row) || (j == row && i > 1 && i < row) || (i == 1 && j > 1 && j < row)
                    || (i == row && j > 1 && j < row)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // P Printhing
    public static String[] P(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1) || (j == row && i > 1 && i < row / 2 + 1) || (i == 1 && j > 1 && j < row)
                    || (i == row / 2 + 1 && j > 1 && j < row)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // Q Printhing
    public static String[] Q(){
    String[] p = new String[row+2];
    for (int i = 1; i <= row+2; i++) {
        p[i-1]="";
        for (int j = 1; j <= row+2; j++) {
            if ((j == 1 && i > 1 && i < row) || (j == row && i > 1 && i < row) || (i == 1 && j > 1 && j < row)
                    || (i == row && j > 1 && j < row) || (i == j && i > row / 2)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
    // R Printhing
    public static String[] R(){
        String[] p = new String[row+2];
    for (int i = 1; i <= row+2; i++) {
        p[i-1]="";
        for (int j = 1; j <= row+2; j++) {
            if ((j == 1) || (j == row && i > 1 && i < row/2+1) || (i == 1 && j > 1 && j < row)
                    || (i == row/2+1&& j > 1 && j < row) || (i -j==2 && i > row / 2)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
//S Printhing
public static String[] S(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i < row/2+1 && i >1 ) || (j == row && i > row/2+1 && i < row) || (i == 1 && j > 1)
                    || (i == row && j < row) || (i==row/2+1) && j>1 && j<row) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
//T Printhing
public static String[] T(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((i == 1) || (j==row/2+1)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
//U Printhing
public static String[] U(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i < row) || (j == row && i < row)
                    || (i == row && j > 1 && j < row)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
//W Printhing
public static String[] W(){
    String[] p = new String[row];
        for (int i = 1; i <= row; i++) {
            p[i-1]="";
        for (int j = 1; j <= row; j++) {
            if ((j == 1 ) || (j == row)|| (i+j==row+1 && i>row/2)||(i==j && i>row/2)) {
                p[i-1]+=("* ");
            } else {
                p[i-1]+=("  ");
            }
        }
        
    }
    return p;
    
}
//V Printhing
static String[] V() 
{ 
    String[] p = new String[row];
	int i, j, counter = 0; 
	for (i = 0; i <row; i++) 
	{ 
        p[i]="";
		for (j = 0; j <= col; j++) 
		{ 
			if (j == counter || j == col - counter - 1){ 
				p[i]+=("*"); 
            }
			else{
				p[i]+=(" ");
            }
		} 
		counter++; 
		 
	} 
    return p;
    
} 

//X Printhing
static String[] X() 
{  
    String[] p = new String[row];
	for (int i = 1; i <=row; i++) 
	{ 
        p[i-1]="";
		for (int j = 1; j <= row; j++) 
		{ 
			if (i==j||i+j==row+1) 
				p[i-1]+=("* "); 
			else
				p[i-1]+=("  "); 
		} 
		 
	} 
    return p;
    
} 
//Y Printhing
static String[] Y() 
{  
    String[] p = new String[row];
	for (int i = 1; i <=row; i++) 
	{ 
        p[i-1]="";
		for (int j = 1; j <= row; j++) 
		{ 
			if ((i==j && i<=row/2+1)||(i+j==row+1 && i<=row/2+1||(j==row/2+1 && i>row/2))) 
				p[i-1]+=("* "); 
			else
				p[i-1]+=("  "); 
		} 
		 
	} 
    return p;
    
} 
//Z Printhing
static String[] Z() 
{  
    String[] p = new String[row];
	for (int i = 1; i <=row; i++) 
	{ 
        p[i-1]="";
		for (int j = 1; j <= row; j++) 
		{ 
			if (i+j==row+1||(i==1)||i==row) 
				p[i-1]+=("* "); 
			else
				p[i-1]+=("  "); 
		} 
		 
	}
    return p;
     
}
static String[] space(){
    String[] p = new String[row];
    for (int i = 1; i <=row; i++) 
	{ 
        p[i-1]="";
		for (int j = 1; j <= row; j++) 
		{ 

				p[i-1]+=("  "); 
		} 
		 
	} 
    return p;

}
static String[] getCharacterPattern(char character) {
        switch (character) {
            case 'A':
                return returnA_Z.A();
                
            case 'B':
                return returnA_Z.B();
                
            case 'C':
                return returnA_Z.C();
                
            case 'D':
                return returnA_Z.D();
                
            case 'E':
                return returnA_Z.E();
                
            case 'F':
                return returnA_Z.F();
                
            case 'G':
                return returnA_Z.G();
                
            case 'H':
                return returnA_Z.H();
                
            case 'I':
                return returnA_Z.I();
                
            case 'J':
                return returnA_Z.J();
                
            case 'K':
                return returnA_Z.K();
                
            case 'L':
                return returnA_Z.L();
                
            case 'M':
                return returnA_Z.M();
                
            case 'N':
                return returnA_Z.N();
                
            case 'O':
                return returnA_Z.O();
                
            case 'P':
                return returnA_Z.P();
                
            case 'Q':
                return returnA_Z.Q();
                
            case 'R':
                return returnA_Z.R();
                
            case 'S':
                return returnA_Z.S();
                
            case 'T':
                return returnA_Z.T();
                
            case 'U':
                return returnA_Z.U();
                
            case 'V':
                return returnA_Z.V();
                
            case 'W':
                return returnA_Z.W();
                
            case 'X':
                return returnA_Z.X();
                
            case 'Y':
                return returnA_Z.Y();
                
            case 'Z':
                return returnA_Z.Z();
                
            default:
                return returnA_Z.space();
        }
    }
public static void main(String[] args)throws InterruptedException {
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------Printing Name Using  *---------------------");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter Your Name: ");
        String name = new Scanner(System.in).nextLine().toUpperCase();
        // String revName="";
        // for(int i=name.length()-1;i>=0;i--){
        //     revName+=name.charAt(i);
        // }
        // name = revName;
        List<String[]> patterns = new ArrayList<>();

        // Collect patterns for each character in the name
        for (char character : name.toCharArray()) {
            patterns.add(getCharacterPattern(character));
        }

        // Print all rows of the patterns side by side
        for (int row = 0; row < 7; row++) { // Assuming all patterns are 6 rows tall
            for (String[] pattern : patterns) {
                Thread.sleep(1000);
                System.out.print(pattern[row] + "  "); // Add spacing between letters
            }
             // Move to the next 
             System.out.println();
        }
    }

}
