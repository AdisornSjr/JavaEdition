import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        //โปรแกรมเปรียบเทียบตัวเลข
        Scanner sc = new Scanner(System.in);
        int num[] = new int[2];
        for(int i=0;i<2;i++){ //use loop
            System.out.print("input "+(i+1)+" = ");
            num[i] = sc.nextInt();
        }
        
        if(num[0] > num[1]){
            System.out.println(num[0] + " is greater than " + num[1]);
        } else if (num[0] < num[1]) {
            System.out.println(num[0] + " is less than " + num[1]);
        } else {
            System.out.println(num[0] + " is equal to " + num[1]);
        }
        }
    
        
        
        

}
    

