import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        // + - * / % หารทำเศษ
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int a = sc.nextInt();
        System.out.print("num2 = ");
        int b = sc.nextInt();
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
