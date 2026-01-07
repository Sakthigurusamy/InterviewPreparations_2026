package interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,2,4,3,1,4,7,8,8,7,9,10};

        //Put it into HashSet

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(numbers));

        Integer[] withoutDuplicate = hashSet.toArray(new Integer[0]);

        System.out.println(Arrays.toString(withoutDuplicate));
    }





}
