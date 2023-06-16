import java.util.Scanner;

public class InputMethod {
    public static void main(String[] args) {
        //modifier void name(para,para)
        System.out.print("input string = ");
        Scanner mes = new Scanner(System.in);
        String a = mes.nextLine();
        display(a);
        System.out.print("input your firstname = ");
        String x = mes.nextLine();
        System.out.print("input your lastname = ");
        String y = mes.nextLine();
        Name(x, y);


    }
    static void display(String message){
        System.out.println(message);
    }
    static void Name(String firstn,String lastn){
        System.out.println(firstn+" "+lastn);
    }
}
