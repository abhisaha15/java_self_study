package work;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//stream is a interface
public class streamobject {
    public static void main(String[] args) {
        Stream<Object> s=Stream.empty();
        s.forEach(e->{
            System.out.println(e);
        });

        String[] arr={"Abhi","Abhishek","John","Williams"};
        Stream<String> s1=Stream.of(arr);
        s1.forEach(i->{
            System.out.println(i);
        });

        // using builder method
        Stream<Object> sb=Stream.builder().build();

        //Using Arrays

        IntStream stream= Arrays.stream(new int[]{12,45,67,32,88,89,950});
        DoubleStream stream1= Arrays.stream(new double[]{12,45,67,32,8.8,89,950});

        stream1.forEach(i->{
            System.out.println(i);
        });


    }
}
