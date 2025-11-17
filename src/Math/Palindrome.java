package Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original=n;
        int number =0;
        while (n!=0){
            int rem = n%10;
            number= number*10+rem;
            n/=10;
        }
        if(number==original){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
