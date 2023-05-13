public class StingTUTU {
    public static void main(String[] args) {
        //char > 2 ตัว = string
        char a = 'A';
        String W = "ADDADD";
        System.out.println(a);
        System.out.println(W);
        //can be + together
        
        //convert string to int
        //String to int
        String A = "100";
        String B = "50";

        int sum = Integer.parseInt(A);
        sum += 50;
        
        System.out.println("String to int = "+sum);

        //String to double
        //Double.parseDouble("100");

        //Integer to String
        int KOL = 100;
        String LOP = String.valueOf(KOL);
        LOP += KOL;
        System.out.println("int to String = "+LOP);

    }
}
