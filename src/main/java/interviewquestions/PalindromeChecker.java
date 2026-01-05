package interviewquestions;

public class PalindromeChecker {

    public static void main(String[] args) {

        //Reversed String should be matches with Original String


        String originalValue = "Malayalam";

        String reversedValue = "";

        for(int i = originalValue.length()-1; i>=0; i--){
            reversedValue += originalValue.charAt(i);
        }

        System.out.println("The Reversed Value is: " +reversedValue);

        if(reversedValue.equalsIgnoreCase(originalValue)){
            System.out.println("The " +originalValue+" is Palindrome");
        }

        else{
            System.out.println("The " +originalValue+" is not a Palindrome");
        }


    }
}
