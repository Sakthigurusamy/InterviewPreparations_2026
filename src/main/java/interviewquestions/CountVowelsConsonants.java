package interviewquestions;



public class CountVowelsConsonants {

    public static int VowelsConsonants(String inputString){

        int vowelCount = 0;

        for(int i = 0 ; i<=inputString.length()-1 ; i++){
            if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i'
            || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u' || inputString.charAt(i) == 'A'
            || inputString.charAt(i) == 'E' || inputString.charAt(i) == 'I' || inputString.charAt(i) == 'O'
            || inputString.charAt(i) == 'U' ){
                vowelCount++;
            }
        }
        return vowelCount;




    }

    public static void main(String[] args) {

        String str = "aEiOu";

        System.out.println("The Number of vowels and Constants in the given string is: " +VowelsConsonants(str));
    }
}
