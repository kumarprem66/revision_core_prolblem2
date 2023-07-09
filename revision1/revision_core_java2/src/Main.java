import problem1.EMIByReducingBalance;
import problem3.TBillDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        TBillDemo tBillDemo = new TBillDemo();
        System.out.println(tBillDemo.getMaturityDate( "91 DTB 13042023 6.35 100000"));


    }
}