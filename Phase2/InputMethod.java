import java.util.Scanner;

public class InputMethod {
    public static void main(String[] args) {
        //modifier void name(para,para)
        /*System.out.print("input string = ");
        Scanner mes = new Scanner(System.in);
        String a = mes.nextLine();
        display(a);
        System.out.print("input your firstname = ");
        String x = mes.nextLine();
        System.out.print("input your lastname = ");
        String y = mes.nextLine();
        Name(x, y);
        */

        //method that return some value
        String myword = word();
        System.out.println(myword);

        //numcompare
        int result = numcompare(10, 20);
        System.out.println(result); //return max value


    }
    static void display(String message){
        System.out.println(message);
    }
    static void Name(String firstn,String lastn){
        System.out.println(firstn+" "+lastn);
    }
    //method that return
    static String word(){
        return "sawad dee jaa";
    }

    //intput and return
    static int numcompare(int a,int b){
        int max = 0;
        if(a > b){
            return max = a;
        }else{
            return max = b;
        }

    }
}
