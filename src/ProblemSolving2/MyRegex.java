package ProblemSolving2;

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class MyRegex {
    public static void main(String[] args) {
        boolean isDone = true;
        boolean isNotDone = false;
        Scanner in = new Scanner(System.in);

        try {
            String ip = in.nextLine();

            String regex = "[\\.]";

            String[] myArray = ip.split(regex);

            int A = Integer.parseInt(myArray[0]);
            int B = Integer.parseInt(myArray[1]);
            int C = Integer.parseInt(myArray[2]);
            int D = Integer.parseInt(myArray[3]);

            if (myArray.length == 4) {
                if (A <= 255 && B <= 255 && C <= 255 && D <= 255) {
                    System.out.println(isDone);
                } else System.out.println(isNotDone);
            } else System.out.println(isNotDone);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }

    }
}
