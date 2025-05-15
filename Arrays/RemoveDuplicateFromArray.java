
import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void removeDuplicate(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==-1)
                    break;
                else if(arr[i]!=-1 && arr[i]==arr[j]){
                    arr[j]=-1;
                    count++;
                }

            }
        }
        int[] newArray = new int[arr.length-count];
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                newArray[count++]=arr[i];
            }

        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] arr = {1,12,1,2,5,1,7,8,19,9,7,5,4,2,4,7};
        removeDuplicate(arr);
    }
}
