package interviewquestions;

import java.util.Scanner;

public class ExtractOnlyDigitsFromAlphaNumeric {

    static void usingRegexApproach(String inputString){

        System.out.println(inputString.replaceAll("[^0-9]",""));
    }

    static void charIsDigit(String inputString){
        StringBuilder result = new StringBuilder();

        for(char ch : inputString.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }


    public static void main(String[] args) {

        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphanumeric String");
        str = sc.nextLine();
        usingRegexApproach(str);
        charIsDigit(str);

    }
}
