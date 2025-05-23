package ProblemSolving2;

import java.util.Scanner;

public class substring1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        int l1 = A.length();
        int l2 = B.length();
        System.out.println(l1+l2);

        char CA = A.charAt(0);
        char CB = B.charAt(0);
        if(CA > CB){
            System.out.println("Yes");
        }
        else System.out.println("No");

        String A1 = A.substring(0,1).toUpperCase();
        String A2 = A.substring(1);


        String B1 = B.substring(0,1).toUpperCase();
        String B2 = B.substring(1);
        System.out.println(A1+A2+" "+B1+B2);



    }
}
