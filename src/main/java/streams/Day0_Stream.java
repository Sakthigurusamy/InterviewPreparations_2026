package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day0_Stream {

    public static void main(String[] args) {

        //Create Stream from Collections

        List<String> places = Arrays.asList("Rajapalayam","Srivilliputhur","Sivakasi","Sattur","Virudhunagar"); //Source

        //Intermediate Operations for transform the stream

        places.stream().
                forEach(System.out::println); //Terminal Operator to give results

        //from Arrays

        int[] door_numbers = {34,45,32,12,53,13}; //array
        IntStream intStream = Arrays.stream(door_numbers); //convert the array into streams
        intStream.forEach(System.out::println);

        //using Stream.of()
        Stream<String> streetNames = Stream.of("Perumal Sannathi Street","Kambar Street","Manimegalai Street");
        streetNames.forEach(System.out::println);

        //using Stream.generate()
        Stream<Integer> integerStream = Stream.generate( () -> 100).limit(5); //if you don't give limit it will be endless loop
        integerStream.forEach(System.out::println);

        //using Stream.iterate()

        Stream<Integer> iterateStream = Stream.iterate(5, n->n+1).limit(10); //starts from 5 and upto 10 counts i.e 5 to 11
        iterateStream.forEach(System.out::println);


    }
}
