package Arrays;

import java.util.*;
public class Ques989 {
    public static void main(String[] args) {
        int[] num = {2, 7, 4};
        int k = 181;

        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;  // last digit se start kr rhe h
        int carry = 0;  // suru me koi carry nhi

        while (i >= 0 || k > 0) {
            int sum = carry;  // pehle carry ko lelo

            if (i >= 0) {
                sum += num[i--];  // num ke last se add kr rhe h, ek step left move
            }

            if (k > 0) {
                sum += k % 10;  // k ka last digit le rhe h
                k /= 10;        // k ka last digit hatate ja rhe h
            }

            ans.add(sum % 10);  // ab sirf last digit rakho (jaise 8+7=15 → 5)
            carry = sum / 10;   // carry nikalo (15 me carry=1)
        }

        if (carry > 0) {
            ans.add(carry);  // agar last me carry bch gya to usko bhi add kr do
        }

        Collections.reverse(ans);  // list ulta kr rhe h kyuki humne right se fill kiya tha

        System.out.println("Result: " + ans);  // final ans print
    }
}
