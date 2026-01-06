package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurenceCount {

    public static void charOcccurence(String str){

        Map<Character,Integer> countCharacters = new HashMap<>();
        char[] charArray = str.toCharArray();

        for(char c: charArray){
            if(!countCharacters.containsKey(c)){
                countCharacters.put(c,1); //
            }
            else{
                int values = countCharacters.get(c);
                countCharacters.put(c,values + 1);
            }
        }
        System.out.println(countCharacters);

    }

    public static void main(String[] args) {

        String str = "rajapalayam";
        charOcccurence(str);
    }

}
