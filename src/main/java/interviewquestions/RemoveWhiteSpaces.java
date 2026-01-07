package interviewquestions;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    static void usingRegex(String inputString){

        System.out.println(inputString.replaceAll("\\s+",""));
    }

    static void usingManually(String inputString){
        StringBuilder result = new StringBuilder();

        for(char ch : inputString.toCharArray()){
            if(!Character.isWhitespace(ch)){
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {

        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String with spaces");
        str = sc.nextLine();
        usingRegex(str);
        usingManually(str);
    }
}
