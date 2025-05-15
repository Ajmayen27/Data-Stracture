package Data_Structures.Data_Structures;

import java.util.Arrays;

public class TheArray {

    public static void main(String[] args) {

        String[] cars = new String[5];

        cars[0] = "BMW";
        cars[1] = "Ferrari";
        cars[2] = "Audi";

        System.out.println(cars.length);

        for(int i = 0;i < cars.length;i++){
            System.out.println(cars[i]);
        }

        System.out.println(" ");

        for(int i = cars.length-1;i >= 0;i--){
            System.out.println(cars[i]);
        }

        System.out.println(" ");

        for(String car : cars){
            System.out.println(car);
        }

        System.out.println(" ");

        Arrays.stream(cars).forEach(System.out::println);

        int[] nums = {1,22,3,4,66,7};

        System.out.println(Arrays.toString(nums));

        System.out.println(" ");

        Arrays.stream(nums).forEach(System.out::println);
    }
}
