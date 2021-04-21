import java.util.Arrays;

public class Intview {
    public static int[] sec(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            int min;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j + 1] < arr[j]) {
                    min = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = min;
                }
            }
        }
        return new int[]{arr[1], arr[arr.length-2]};
    }


    public static void main(String[] args) {
        int[] a = {100, 150, 125, 200, 90, 300, 50};
        System.out.println(Arrays.toString(sec(a)));

    }
}