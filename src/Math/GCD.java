package Math;

import java.util.*;

// SIMPLE BRUTE FORCE APPROACH
// TC--> O(min(n1,n2))
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int hcf=1;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        for(int i =1;i<=Math.min(n1,n2);i++){
//            if(n1%i==0 && n2%i==0){
//                hcf=i;
//            }
//        }
//        System.out.println(hcf);

        // Better Approach
        // Use Euclidean Algorithm i.e.
        // gcd(a,b) = gcd(a-b,b) where a>b
        // best formula : gcd(a,b) = gcd(a%b,b)

        while (n1>0 && n2>0){
            if(n1>n2){
                n1= n1%n2;
            }else{
                n2 = n2%n1;
            }
        }
        if(n1==0) System.out.println(n2);
        else System.out.println(n1);

    }
}
