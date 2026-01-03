package streams;

import org.w3c.dom.ls.LSException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day0_StreamOperations {

    public static void main(String[] args) {

        //Intermediate Operations
        //map -> transform each element like toUppercase, lowercase etc...

        List<String> family = Arrays.asList("Sakthi","Anand","Abi","Haritha");
        List<String> upperCaseNames = family.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("UpperCase Names: " +upperCaseNames);

        //filter - filtering based on the conditions
        List<String> filterbyAAlphabet = family.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println("Filtered Names: " +filterbyAAlphabet);

        //distinct - no duplicates

        List<String> cityNames = Arrays.asList("Chennai","Coimbatore","Madurai","Madurai","Trichy","Hyderabad");
        List<String> distinctCityNames = cityNames.stream().distinct().collect(Collectors.toList());
        System.out.println("City Names: " +distinctCityNames);

        //sorted

        List<String> sortedCityNames = cityNames.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted City Names: " +sortedCityNames);



    }
}
