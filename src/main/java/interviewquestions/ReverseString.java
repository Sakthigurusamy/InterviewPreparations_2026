package interviewquestions;

public class ReverseString {

    public static void main(String[] args) {

        //using StringBuilder

        StringBuffer originalString = new StringBuffer("Sakthigurusamy");

        System.out.println("Reversed String is: " +originalString.reverse());

        //using for loop

        String original = "Sakthigurusamy";
        String reversed = "";

        for (int i = original.length() - 1; i>=0; i--)
        {
            reversed = reversed + original.charAt(i);
        }
        System.out.println("The reversed String using loop is: " +reversed);
    }
}
