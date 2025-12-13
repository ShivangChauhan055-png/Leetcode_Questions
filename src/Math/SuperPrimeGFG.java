package Math;

// SuperPrimeGFG.java
//
// Problem: Super Primes (GFG)
//
// Definition (Simple Language):
// 1) Number khud prime hona chahiye
// 2) Number = (prime + prime)
//
// Important Observation (TLE fix):
// Har super prime p (p >= 5) ko aise likh sakte hain:
//      p = 2 + (p - 2)
// Kyunki 2 hamesha prime hota hai,
// bas ye check karna hai:
//      p prime hai AND (p - 2) prime hai
//
// Isse nested loop hat jaata hai
// aur Time Complexity O(N log log N) ho jaati hai

class SuperPrimeGFG {

    int superPrimes(int n) {

        // ---------- Step 1: Sieve of Eratosthenes ----------
        // isPrime[i] = true -> i prime hai
        boolean[] isPrime = new boolean[n + 1];

        // initially 2 se n tak sabko prime maan lo
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // sieve logic
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // i ke multiples prime nahi honge
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // ---------- Step 2: Count Super Primes ----------
        int count = 0;

        // smallest super prime = 5 (2 + 3)
        for (int p = 5; p <= n; p++) {
            // p prime ho AND (p - 2) bhi prime ho
            if (isPrime[p] && isPrime[p - 2]) {
                count++;
            }
        }

        return count;
    }

    // ---------- Optional main for local testing ----------
    public static void main(String[] args) {
        SuperPrimeGFG obj = new SuperPrimeGFG();

        System.out.println(obj.superPrimes(5));   // Output: 1
        System.out.println(obj.superPrimes(10));  // Output: 2
        System.out.println(obj.superPrimes(50));  // Test
    }
}

