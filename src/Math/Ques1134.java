package Math;

import java.util.Scanner;

public class Ques1134 {
    public static void main(String[] args) {
        // find armstrong number --> sum of cubes of its digits equal to the number itself

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum=sum+(rem*rem*rem);
            n/=10;
        }
        if(sum==original){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
