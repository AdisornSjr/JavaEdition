public class Methodreturn {
    public static void main(String[] args) {
        connectserver(120);
        
    }
    public static void connectserver(int ping){
        System.out.println("Your ping = "+ping);
        //void but return will exit
        if(ping >100){
            System.out.println("Can not connect to server");
            return; //กระโดดออกไปแล้ว
        }
        //not display if condition true
        System.out.println("Completed connected");
        
    }
}
