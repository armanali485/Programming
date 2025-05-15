

import java.util.Arrays;

class SortArray{
    public static void sortAccendingOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[j]=arr[j]+arr[i]-(arr[i]=arr[j]);
                }
            }
        }
    }
    public static void sortDecendingOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    arr[j]=arr[j]+arr[i]-(arr[i]=arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,25,7,1,89,5};
        sortAccendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }

}