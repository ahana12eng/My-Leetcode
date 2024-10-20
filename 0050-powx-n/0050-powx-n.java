class Solution {
    public double myPow(double x, int n) {
        // Base case: when exponent is 0
        if (n == 0) {
            return 1;
        }
        
        // If n is negative, compute the reciprocal
        if (n < 0) {
            // Handle edge case where n is Integer.MIN_VALUE (-2147483648)
            if (n == Integer.MIN_VALUE) {
                x = 1 / x;
                n = Integer.MAX_VALUE;  // We increment by 1 later in the logic
                return x * myPow(x, n);
            }
            return 1 / myPow(x, -n);
        }
        
        // If n is even, use exponentiation by squaring
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else { // If n is odd
            return x * myPow(x * x, (n - 1) / 2);
        }
    }
}
