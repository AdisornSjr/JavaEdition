package Phase1;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        //โปรมบอกว่าเลขคู่ คี่
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your number = ");
        num = sc.nextInt();
        String result = "";
        
        //normal
        if(num%2 == 0){
            result = num+ " = Even";
        }else{
            result = num+ " = Odd";
        }
        System.out.println(result);
        
        //แบบลดรูป
        // ตัวแปร = (เงื่อนไข)? คำสั่งเมื่อเป็นจริง :คำสั่งเมื่อเป็นเท็จ
        //Ternary Operator

        result = (num%2 == 0) ? num+ " = Even" : num+ " = Odd";
        System.out.println(result);
        
    }
}
