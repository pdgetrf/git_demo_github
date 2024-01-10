public class PrimeNumber {
    /*
        This function checks whether a give number is a prime number
     */
    public static boolean isAPrimeNumber(long num) {  // DO NOT change the function name, return type, and parameter(s).
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
