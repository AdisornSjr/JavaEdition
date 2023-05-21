import java.lang.Math;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        System.out.print("input your weight = ");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        System.out.print("input your heigh = ");
        double h = sc.nextDouble();
        int n =2;

        double BMI = w/(Math.pow(h,n));
        System.out.println("ค่า BMI = "+BMI);


        
    }
}
