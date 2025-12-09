package Arrays;

// Ques3583.java
// LeetCode 3583 : Special Triplets
//
// IDEA (Easy Language):
// Hum array ko left se right process karenge.
// Aur 3 cheeze track karenge:
//
// 1) m[x]       -> ab tak x kitni baar aaya (frequency)
// 2) duplets[x] -> kitne (a,b) pairs already exist jo future me
//                  c == x ke saath valid triplet bana sakte hain
// 3) res        -> final triplets count
//
// Flow:
// Jab current number = x
// 1) res me add karo duplets[x]
//      -> matlab jitne purane pairs the jinke liye x valid tha,
//         ab wo complete triplet ban gaye.
//
// 2) t = 2 * x
//    duplets[t] += m[t]
//      -> matlab future me agar c = t aaye,
//         to (t, x) bhi ek valid pair hoga, count store kar lo.
//
// 3) m[x]++
//      -> x ek baar aur aa gaya (frequency update)
//
// 💡 Important pattern:
//    res += duplets[x]
//    duplets[2*x] += m[2*x]
//    m[x]++
//
// Time Complexity: O(n)
// Space Complexity: O(max_value)
//

public class Ques3583 {

    public int specialTriplets(int[] nums) {

        final int MOD = 1_000_000_007;
        final int MAX = 100001;

        // m[x] = frequency array (x kitni baar aaya)
        int[] m = new int[MAX];

        // duplets[x] = valid (a,b) pairs jinke liye target c = x hoga
        int[] duplets = new int[MAX];

        long res = 0;  // total triplets count (long kyunki add hota rahega)

        // process every number left → right
        for (int x : nums) {

            // Step 1: jitne duplets x ke liye ready the, wo ab full triplet ban gaye
            res = (res + duplets[x]) % MOD;

            // Step 2: ab x future ke pairs me contribute karega
            int t = x * 2;

            // t array size se chhota hona chahiye
            if (t < MAX) {
                // jitne t pehle aaya tha -> (t, x) ek new valid pair
                duplets[t] = (duplets[t] + m[t]) % MOD;
            }

            // Step 3: frequency update
            m[x]++;
        }

        return (int) res;
    }

    // Optional testing
    public static void main(String[] args) {
        Ques3583 obj = new Ques3583();
        System.out.println(obj.specialTriplets(new int[]{8,4,2,8,4}));
        // Just for testing
    }
}

