

public class HoloSquare {
    public static void main(String[] args) {
        int side=4;
        for(int i=1;i<=side;i++){
            for(int j=1;j<=side;j++){
                if(i==1 || i==side || j==1 || j==side){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
