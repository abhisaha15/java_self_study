package work;

import java.util.List;
import java.util.stream.Collectors;

public class methods {
    public static void main(String[] args) {
         //filter(Predicate)= boolean value function
        // Predicate is an interface


        // map each element function
        List<String> names=List.of("Abhi","Abhishek","John","Williams");
        List<String> newname=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newname);

        List<Integer> num=List.of(22,12,34,56,7,9,3);
        List<Integer> newnum=num.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newnum);

        newname.stream().forEach(System.out::println);

        newnum.stream().sorted().forEach(System.out::println);

        Integer maximum=num.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Maximum "+maximum);

        Integer minimum=num.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Maximum "+minimum);

//        newnum.stream().toArray();
//        System.out.println(newnum);
//        System.out.println(newnum.getClass().isArray());

    }
}
