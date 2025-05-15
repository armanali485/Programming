public class EquilibriumPostion {

    public static int equilibriumPostion(int[] arr){
        int i=0;
        int j=arr.length-1;
        int leftSum=0;
        int rightSum=0;
        while(j>i){
            if(leftSum<rightSum){
                leftSum+=arr[i++];
            }
            else{
                rightSum+=arr[j--];
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,18,4,6,1,8,1,10};
        System.out.println(equilibriumPostion(arr));
    }
    
}
