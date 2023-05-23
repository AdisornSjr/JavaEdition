import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป่อนเงินที่จะกด (THB): ");
        int amount = sc.nextInt();
        System.out.println("จำนวนเงิน = "+amount);
        // 1000 500 100 50 20
        //เรียงจากใหญ่
        if(amount>=1000){
            // 5000/1000 = จำนวนแบงค์
            System.out.println("1000 = "+(amount/1000)+" ใบ");
            amount%=1000; //หาเศษ
            System.out.println("เศษ = "+amount);
        }// check all condition use if
        if(amount>=500){
            System.out.println("500 = "+(amount/500)+" ใบ");
            amount%=500; //หาเศษ
            System.out.println("เศษ = "+amount);

        }
        if(amount>=100){
            System.out.println("100 = "+(amount/100)+" ใบ");
            amount%=100; //หาเศษ
            System.out.println("เศษ = "+amount);
        }
        if(amount>=50){
            System.out.println("50 = "+(amount/50)+" ใบ");
            amount%=50; //หาเศษ
            System.out.println("เศษ = "+amount);
        }
        if(amount>=20){
            System.out.println("20 = "+(amount/20)+" ใบ");
            amount%=20; //หาเศษ
            System.out.println("เศษ = "+amount);
        }
    }
}
