package work;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMain1 {
    public static void main(String[] args) {
        List<Integer> arr=List.of(2,12,33,56,77,95);//immutable

//        arr.add(23); // will throw error

        List<Integer> arr1=new ArrayList<Integer>(); // mutable list
        arr1.add(12);
        arr1.add(43);
        arr1.add(35);
        arr1.add(55);
        arr1.add(122);
        arr1.add(16);
        arr1.add(68);
        arr1.add(97);
        arr1.add(12345);

        List<Integer> arr2= Arrays.asList(43,45,57,68,86,32,90);

        // checking only elements divisible by 2

        //without stream
        List<Integer> l=new ArrayList<Integer>();

        for(int i:arr){
            if (i%2 == 0) {
                l.add(i);
            }
        }
        System.out.println(l);

        //with stream

        Stream<Integer> s= arr1.stream();
        List<Integer> listeven=s.filter(i->i%2==0).collect(Collectors.toList());


        // find values greater than 20
        System.out.println(arr1.stream().filter(i->i>20).collect(Collectors.toList()));
    }
}
