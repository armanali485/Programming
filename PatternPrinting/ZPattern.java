

public class ZPattern {
    public static void main(String[] args) {
    int row=15;
    int mid = (row/2)+1;
    int dot = (mid/2);
    for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
            if(j==(row/2)+1 || (i==1 && j>=(row/2)+1) ||  (i==row && j<=(row/2)+1) ||i==(row/2)+1 || (j==1 && i<=(row/2)+1) ||  (j==row && i>=(row/2)+1) || ((j==dot || j==dot+mid) && (i==dot || i==dot+mid))){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    // System.out.println("-----------------------------------");
    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=row;j++){
    //         if(i==(row/2)+1 || (j==1 && i>=(row/2)+1) ||  (j==row && i<=(row/2)+1)){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // System.out.println("------------------------------");
    // for(int i=1;i<=row;i++){
    //     for(int j=1;j<=row;j++){
    //         if(i==(row/2)+1 || (j==1 && i<=(row/2)+1) ||  (j==row && i>=(row/2)+1)){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    }
}

