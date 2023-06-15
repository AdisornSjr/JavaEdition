package Phase1;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int Maxnum = 0,Minnum = Integer.MAX_VALUE; // ค่า Max มาเลย
        while(true){
            System.out.println("input number = ");
            int Number = num.nextInt();
            if(Number<=0) break;
            if(Number > Maxnum) Maxnum = Number;
            if(Number < Minnum) Minnum = Number;

            
        }
        System.out.println("Max is = "+Maxnum);
        System.out.println("Min is = "+Minnum);
    }
}
