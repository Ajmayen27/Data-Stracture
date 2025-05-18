package Data_Structures.Data_Structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class TheList {

    public static void main(String[] args) {

        List<String> list = new ArrayList();

        list.add("Ajmayen");
        list.add("Sakib");
        list.add("Samantha");
        list.add("Sabbir");

        System.out.println(list);

        for(String name : list){
            System.out.println(name);
        }

        Arrays.stream(list.toArray()).forEach(System.out::println);

        list.remove("Samantha");
        Arrays.stream(list.toArray()).forEach(System.out::println);

        System.out.println(list.contains("Ajmayen"));
        System.out.println(list.contains("Samantha"));
        System.out.println(list.size());

    }
}
