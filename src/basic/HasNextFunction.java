package basic;

import java.util.Scanner;

public class HasNextFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Input here:");

        while(scanner.hasNext()){

            String input = scanner.next();
            //String newIn = input.toLowerCase();

            if(input.equals("stop")){

                break;
            }
            System.out.println(input);
        }
    scanner.close();

    }
}
