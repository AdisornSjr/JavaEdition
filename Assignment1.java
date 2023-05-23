import java.lang.Math;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        System.out.print("input your weight = ");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        System.out.print("input your heigh = ");
        double h = sc.nextDouble()/100; //to cm
        int n =2;

        double BMI = w/(Math.pow(h,n));
        System.out.println("ค่า BMI = "+BMI);
        
        /*
          น้อยกว่า 18 = ต่ำกว่าเกณฑ์
          18.5 - 22.9 = สมส่วน
          23.0 - 24.9 = น่ำหนักเกิน
          25.0 - 29.9 - โรคอ้วน
          มากกว่า 30 = โรคอ้วนระดับอันตราย

         */

        String predic = "";
        if(BMI <18){
            predic = "ต่ำกว่าเกณฑ์";
        }else if(BMI>= 18.5 && BMI<=22.9){
            predic = "สมส่วน";
        }else if(BMI>=23.0 && BMI<=24.9){
            predic = "น่ำหนักเกิน";
        }else if(BMI>=25.0 && BMI<=29.9){
            predic = "โรคอ้วน";
        }else if(BMI>=30 && BMI<=70.0){ 
            predic = "โรคอ้วนระดับอันตราย";
        }else{
            predic ="ไม่ทราบ"; //เผื่อ .99999999999999999
        }

        System.out.println(predic);


        
    }
}
