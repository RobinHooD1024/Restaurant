public class Paicoin {
    public static void main(String[] args) {

            long x = 3523;
            long y = 46976;
            double z;
            int c = 0;
            long v = 0;
            long diff = 1430;
            long newDiff = 1430;


            for (int i = 1; i<=45;i++) {
                z = Round.round(1.0*x/y*100, 2);
                c = (int) (z*720/100);                    //количество выигрышных тикетов
//                v = (c*(diff+180))/newDiff;                    //количество тикетов которые мы купим
//                if (newDiff<300) {v = 1400;}
                x=x-c+v;
                y=y-720+v;
                diff=newDiff;
                newDiff=(newDiff*y*y)/((y+720-v)*42240);
                System.out.println(i+" день: наша доля "+z+"%, мы выиграли "+c+", купили "+v+", общее количество: "+x+", всего тикетов: "+y+", новая сложка "+newDiff);
        }
    }
}
