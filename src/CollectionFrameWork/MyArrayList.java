package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<>();
        ArrayList<String> myStringArray = new ArrayList<>();

        myStringArray.add("Ajmayen");
        myStringArray.add("Zukurburg");
        myStringArray.add("Robin");
        myStringArray.add("Ellon Musk");


        for(String name : myStringArray){
            System.out.println(name);
        }
        Collections.sort(myStringArray);
        System.out.println(myStringArray);

        myArray.add(1);
        myArray.add(5);
        myArray.add(-9);
        myArray.add(4);

        System.out.println(myArray);

        Collections.sort(myArray);

        System.out.println(myArray);

        myArray.set(2,9);
        System.out.println(myArray);

        myArray.add(3,8);
        System.out.println( myArray.size());
        System.out.println(myArray);
        myArray.remove(2);
        System.out.println(myArray) ;

//        for(Integer element:myArray){
//            System.out.println(element);
//        }

        Iterator<Integer> item = myArray.iterator();

        while(item.hasNext()){
            System.out.println(item.next());
        }
    }
}
