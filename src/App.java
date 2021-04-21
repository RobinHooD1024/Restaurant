import java.util.Arrays;

public class App {
    public static String winner(Fighter x, Fighter y, String fistRound) {

        int count1 = 0;
        int count2 = 0;
        while (y.health > 0) {
            y.health = y.health - x.damagePerAttack;
           count1++;
        }

        while (x.health > 0) {
            x.health = x.health - y.damagePerAttack;
            count2++;
        }
        if (fistRound.equals(x.name)) {
            count1-=1;
        }
        else {
            count2-=1;
        }
    if (count1<count2) return x.name;
    else return y.name;


    }



    public static void main(String[] args) {
        Fighter bruceLee = new Fighter("BruceLee", 20, 4);
        Fighter muhammedAli = new Fighter("MuhammedAli", 15, 12);

        System.out.println(winner(bruceLee, muhammedAli, "BruceLee"));

        Subjects java = new Subjects("Java", "SergeyD", 15);
        Subjects theory = new Subjects("QA theory", "Anton Alexandrov", 10);

        Student andreyTeterin = new Student("Andrey", "Teterin", 104, java);

        andreyTeterin.studentDetails();
        theory.subjectDetails();



    }
}
