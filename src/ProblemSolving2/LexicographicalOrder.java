package ProblemSolving2;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LexicographicalOrder {


    public static void main(String[] args) {

        String s = "welcometojava";

        int k = 3;

        String smallest = "";
        String largest = "";


        ArrayList<String> alphabet = new ArrayList<String>();



            for(int i = 0; i <= s.length()-k; i++){
                alphabet.add(s.substring(i, i + k));

            }

            java.util.Collections.sort(alphabet);

             smallest = alphabet.get(0);
             largest = alphabet.get(alphabet.size()-1);

            System.out.print(smallest+"\n"+largest);




    }
}
