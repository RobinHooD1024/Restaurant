package cars;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Stat {
    public static String secondsToString(int x){
        String result;
        int hh = x/3600;
        int mm = (x-hh*3600)/60;
        int ss = x-hh*3600-mm*60;
        DecimalFormat formatter = new DecimalFormat("00");
        String hhStr = formatter.format(hh);
        String mmStr = formatter.format(mm);
        String ssStr = formatter.format(ss);
        result = hhStr+"|"+mmStr+"|"+ssStr;
        return result;
    }

    public static String stat(String strg) {
        String[] results = strg.split(", ");
        int[] time = new int[results.length];
        for (int i = 0; i < results.length; i++) {
            String[] timeStr = results[i].split("\\|");
            time[i] = Integer.parseInt(timeStr[0])*3600 + Integer.parseInt(timeStr[1])*60 + Integer.parseInt(timeStr[2]);
            }
        int maxTime = Integer.MIN_VALUE;
        int minTime = Integer.MAX_VALUE;
        for (int t : time) {
            if (t < minTime) minTime = t;
            if (t > maxTime) maxTime = t;
        }
        int range = maxTime-minTime;
        int mean = 0;
        int median = 0;
        for (int t : time) {
            mean+=t;
        }
        mean = mean/time.length;

        Arrays.sort(time);
        if (time.length%2 == 0) {
            median = (time[time.length/2-1] + time[time.length/2])/2;
        } else {
            median = time[time.length/2];
        }

        String rangeStr = secondsToString(range);
        String meanStr = secondsToString(mean);
        String medianStr = secondsToString(median);

        return "Range: "+rangeStr+" Average: "+meanStr+" Median: "+medianStr;
        }


}
