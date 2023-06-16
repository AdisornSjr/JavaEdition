public class TWOdarray {
    public static void main(String[] args) {
        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        // แถว --> คอลลัม
        System.out.println(numbers[0][2]);
        //acess by loop in array
        for(int i = 0;i < numbers.length;i++){
            for(int j = 0;j < numbers[i].length;j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
    
}
