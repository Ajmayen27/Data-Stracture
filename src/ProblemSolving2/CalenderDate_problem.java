package ProblemSolving2;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class CalenderDate_problem {

    public static void findDay(int month,int day,int year){

        String[] weeksday = DateFormatSymbols.getInstance().getWeekdays();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int value = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(weeksday[value].toUpperCase());


    }

    public static void main(String[] args) {
        findDay(7,27,2000);
    }


}
