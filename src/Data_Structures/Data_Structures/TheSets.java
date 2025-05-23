package Data_Structures.Data_Structures;

import java.util.HashSet;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {

        Set<ball> balls = new HashSet<>();
        balls.add(new ball("Yellow"));
        balls.add(new ball("Red"));
        balls.add(new ball("Blue"));
        balls.add(new ball("Green"));
        balls.remove(new ball("Red"));

        balls.forEach(System.out::println);
        System.out.println(balls.size());


    }

    public static record ball(String color){}
}
