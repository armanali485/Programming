import java.util.Arrays;

public class ReverseElementOfArray
{
    public static int reverseDigit(int n){
        int revNum=0;
        while(n!=0){
            revNum=revNum*10+n%10;
            n/=10;
        }
        return revNum;
    }

    public static void reverseArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=reverseDigit(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {17,34,67,32,123,12};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    

}