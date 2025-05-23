package ProblemSolving2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String regex = "[ !,?._'@]+";

        String[] myStr = s.trim().split(regex);

        List<String> tokenList = new ArrayList<>();

        for(String sc : myStr){
            if(!sc.isEmpty()){
                tokenList.add(sc);
            }
        }
        System.out.println(tokenList.size());
        for (String sc: myStr){
            System.out.println(sc);
        }

    }
}
