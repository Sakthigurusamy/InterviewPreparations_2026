package interviewquestions;
import java.util.Scanner;

public class Factorial {

   public static int fact(int number){

       if(number == 0)
           return 1;
       return number*fact(number - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find factorial: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
