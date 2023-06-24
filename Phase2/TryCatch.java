import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch {
    public static void main(String[] args) {
        //resolve of exception
        
        //ArrayIndexOutOfBoundsException
        //ArithmeticException
        //ZeroDivisionException
        //IOException
        //FlieNotFoundException
        try{
            //try this coommand.
           //int a = 10,b = 0;
           // int c = a/b;
            //System.out.println(c);

            //int []item = {10,20,30};
            //System.out.println(item[3]);

            Scanner kb = new Scanner(System.in);
            System.out.print("input nums = ");
            int number = kb.nextInt();
            System.out.println(number);

        }catch(ArithmeticException e){
            //Exception do this instead.
            System.out.println("ห้ามหาร 0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index not found");
        }catch(InputMismatchException e){
            System.out.println("Only number naja");
        }finally{
            System.out.println("do something");
        }
        //catch(exception e ) เลยก็ได้่หา
        //finally คือ เมือเกิดหรือไม่เกิดข้อผิดพลากก็ ทำอยู่ดีึ

    }
}
ช