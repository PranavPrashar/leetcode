// 204. Count Primes
class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        } // just setting the boolean array values to true, so everything will start off
          // as true

        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i; j * i < primes.length; j++) {
                    primes[i * j] = false;// if for example 2*2 = 4 so it not prime as its in the array and not a prime
                                          // so set to false
                }
            }
        }

        int primeCounter = 0;

        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                primeCounter++;
            }
        }

        return primeCounter;
    }
}
