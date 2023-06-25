import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;

public class CalGrade {
    public static void main(String[] args) {
        //เขียนภายใต้ try catch when have an Exception
        PrintWriter output = null; //ยังไม่นิยาม เอามาเก็บเกรด

        try{ 
            Scanner input = new Scanner(new File("Score.txt")); //like buffered
            
            output = new PrintWriter(new File("Grade.txt"));
            
            System.out.println("File can be open!");
            String nisit = "";
            String Grade = "";
                while(input.hasNext()){ //มีข้อมูลให้อ่านไหม
                    nisit = input.nextLine();
                    System.out.println("data = "+nisit);
                    int position = nisit.indexOf(" "); //find free space
                    //System.out.println("index of free space = "+position);
                    String score = nisit.substring(position, nisit.length()); //ตัดตั่งแต่ freespae to end of string
                    score = score.trim(); //cut free space

                    double scoreofnisit = Double.parseDouble(score);
                    if(scoreofnisit >= 80){
                        Grade = "A";
                    }else if(scoreofnisit >= 70){
                        Grade = "B";
                    }else if(scoreofnisit >= 60){
                        Grade = "C";
                    }else if(scoreofnisit >= 50){
                        Grade = "D";
                    }else{
                        Grade ="F";
                    }
                    output.println(nisit + " " + score + " " + Grade); //เขียน new file for input data 
                }
        }catch(IOException e){
            e.printStackTrace();
        }
        output.close();
    }
}
