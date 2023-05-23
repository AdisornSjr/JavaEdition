import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        //แปลง พศ to คศ
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your พ.ศ. = ");
        year = sc.nextInt()-543;

        System.out.print("Input your ค.ศ. = "+year);


    }
}
