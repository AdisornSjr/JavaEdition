import Phase1.MinMax;
import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter(new File("Dude.txt"));
            writer.write("Hello was up dude eiieie");
            writer.close(); //when end close
            System.out.println("DONE!");
        }catch(IOException e){
            e.printStackTrace();
        }
        
        //bufferedwrite for big file and faster
        try{
            FileWriter w = new FileWriter(new File("wasup.txt"));
            BufferedWriter bw = new BufferedWriter(w);
            bw.write("Ayo wasuo mannnn\n"); // buffer write
            bw.write("Ayo wasuo mannnn\n");
            bw.write("Ayo wasuo mannnn\n");
            bw.write("Ayo wasuo mannnn");
            bw.close(); //use buffer close
            System.out.println("Buffered writer is successfull");

        }catch(IOException e){
            e.printStackTrace();
        }

    }   

}
