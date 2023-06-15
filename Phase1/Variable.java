package Phase1;
import java.util.zip.CRC32C;

public class Variable { //การนิยามตัวแปร
    public static void main(String[] args) {
        //Global variable
        int sum;
        boolean status;
        char alphabet;
        float sum2;
        {
            double sum3; //local variable
        }

        //ระบุค่าเริ่มต้น
        sum = 2;
        System.out.println(sum);
        float count = 20.5f; //ใส่ f ต่อท้าย

        //หลายบรรทัด
        int a = 0 , b = 1 , c=0;
        sum = 3; //เปลี่ยนค่า

        System.out.println(sum);
        System.out.println(a);
        System.out.println("ค่าตัวเลข 1 = "+a); //ต่อกัน output "ค่าตัวเลข 1 = 0"

        //การนิยามค่าคงที่ (MUST BE UPPERCASE) และต้องมีการระบุค่าเรื่มต้น
        final int UP = 0; //like cons จะไม่สามารถเปลี่ยนค่ามันได้

        //ค่าค่า min max int long float double
        System.out.println("ค่าต่ำสุด int = "+Integer.MIN_VALUE); 
        System.out.println("ค่าสูงสุด int = "+Integer.MAX_VALUE);

        //check!!
        int aa;
        double bb;
        String cc = "Hello";
        boolean d;
        char e;
        float f;

        //true = yes, false = no
        boolean result = cc instanceof String;
        System.out.println("Check = "+result);

    

    }
}
