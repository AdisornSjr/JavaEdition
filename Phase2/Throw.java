import java.util.Scanner;
public class Throw {
    static int bal = 5000; //static
     public static void main(String[] args) {
        //manage Exception with Throw**
        
        try{
            
            Scanner kb = new Scanner(System.in);
            System.out.print("input your money = ");
            int money = kb.nextInt();
            withdraw(money);
        }catch (ArithmeticException e){
            e.printStackTrace();

        }
        
    }
    //method only withdraw**
    public static void withdraw(int amount) throws ArithmeticException { //**insert throw if use throw in method หลายๆอันเติม s
        
        if(amount <= 0){
            throw new ArithmeticException("input your money that > 0"); 
        }
        if(amount > bal){
            throw new ArithmeticException("have no enogh money");

        }
        bal -= amount;
        System.out.println("withdraw = "+amount);
        System.out.println("your balance = "+bal);

    }
}
