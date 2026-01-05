package interviewquestions;

public class SwappingNumbers {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        System.out.println("Before Swapping Numbers:"+"A:" +a+ " B:"+b);
        //Method 1 : using 3rd variable

        /*int temp = 0;

        temp = a ;
        a = b;
        b = temp;


        System.out.println("After Swapping Numbers using third variable:"+"A: " +a+ " B:" +b);

        //without using 3rd variable

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping Numbers without using third variable(Arithmetic) :"+"A: " +a+ " B:" +b);*/

        //XOR Operation

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping Numbers without using third variable(XOR Operation) :"+"A: " +a+ " B:" +b);
    }
}
