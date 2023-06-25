import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        //read
        try{
            FileReader reader = new FileReader(new File("Dude.txt")); //read dude2.txt but not found
            int data;
            while((data = reader.read()) != -1){//read จนหมด
                System.out.printf("%c\n",data); //%c ดึงตัวอักษรจาก data
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        //bufferedread for faster

        try{
            FileReader r = new FileReader(new File("wasup.txt"));
            BufferedReader br = new BufferedReader(r);
            String message = "";
            while((message = br.readLine()) != null){//if have data go read
                System.out.println(message); //read for each line
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        

}
}
