package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");

        SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");

        Date date = format1.parse("4-Nov-2002");

        System.out.println(format2.format(date));
    }
}
