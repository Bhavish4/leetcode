class Solution {
    public int maxProduct(int n) {
        int lar = 0, sLar = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > lar) {
                sLar = lar;
                lar = digit;
            } else if (digit > sLar) {
                sLar = digit;
            }

            n /= 10;
        }

        return lar * sLar;
    }
}