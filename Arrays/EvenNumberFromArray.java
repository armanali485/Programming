
import java.util.Arrays;

public class EvenNumberFromArray {
	public static void evenElement(int [] a) {
		for(int i:a) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
	//WAP to copy element into another array
	public static void copyElement(int [] arr) {
		int [] newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
			
		}
		System.out.println("New array before changing"+Arrays.toString(newArr));
		newArr[3]=38;
		System.out.println("New array after changing"+Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		int[] arr= {2,4,3,6,8,5};
		copyElement(arr);
		System.out.println(Arrays.toString(arr));

	}


}
