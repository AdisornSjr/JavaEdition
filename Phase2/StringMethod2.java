import javax.xml.crypto.Data;

public class StringMethod2 {
    public static void main(String[] args) {
        //replace string .relpace(pick, replace)
        String message = "I love u 300";
        String result = message.replace("love", "luv");
        System.out.println(result);

        //How to String to Array (.split())
        String food = "krapao:tofu:icecream";
        String []data = food.split(":");
        for(int i = 0;i<data.length;i++){
            System.out.println(data[i]);
        }

        //หาข้อความย่อย subString
        String name = "MercedesBenz";
        System.out.println(name.substring(0,2)); //cut >= 2

        //Sting to Character .
        String str = "Holomogram";
        char [] alphabet = str.toCharArray();
        System.out.println(alphabet[0]); // index 0 is H

        // ** char [] to String **
        char [] gun = {'g','u','n'};
        //convert ***
        String RESULT = String.copyValueOf(gun);
        System.out.println(RESULT);

        //how to cut space .trim
        //use i love u 3000
        String mes ="      i luv u 3000   ";
        System.out.println(mes.length());
        System.out.println(mes);
        mes = mes.trim();
        System.out.println(mes.length());
        System.out.println(mes);
        

        //how to convert to uppercase lowercase
        //use message
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        //convert to value
        int number = 100;
        String tostring = String.valueOf(number);
        System.out.println(tostring);
    }
}
