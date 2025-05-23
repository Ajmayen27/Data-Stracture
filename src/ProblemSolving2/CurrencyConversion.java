package ProblemSolving2;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyConversion {
    public static void main(String[] args)   {

    Scanner sc = new Scanner(System.in);

   BigDecimal currency = BigDecimal.valueOf(sc.nextDouble());
//Double.parseDouble(sc.nextLine());
        NumberFormat usfromat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indformat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaformat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceformat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
       String Usformatted = usfromat.format(currency);
        System.out.println("US: "+Usformatted);
        System.out.println("India: "+indformat.format(currency));
        System.out.println("China: "+chinaformat.format(currency));
        System.out.println("France: "+franceformat.format(currency));


    }
}
