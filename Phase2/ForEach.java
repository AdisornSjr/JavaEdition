public class ForEach {
    public static void main(String[] args) {
        //การเข้าถึงโดย foreach
        String []pet = {"cat","dog","bird"};
        // : for each *** ชนิดข้อมูลต่้องเท่ากัน
        for(String data : pet){ //เอา pet มาลงใน data 
            System.out.println(data);
        }

        int []num ={1,2,3,4,5,6};
        int sum = 0;
        for(int item : num){
            sum += item;

        }
        System.out.println(sum);
    }
}
