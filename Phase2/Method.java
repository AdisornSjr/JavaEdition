public class Method {
    public static void main(String[] args) {
        //method is ชุดคำสั่งนำมาเขียนรวมกันเป็นกลุ้มเพื่อเรียกใช้งานและลดความซับซ้อนของคำสั่งทีใช้งานบ่อยๆ opp มาประยึก
        /* type name(parameter 1,parameter 2){
            like a function

        }*/ 
        //General way
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        //use method
        display();
        plus();

    
    }
    static void display(){ //main เป็น static ก็ต้อง static
        System.out.println("Hello World"); //คำสั่ง
    } 
    static void plus(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);
    }
   
}
