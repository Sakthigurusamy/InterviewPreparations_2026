package interviewquestions;

public class SmallestElementInArray {

    public static int smallestElementFinder(int[] arr){

        int min = arr[0];

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {10,210,12,11,9,1};
        System.out.println("The Smallest Element in the Array is: " +smallestElementFinder(arr));

        int[] arr1 = {100,90,20,78,12,122};
        System.out.println("The Smallest Element in the Array1 is: " +smallestElementFinder(arr1));

    }
}
