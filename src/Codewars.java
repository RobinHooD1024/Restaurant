import java.util.Arrays;
import java.util.Scanner;

public class Codewars {



    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int sum = 0;
        while(key.hasNextInt())
        {
            sum+= key.nextInt();
        }
        System.out.println(sum);
    }
}
