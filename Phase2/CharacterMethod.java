public class CharacterMethod {
    public static void main(String[] args) {
        //check isletter, isDigit
        //Character.isLetter .isDigit
       //isUppercas isLowercase
       //toUppercase toLowercase

       char alphabet = 'A';
       System.out.println(Character.isLetter(alphabet)); //ตอนนี้ใช้ class character ไม้ได้
       char [] group = {'A','B','C'};
       System.out.println(group[1]);

       if(Character.isUpperCase(alphabet)){
        System.out.println(Character.toLowerCase(alphabet));
       }

       



    }
}
