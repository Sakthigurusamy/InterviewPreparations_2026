package interviewquestions;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static boolean primeorNotChecker(int number){

        if(number <=1){
            return false;
        }

        for(int i = 2; i<=Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;




    }


    public static void main(String[] args) {
        //Prime Number checker
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find Prime number or not:");
        number = sc.nextInt();
        System.out.println(primeorNotChecker(number));

    }
}
