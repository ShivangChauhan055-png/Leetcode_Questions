package Math;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while (n>0){
            int rem = n%10;
            count+=1;
            n/=10;
        }
        System.out.println(count);
    }
}


// time complexity is O(log10(n))
