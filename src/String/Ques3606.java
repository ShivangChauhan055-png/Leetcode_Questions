package String;

// Ques3606.java
//
// IDEA (Simple Language):
// Hume valid coupons return karne hain based on rules:
//
// 1) Coupon code empty nahi hona chahiye
// 2) Coupon code me sirf:
//      - letters (a-z, A-Z)
//      - digits (0-9)
//      - underscore (_)
//    allowed hain
// 3) Coupon active hona chahiye (isActive[i] == true)
// 4) Business line ke according order maintain karna hai:
//      electronics -> grocery -> pharmacy -> restaurant
// 5) Har business line ke coupons ko alphabetically sort karna hai
//
// Final answer = saare sorted coupons ek list me (fixed order me)

import java.util.*;

public class Ques3606 {

    public List<String> validateCoupons(String[] code,
                                        String[] businessLine,
                                        boolean[] isActive) {

        // Final answer list
        List<String> result = new ArrayList<>();

        // Alag-alag business lines ke liye alag lists
        List<String> electronics = new ArrayList<>();
        List<String> grocery = new ArrayList<>();
        List<String> pharmacy = new ArrayList<>();
        List<String> restaurant = new ArrayList<>();

        // Har coupon ko check karenge
        for (int i = 0; i < code.length; i++) {

            String cur = code[i];

            // Rule 1: empty code allowed nahi
            if (cur.isEmpty()) continue;

            // Rule 2: code validation (sirf letter, digit, underscore)
            if (!stringCheck(cur)) continue;

            // Rule 3: coupon active hona chahiye
            if (!isActive[i]) continue;

            // Rule 4: business line ke hisaab se add karo
            if (businessLine[i].equals("electronics")) {
                electronics.add(cur);
            } else if (businessLine[i].equals("grocery")) {
                grocery.add(cur);
            } else if (businessLine[i].equals("pharmacy")) {
                pharmacy.add(cur);
            } else if (businessLine[i].equals("restaurant")) {
                restaurant.add(cur);
            }
        }

        // Rule 5: har list ko alphabetically sort karo
        Collections.sort(electronics);
        Collections.sort(grocery);
        Collections.sort(pharmacy);
        Collections.sort(restaurant);

        // Final order me add karo
        result.addAll(electronics);
        result.addAll(grocery);
        result.addAll(pharmacy);
        result.addAll(restaurant);

        return result;
    }

    // --------------------------------------------------
    // Helper method: coupon string valid hai ya nahi
    // --------------------------------------------------
    // Allowed characters:
    //  - letters
    //  - digits
    //  - underscore (_)
    //
    public boolean stringCheck(String cur) {

        for (char c : cur.toCharArray()) {

            // agar character allowed nahi hai -> invalid
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                return false;
            }
        }

        return true; // saare characters valid hain
    }

    // Optional testing
    public static void main(String[] args) {

        Ques3606 obj = new Ques3606();

        String[] code = {"SAVE_10", "DISC@20", "MED50", "", "FOOD_5"};
        String[] business = {"electronics", "electronics", "pharmacy", "grocery", "restaurant"};
        boolean[] active = {true, true, true, true, false};

        System.out.println(obj.validateCoupons(code, business, active));
        // Output example: [SAVE_10, MED50]
    }
}

