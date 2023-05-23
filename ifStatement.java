import java.util.Scanner;
public class ifStatement{
    public static void main(String[] args) {
        boolean result = 10>5;
        Scanner k = new Scanner(System.in);
        System.out.print("input age");
        int age = k.nextInt();

        if(age>=20){
            System.out.println("เข้าร้านเหล้าได้");
        }else{
            System.out.println("ไปซะ");
        }
        /*
         if
         else if ถ้าแรก false check ต่อ 
         else if
         */
        if(age<=15){ //if in if
            System.out.println("ต้น");
            if(age==15){
                System.out.println("3");
            }
        }else{
            System.out.println("ปลาย");
        }
    }
}