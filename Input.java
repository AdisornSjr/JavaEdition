import java.util.Scanner; //import
public class Input {
    public static void main(String[] args) {
        //การรับค่่า input
        // class | new
        System.out.print("input your name = ");
        Scanner sc = new Scanner(System.in); //system จาก keyboard
        String name = sc.nextLine(); //รับค่าจากkeyboard ใส่ name 

        System.out.print("input your age = "); // next อะไรก็อันนั้น
        int year = sc.nextInt(); //รับค่า int from keyborad

        System.out.println(name);
        System.out.println(year);


        //nextline int
        Scanner SC = new Scanner(System.in);
        String NAME = SC.nextLine(); //รับค่าจาก keyboard รวมเว้นวรรค ทั้ง line

        //next รับค่าจาก keyboard ไม่เว้นวรรค
        Scanner SCa = new Scanner(System.in);
        String NAMEa = SCa.next();
    }
}
