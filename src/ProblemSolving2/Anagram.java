package ProblemSolving2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean findAnagram(String a, String b){

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";

        System.out.println(findAnagram(a,b) );
    }


}
