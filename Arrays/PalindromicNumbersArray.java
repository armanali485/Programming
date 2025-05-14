import java.util.Arrays;

public class PalindromicNumbersArray {

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        
        return temp == rev;
    }

    public static int countPalindromicNumbers(int[] arr){
        int count = 0;
        
        for (int num : arr) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }

    public static int[] findPalindromicNumbers(int[] arr) {
        int[] temp = new int[countPalindromicNumbers(arr)];
        if(temp.length==0)
            return temp;
        int i=0;
        for (int num : arr) {
            if (isPalindrome(num)) {
                temp[i++]=num;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {121, 123, 1331, 456, 787, 1001, 12321, 45654, 789};
        int[] palindromes = findPalindromicNumbers(arr);
        
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Palindromic numbers: " + Arrays.toString(palindromes));
    }
}