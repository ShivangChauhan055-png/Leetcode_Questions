import java.util.*;

public class Fibonacci509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // METHOD 1 --> While loop
//        int a =0;
//        int b=1;
//        int count=2;
//        while(count<=n){
//            int temp=b;
//            b=a+b;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);

        // METHOD 2 --> For loop
        int x=0;
        int y=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=x+y;
            x=y;
            y=c;
        }
        System.out.println(c);
    }
}
