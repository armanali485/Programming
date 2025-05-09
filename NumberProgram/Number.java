public class Number {
    //06-05-2025
    // 1. WAP to count digit of a Number.
    public static int countDigit(int n) 
	{
		int count=0;
		while(n!=0) 
		{
			count++;
			n/=10;
		}
		return count;
	}

    // 2. WAP to find digital sum of a digit.
    public static int digitSum(int n){
        int sum =0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    //3. WAP to reverse a Digit of Number.
    public static int reverseDigit(int n){
        int revNum=0;
        while(n!=0){
            revNum=revNum*10+n%10;
            n/=10;
        }
        return revNum;
    }



    //07-05-2025

    //4. WAP to find factorial of a number.
    public static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;

    }

    //5. WAP to calculate Power of a number.
    public static int power(int n,int pow){
        int res=1;
        for(int i=1;i<=pow;i++){
            res*=n;
        }
        return res;
    }


    //6. WAP to Check number is a perfect number or not.
    public static boolean  isPerfectNumber(int n){
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }

    //7. WAP to check weather a number is prime or not.
    public static boolean  isPrimeNumber(int n) {
        if (n <= 1) 
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //8. WAP to check a year is leap year
    public static boolean  isLeapYear(int year){
        return year%4==0 && (year%400==0 || year%100!=0);
    }
    //08-05-2025
    //9. WAP to check a number is Strong Number or Not.
    public static boolean isStrong(int n){
        int sum=0;
        int temp=n;
        while(n!=0){
            int rem = n%10;
            sum+=factorial(rem);
            n/=10;
        }
        return sum==temp;

    }

    //10. WAP to check number is neon number or not.
    public static boolean isNeon(int n){
        int squre=n*n;
        int sum =0;
        while(squre!=0){
            sum+=squre%10;
            squre/=10;
        }
        return sum==n;
    }
    //11. WAP to check a number is happy number or not.
    public static boolean  isHappy(int n){
        while(n!=1 && n!=4){
            int sum=0;
            while(n!=0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n=sum;
        }
        return n==1;
    }

    //12. WAP to check Armstrong Number.
    public static boolean IsArmStrong(int n){
        int count = countDigit(n);
        int sum=0;
        int temp=n;
        while (n!=0) {
            sum+=power(n%10, count);
            n/=10;  
        }
        return sum==temp;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is: " + (n+"").length());
        System.out.println("Number of digits in " + n + " is: " + countDigit(n));
        System.out.println("Digital sum of " + n + " is: " + Math.abs(digitSum(n)));
        System.out.println("Reverse of " + n  + " is: " + reverseDigit(n));
        System.out.println("Reverse of " + n  + " is: " + new StringBuffer(n+"").reverse());

        //07-05-2025
        System.out.println(isPerfectNumber(8));
        System.out.println(isPrimeNumber(7));
        System.out.println(isLeapYear(2400));
        System.out.println(power(2, 0));

        //08-05-2025
        System.out.println(isStrong(7));
        System.out.println(isNeon(9));
        System.out.println(IsArmStrong(1634));
        
    }
}
