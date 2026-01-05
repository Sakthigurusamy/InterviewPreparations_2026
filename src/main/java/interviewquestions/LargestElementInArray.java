package interviewquestions;

public class LargestElementInArray {

    public static int largestElement(int[] arr){

        int max = arr[0];

        for(int i = 0 ; i <= arr.length-1 ; i++){

            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;

    }

    public static void main(String[] args) {

        int[] arr = {20,10,40,80,30,102,60};
        System.out.println("The Largest element in the arr is: " +largestElement(arr));

        int[] arr1 = {100,101,21,22,90,211};
        System.out.println("The Largest element in the arr1 is: " +largestElement(arr1));

    }
}
