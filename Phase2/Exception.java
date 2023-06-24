import java.time.chrono.IsoEra;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        //การทำงานแล้วเกิดข้อผิดพลาดจนส่งผลให้หยดทำงาน
        int a = 10,b = 20;
        int c = a/b;
        System.out.println(c);
        
        //1
        c = a/0;//exception
        System.out.println(c);

        //2
        int []item = {10,20,30};
        System.out.println(item[0]);
        System.out.println(item[100]); //exception

        //3 int
        Scanner kb = new Scanner(System.in);
        System.out.println("input = ");
        int num = kb.nextInt(); //if input letter 
        System.out.println(num); 


    }
}
