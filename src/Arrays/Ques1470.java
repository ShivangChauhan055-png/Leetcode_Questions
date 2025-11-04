package Arrays;
import java.util.*;

public class Ques1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n =3;
        int[] ans=new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[2*i]=nums[i];  // even index-first half(x part)
            ans[2*i+1]=nums[i+n]; // odd index-second half(y part)
        }
        System.out.println(Arrays.toString(ans));
    }
}

