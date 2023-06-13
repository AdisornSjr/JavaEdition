public class Loop {
    public static void main(String[] args) {
        //while for do..while
        //ถ้าเจอ break จะออกจาก loop นั้นทันที
        //continue จะหยุดแล้ววนมาเรื่ม loop ใหม่
        int count = 0;
        while(true){
            System.out.println("รอบที่ "+count);
            count++;
            if(count == 20){
                break;
            }
        }

        for(int i=0;i<=10;i++){
            System.out.println("round "+i);
        }

        do{
            //condition
        }while(true);//ถ้าจริงก็กลับไปซ้ำใหม่ ลองทำก่อน 1 รอบ
    }

    //for ใช้ในกรณีรู้รอบชัดเจน
    //while ไม่รู้จำนวนรอบ
    //do..while อยากลองทำก่อน
}
