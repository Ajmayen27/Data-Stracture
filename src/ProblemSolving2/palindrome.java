package ProblemSolving2;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverseStr = "";

        int strlength = s.length();

        for(int i = strlength-1; i>=0; i--) {
            reverseStr = reverseStr + s.charAt(i);
        }
        if(s.equals(reverseStr)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
