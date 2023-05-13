public class TypeCast {
    public static void main(String[] args) {
        //การแปลงชนิด data
        //Windening Casting Byte->short->char->int->long->float->double (small to big) automatic
        //Narrowing Casting (manual)

        //auto
        int numInt=100;
        double numDouble = numInt;
        System.out.println(numInt); // int
        System.out.println(numDouble); //double

        //manual
        double ndouble = 10.0;
        int nint = (int)ndouble; //fix by (int) ระบุ type ข้างหน้า
        System.out.println(nint);

    }
}
