import java.lang.reflect.Array;

public class HM_05 {
    public static void main(String[] args) {
//        String s = "Перестановочный алгоритм быстрого действия";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'о') {
//                System.out.println('о');
//            }
//        }
//        String s1 = "Перевыборы выбранного президента";
//        int count = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) == 'е') count++;
//
//        }
//        System.out.println(count);
//
//        String s3 = "Посмотрите как Рите нравится ритм";
//        s3 = s3.toLowerCase();
//        int index = 0;
//        while (index != -1) {
//            index = s3.indexOf("рит", index+1);
//            if (index != -1) System.out.println(index);
//        }
//        int count2 = 0;
//        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
//        for (int i = 0; i < array.length; i++) {
//            for (String word : array[i]) {
//                if (word.indexOf("е") == -1) count2++;
//            }
//
//        }
//        System.out.println(count2);

        // --------------------- TASK 5 -----------------------------------

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for(int v : array2) {
            sum+=v;
        }
        System.out.println(sum);

        int max = array2[0];
        for(int v : array2) {
            if (v > max) max = v;
        }
        System.out.println(max);

        int min = array2[0];
        for(int v : array2) {
            if (v < min) min = v;
        }

        System.out.println(min);
        double average = 0.0;
        average = (double)sum/ array2.length;
        System.out.println(average);

        int sum2 = 0;
        max = 0;
        int count = 0;
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int[] v: array3) {
            for (int z : v) {
                sum2+=z;
                if (max < z) max = z;
                count++;
            }
        }
        System.out.println(sum2);
        System.out.println(max);
        System.out.println(count);

        // ------------------------ MEGATASK -------------------

        String badQA = "Q@QQ@#$QQAAAFF$%FFFFooorrrrr#rrEEEEEvvvvvvveeerr#@$yyyyyyoooo%%%$#onee#$%ee@@@#ee%$$#";
        String  spoiler = "$@#%";
        String goodQA = badQA.charAt(0)+"";
        for (int i = 0; i < spoiler.length(); i++) {
           String test = ""+spoiler.charAt(i);
           badQA = badQA.replace(test, "");
        }
        for (int i = 1; i < badQA.length(); i++) {
            if (badQA.charAt(i) != badQA.charAt(i-1)) goodQA+=badQA.charAt(i);
        }

        System.out.println(goodQA);

    }
}

