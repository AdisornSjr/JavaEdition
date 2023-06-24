import javax.naming.spi.DirStateFactory.Result;

public class StringMethod {
    public static void main(String[] args) {
        //นิยาม
        String name = "Fluke";
        String NAME = "FLUKE";
        String city = new String("Chiang Mai");

        //Concatenation  = ต่อ string
        String result = name+city;
        System.out.println(result.concat("eiei")); //method concat (concatenation)

        //find lenght of String //.lenght
        System.out.println(name.length()); //รวม free space\
        System.out.println(NAME.length());

        //find index char .charAt(index)
        System.out.println(name.charAt(2)); //Fluke

        //compare String .equal
        boolean OP = name.equals(NAME); //Fluke != FLUKE
        System.out.println(OP);
        //ขอแค่คำเหมือน .equalsIgnoreCase
        boolean op = name.equalsIgnoreCase(NAME);
        System.out.println(op);

        //.starsWith หาข้อความที่อยู่หน้าสุด
        String song = "how could we ever just be friend";
        System.out.println(song.startsWith("how"));
        //endWith หาข้อความหลังสุด
        System.out.println(song.endsWith("friend"));

        //.indexof
        System.out.println(song.indexOf("just")); //index of j is 18
    }
    
}
