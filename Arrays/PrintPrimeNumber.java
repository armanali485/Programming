public class PrintPrimeNumber {

    public static boolean isPrime(int n){
        if (n <= 1) 
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i+=2) 
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeNumber(int[] arr){
        for(int i : arr){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,7,9,3,2,5,10,11};
        printPrimeNumber(arr);
    }
}
