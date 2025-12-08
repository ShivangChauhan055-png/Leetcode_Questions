package Math;

// Ques1925.java
// LeetCode 1925 : Count Square Sum Triples
// IDEA:
//  -> hume count karna h (a, b, c) such that a^2 + b^2 = c^2
//     aur 1 <= a < b < c <= n
//  -> Basically Pythagorean triples count karna h
//  -> Optimization: jese hi c > n ho -> aage check karne ki need nahi (break)
//  -> Valid triple milne par answer +2 (kyunki (a,b,c) & (b,a,c) both allowed)

public class Ques1925 {

    public int countTriples(int n) {

        int ans = 0;

        // i = a, j = b
        // loop optimized upper bound: i <= 3*n/4
        for (int i = 3; i <= 3 * n / 4; i++) {

            for (int j = i + 1; j < n; j++) {

                // calculate a^2 + b^2
                int sum = i * i + j * j;

                // find c = sqrt(a^2 + b^2)
                int c = (int) Math.sqrt(sum);

                // agar c > n ho gaya -> aage c aur bada hoga -> break
                if (c > n) break;

                // check perfect square (c*c == sum)
                if (c * c == sum) {
                    ans += 2;  // (i,j,c) and (j,i,c)
                }
            }
        }

        return ans;
    }

    // optional testing
    public static void main(String[] args) {
        Ques1925 obj = new Ques1925();

        System.out.println(obj.countTriples(5));  // output: 2
        System.out.println(obj.countTriples(10)); // example
    }
}

