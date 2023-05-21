public class PrePostfix {
    public static void main(String[] args) {
        /*
        ++Prefix (++a) เพิ้มค่า a ก่อนแลัวนำไปใช้
        Postfix++ (a++)  นำ a ไปใช้ก่อนแล้วเพิ้มค่า
        */

        //pre
        int a =5;
        System.out.println(a); //5
        System.out.println(++a); //6
        System.out.println(a); //6

        //post
        a = 5;
        System.out.println(a); //5
        System.out.println(a++); //5
        System.out.println(a); //6

        //compound assignment
        // += -= *= %= เป็นการลดรูป


    }
}
