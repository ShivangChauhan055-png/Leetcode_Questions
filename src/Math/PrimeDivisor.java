package Math;

import java.util.*;

public class PrimeDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        for(int i = (int)Math.sqrt(n);i>=1;i--){
            if(n%i==0 && i!=(n/i)){
                System.out.print(n/i +" ");

            }
        }
    }
}

// use sqrt method for better optimized code