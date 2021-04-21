package takeout.utils;


import java.text.DecimalFormat;

import static takeout.utils.PrintUtil.CommonPrintMethod.*;

public class PrintUtil {

    private final static String LINE = "-------------------------------------------------------";

    public static class CommonPrintMethod {

        public static void print(String text) {
            System.out.print(text);
        }

        public static void println() {
            System.out.println();
        }

        public static void printLine() {
            println();
            print(LINE);
        }

    }

   public static class PrintTitles {
       public static void printMenuTitle() {
           println();
           println();
           print("_____________________ Take Out Menu ____________________");
           println();
           println();

       }

       public static void printMainDishesTitle() {
           print("Our Best Main Dishes");
           println();
           println();
       }

       public static void printSidesTitle() {
           print("Our Healthy Sides");
           println();
           println();
       }

       public static void printDrinksTitle() {
           print("Drinks");
           println();
           println();
       }

       public static void printPrice(double price) {
           DecimalFormat df = new DecimalFormat("#.00");
           if(price < 10) {
               print("$ " + df.format(price));
           } else {
               print("$" + df.format(price));
           }


       }



       public static void printSpaces (String first) {
           int n = 50-first.length();
           for (int i = 0; i < n; i++) {
               print(" ");
           }

       }
   }



}
