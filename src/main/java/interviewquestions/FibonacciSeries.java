package interviewquestions;

import java.net.SocketImpl;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        //0,1,2,3,5,8 sum of prev two numbers

        int num;

        int a = 0, b = 1;
        //System.out.println(a + " " +b);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range to generate Fibonacci Series.");
        num = scanner.nextInt();

        System.out.print(a + " " +b +" ");
        for(int i = 2; i< num;i++){

            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

          scanner.close();

    }
}
