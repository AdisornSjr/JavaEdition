public class ArrayMethod {
    public static void main(String[] args) {

       String []zoo = {"cat","dog","bird","snake","penquin"};
        displayArray(zoo);

        int []nums = {10,20,100,200,22};
        //find max
        System.out.println("MAX NUMBER IS = "+findMaxInArray(nums));
        //find max index
        System.out.println("Index max number is = "+findmaxindex(nums));

        //compare
        int[]A = {1,2,3,4,5};
        int[]B = {1,2,3,4,5};
        

        System.out.println("Result of compare is = "+compareArrray(A, B));
        
        //swap
        System.out.print("Array A is = ");
        display(A);
        SwapArr(A, 0, 2);
        System.out.print("Swap A is = ");
        display(A);

        //copy return array
        //USE A[] then return C[]
        int C[] = coppyArr(A);
        System.out.print("Copy A to C is = ");
        display(C);

        //find the number in array 
        System.out.println(findElement(A, 4));
        
        
         
    }
    //modifier void name(type [] arr)
    static void displayArray(String []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("ลำดับที่ "+i+" ค่า = "+arr[i]);
        }
    }
    //show array
    static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    //method array that return
    static int findMaxInArray(int []arr){
        int max = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){//can change < > for min and max
                max = arr[i];
            }
        
        }
        return max;

    }
    //method find index
    //เข้าถึงตำแหน่ง index
    static int findmaxindex(int []arr){
        int location = 0;//เก็บตำแหน่ง index
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[location]){//can change < > for min and max
               location = i;
            }
        
        }
        return location;
    }

    //method compare array
    static boolean compareArrray(int []arrA,int []arrB){
        //สมาชิก
        if(arrA.length != arrB.length) return false;
        for(int i=0;i<arrA.length;i++){
            if(arrA[i]!=arrB[i]){
                return false;
            }
        }
        return true;
    }

    //swap
    static void SwapArr(int []a,int x,int y){
        //x is start
        //y is end
        
        int temp = a[x]; // เก็บไว้ก่อน
        a[x] = a[y];
        a[y] = temp;

    }
    //method array return
    static int [] coppyArr(int []a){
        //free space array that equal the same
        int []newArr = new int[a.length];
        for(int i=0;i<a.length;i++){
            newArr[i] = a[i];
        }
        return newArr; //return in array
    }

    //find number in array
    static int findElement(int []arr,int NUMBER){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == NUMBER){ //can use .equal ==
                return i;
            }
        }
        return -1;
    }


}
