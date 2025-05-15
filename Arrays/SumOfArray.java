

public class SumOfArray {

	//1. add all elements of arrays in sum
	public static int Sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	//using for each 
	public static int sum2(int [] a) {
		int sum=0;
		for(int s:a) {
			sum+=s;
		}
		return sum;
	}
	public static void main(String[] args) {
		int [] arr= {2,4,3,2,8};
		System.out.println(sum2(arr));

	}

}