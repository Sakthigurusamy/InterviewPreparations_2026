package interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        //using Set

        int[] number = {10,1,2,1,2,1,3,4,5,3,4,5,6,7,9,8};

        //Create Set
        Set<Integer> integers = new HashSet<>();

        for(int num:number){
            integers.add(num);
        }

        //resultSet creation
        int[] resultSet = new int[integers.size()];

        int i = 0;

        for(int num: integers){
            resultSet[i++] = num;
        }

        System.out.println(Arrays.toString(resultSet));

        //using Streams

        int[] number_1 = {1,2,3,4,5,6,2,4,3,1,4,7,8,8,7,9,10};

        int[] withoutDuplicateUsingStream = Arrays.stream(number_1).distinct().toArray();
        System.out.println(Arrays.toString(withoutDuplicateUsingStream));
    }





}
