
import java.util.Arrays;

public class MoveAllZeroToLastInArray {


    public static void moveZero(int[] arr){
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]==1){
                arr[i]=0;
                arr[j++]=1;
                
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,0,1,1,1,0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
