package interviewquestions;

import java.util.Scanner;

public class SumOfDigits {

    public static int sum(int number){
        int total = 0;
        while (number > 0){
            total = total + (number % 10);
            number = number / 10;
        }
        return total;
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find Sum of Digits: ");
        num = sc.nextInt();
        System.out.println(sum(num));



    }
}
