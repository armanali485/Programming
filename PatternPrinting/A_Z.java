public class A_Z {
    static int row=7;
    static int col = 2*row-1;
    // A public static void A()

    public static void A() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1) || (j == row && i > 1) || (i == 1 && j > 1 && j < row)
                        || i == row / 2 + row / 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // B Printhing
    public static void B() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((j == 1) || (j == row && i > 1 && i < row && i != row / 2 + 1) || (i == 1 && j > 1 && j < row)
                        || (i == row && j < row) || (i == row / 2 + 1 && j < row)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // C Printhing
    public static void C() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1 && i < row) || (i == 1 && j > 1) || (i == row && j > 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // D Printhing
    public static void D() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((j == 1) || (i == 1 && j < row) || (i == row && j < row) || (j == row && i > 1 && i < row)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // E Printhing
    public static void E() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1 && i < row && i != row / 2 + 1) || (i == 1 && j > 1) || (i == row && j > 1)
                        || (i == row / 2 + 1 && j > 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // F Printhing
    public static void F() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((j == 1 && i > 1 && i != row / 2 + 1) || (i == 1 && j > 1) || (i == row / 2 + 1 && j > 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    // G Printhing
    public static void G(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1 && i < row) || (i == 1 && j > 1) || (i == row && j > 1 && j < row)
                    || (i > row / 2 + 1 && j == row && i < row) || (i == row / 2 + 1 && j > row / 2 && j != row)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}

    // H Printhing
    public static void H(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i != row / 2 + 1) || (i == row / 2 + 1 && j > 1 && j < row)
                    || (j == row && i != row / 2 + 1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // I Printhing
    public static void I(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            // if((i==1 && j!=row/2+1) || (i==row && j!=row/2+1) || ( j==row/2+1 && i>1 &&
            // i<row) )
            if ((i == 1) || (i == row) || (j == row / 2 + 1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // J Printhing
    public static void J(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((i == 1) || (j == row / 2 + 1 && i > 1 && i < row) || (i == row && j < row / 2 + 1 && j != 1)
                    || (j == 1 && i > row / 2 + 1 && i != row)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // K Printhing
    public static void K(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (i + j == row / 2 + 3 && i <= row / 2) || (i - row / 2 == j - 1 && i >= row / 2)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // L Printhing
    public static void L(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i != row) || (i == row && j > 1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // M Printhing
    public static void M(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (j == row && i > 1) || (i == j && i < row / 2 + 1)
                    || (i + j == row + 1 && i <= row / 2 + 1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // N Printhing
    public static void N(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1) || (j == row) || (i == j)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // O Printhing
    public static void O(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1 && i < row) || (j == row && i > 1 && i < row) || (i == 1 && j > 1 && j < row)
                    || (i == row && j > 1 && j < row)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // P Printhing
    public static void P(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i > 1) || (j == row && i > 1 && i < row / 2 + 1) || (i == 1 && j > 1 && j < row)
                    || (i == row / 2 + 1 && j > 1 && j < row)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // Q Printhing
    public static void Q(){
    for (int i = 1; i <= row+2; i++) {
        for (int j = 1; j <= row+2; j++) {
            if ((j == 1 && i > 1 && i < row) || (j == row && i > 1 && i < row) || (i == 1 && j > 1 && j < row)
                    || (i == row && j > 1 && j < row) || (i == j && i > row / 2)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
    // R Printhing
    public static void R(){
    for (int i = 1; i <= row+2; i++) {
        for (int j = 1; j <= row+2; j++) {
            if ((j == 1) || (j == row && i > 1 && i < row/2+1) || (i == 1 && j > 1 && j < row)
                    || (i == row/2+1&& j > 1 && j < row) || (i -j==2 && i > row / 2)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
//S Printhing
public static void S(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i < row/2+1 && i >1 ) || (j == row && i > row/2+1 && i < row) || (i == 1 && j > 1)
                    || (i == row && j < row) || (i==row/2+1) && j>1 && j<row) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
//T Printhing
public static void T(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((i == 1) || (j==row/2+1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
//U Printhing
public static void U(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 && i < row) || (j == row && i < row)
                    || (i == row && j > 1 && j < row)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
//W Printhing
public static void W(){
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            if ((j == 1 ) || (j == row)|| (i+j==row+1 && i>row/2)||(i==j && i>row/2)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
//V Printhing
static void V() 
{ 
	int i, j, counter = 0; 
	for (i = 0; i <row; i++) 
	{ 
		for (j = 0; j <= col; j++) 
		{ 
			if (j == counter 
				|| j == col - counter - 1) 
				System.out.print("*"); 
			else
				System.out.print(" "); 
		} 
		counter++; 
		System.out.println(); 
	} 
    System.out.println();
} 
//X Printhing
static void X() 
{  
	for (int i = 1; i <=row; i++) 
	{ 
		for (int j = 1; j <= row; j++) 
		{ 
			if (i==j||i+j==row+1) 
				System.out.print("* "); 
			else
				System.out.print("  "); 
		} 
		System.out.println(); 
	} 
    System.out.println();
} 
//Y Printhing
static void Y() 
{  
	for (int i = 1; i <=row; i++) 
	{ 
		for (int j = 1; j <= row; j++) 
		{ 
			if ((i==j && i<=row/2+1)||(i+j==row+1 && i<=row/2+1||(j==row/2+1 && i>row/2))) 
				System.out.print("* "); 
			else
				System.out.print("  "); 
		} 
		System.out.println(); 
	} 
    System.out.println();
} 
//Z Printhing
static void Z() 
{  
	for (int i = 1; i <=row; i++) 
	{ 
		for (int j = 1; j <= row; j++) 
		{ 
			if (i+j==row+1||(i==1)||i==row) 
				System.out.print("* "); 
			else
				System.out.print("  "); 
		} 
		System.out.println(); 
	}
    System.out.println(); 
}
static void space(){
    for (int i = 1; i <=row; i++) 
	{ 
		for (int j = 1; j <= row; j++) 
		{ 

				System.out.println("  "); 
		} 
		System.out.println(); 
	} 

}

}
