package Phase1;
import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("input temp(F) = ");
        float fah = temp.nextFloat();
        float cel = (fah-32)*5/9;
        System.out.println("In Celsious is = "+cel);

    }
}
