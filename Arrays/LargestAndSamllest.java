public class LargestAndSamllest {

    // WAP to print largest Number from Array.
    public static void largestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i)
                max = i;
        }
        System.out.println(max);
    }

    // WAP to print smallest number from Array.
    public static void smallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (min > i)
                min = i;
        }
        System.out.println(min);
    }

    // WAP to print 2nd largest Number from Array.
    public static void secondLargestNumber(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max1)
                max1 = i;
        }
        for (int i : arr) {
            if (i > max2 && i != max1)
                max2 = i;
        }
        System.out.println(max2);
    }

    // WAP to print 2nd smallest number from Array.
    public static void secondSmallestNumber(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min1)
                min1 = i;
        }
        for (int i : arr) {
            if (i < min2 && i != min1)
                min2 = i;
        }
        System.out.println(min2);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 8, 10, 45, 90 };
        largestNumber(arr);
        smallestNumber(arr);
        secondLargestNumber(arr);
        secondSmallestNumber(arr);
    }

}
