package HW10;

import java.lang.reflect.Array;

public class MonthUtils {
    public static Month JAN = new Month("January", 31, 24);
    public static Month FEB = new Month("February", 28, 22);
    public static Month MAR = new Month("March", 31, 23);
    public static Month APR = new Month("April", 30, 21);
    public static Month MAY = new Month("May", 31, 24);
    public static Month JUN = new Month("June", 30, 20);
    public static Month JUL = new Month("July", 31, 19);
    public static Month AUG = new Month("August", 31, 24);
    public static Month SEP = new Month("September", 28, 22);
    public static Month OCT = new Month("October", 31, 23);
    public static Month NOV = new Month("November", 30, 21);
    public static Month DEC = new Month("December", 31, 24);


    public static Month[] firstQuarter = {JAN, FEB,MAR};
    public static Month[] secondQuarter = {APR, MAY,JUN};
    public static Month[] thirdQuarter = {JUL, AUG, SEP};
    public static Month[] fourthQuarter = {OCT, NOV, DEC};


    public static Month[] getFirstQuarter() {
        return firstQuarter;
    }

    public static Month[] getSecondQuarter() {
        return secondQuarter;
    }

    public static Month[] getThirdQuarter() {
        return thirdQuarter;
    }

    public static Month[] getFourthQuarter() {
        return fourthQuarter;
    }

    public static Month[] getYear() {
        Month[] year = new Month[firstQuarter.length+secondQuarter.length+ thirdQuarter.length+ fourthQuarter.length];
        int i = 0;
        for (Month m:firstQuarter) {
            year[i] = m;
            i++;
        }
        for (Month m:secondQuarter) {
            year[i] = m;
            i++;
        }
        for (Month m:thirdQuarter) {
            year[i] = m;
            i++;
        }
        for (Month m:fourthQuarter) {
            year[i] = m;
            i++;
        }
        return year;
    }



}
