package Phase1;
import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        //คล้ายๆ if แต่เลือกออกมาทำงานโดยนำค่ามากำหนดเป็นทางเลือกผ่าย case
        //break จะทำให้ program กระโดดออกไปทำงานนอกคำสั้ง switch ถ้าไม่มีก็จะทำไปเรื่อยๆจนจบ
        System.out.print("Input number of month = ");
        Scanner mon = new Scanner(System.in);
        int num = mon.nextInt();
        String name;
        switch(num){
            case 1: name = "jan";
                break;
            case 2: name = "feb";
                break;
            default: name = "error";
        }

        System.out.println(name);

    }   

}
