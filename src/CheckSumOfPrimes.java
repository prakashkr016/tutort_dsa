public class CheckSumOfPrimes {
    public static void main(String[] args) {
        int num = 31;
        checkSumOfPrime(num);
    }

    static void checkSumOfPrime(int num) {
        int num1, num2;
        for (num1 = 2; num1 <= (num / 2); num1++) {
            num2 = num - num1;
            if (checkPrime(num1))
                if (checkPrime(num2))
                    System.out.println(num + ": sum of primes " + num1 + " + " + num2);
        }
    }

    static boolean checkPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        else if (num == 2)
            return true;
        else if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
