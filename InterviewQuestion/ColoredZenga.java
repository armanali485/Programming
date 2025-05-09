import java.util.Scanner;

public class ColoredZenga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            return;
        }
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next().toLowerCase();

        int removeWhite=0;
        int removeRed=0;
        boolean flag = false;
        for(String s : arr){
            if(s.equals("white")){
                if(!flag){
                    flag = true;
                }
            }
            else{
                if(flag){
                    removeWhite++;
                    flag = false;
                }
            }
        }
        if(flag){
            removeWhite++;
        }
        flag = false;
        for(String s : arr){
            if(s.equals("red")){
                if(!flag){
                    flag = true;
                }
            }
            else{
                if(flag){
                    removeRed++;
                    flag = false;
                }
            }
        }
        if(flag){
            removeRed++;
        }
        System.out.println(Math.min(removeWhite+1, removeRed+1));

    }
    
}