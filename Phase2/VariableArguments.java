public class VariableArguments {
    public static void main(String[] args) {
        summation(10, 20, 30,60,70,22);
    }
    
    // **modifier type name(type..arr) **
   
    public static void summation(int a,int b){
        int sum = a+b;
        System.out.println("sum = "+sum);
    }
   public static void summation(int a,int b,int c){ //overload
        int sum = a+b+c;
        System.out.println("sum = "+sum);
   }

   
   //fix by variable arguments can overload variable
   public static void summation(int...lotsNumber){ //use ...name
    int sum = 0;
    for(int i=0;i<lotsNumber.length;i++){
        sum+=lotsNumber[i];

    }
    System.out.println("sum = "+sum);
   }
}
