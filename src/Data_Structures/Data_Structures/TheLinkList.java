package Data_Structures.Data_Structures;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkList  {

    public static void main(String[] args) {

        LinkedList<person> linkedlist = new LinkedList<>();
        linkedlist.add(new person("Ajmayen",25));
        linkedlist.add(new person("Mary",30));
        linkedlist.add(new person("joy",35));

        ListIterator<person> listIterator = linkedlist.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

    public static record person(String name, int age) {}
}
