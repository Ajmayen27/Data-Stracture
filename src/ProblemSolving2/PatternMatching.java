package ProblemSolving2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Pattern: ");
        String s = in.nextLine();


        Pattern pattern = Pattern.compile("Ajmayen",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Pattern Matched");
        }
        else System.out.println("Unmatched pattern");

        
    }
}
