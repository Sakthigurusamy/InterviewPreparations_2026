package interviewquestions;

import java.util.Scanner;

public class ReverseWordInString {

    static void reverseWordsInSentence(String inputString){

        String[] words = inputString.split(" ");
        StringBuilder resultString = new StringBuilder();

        for(String word:words){
            StringBuilder reverse = new StringBuilder(word).reverse();
            resultString.append(reverse).append(" ");
        }

        System.out.println("The Original Sentence is: " +inputString);
        System.out.println("Reversed words in Sentence is: " +resultString.toString().trim());





    }

    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to reverse ");
        str = scanner.nextLine();
        reverseWordsInSentence(str);
    }
}
