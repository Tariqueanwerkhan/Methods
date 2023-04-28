import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array ...
//        int[] arr = {1, 3, 4, 56, 44};
//        change(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void change(int[] nums) {
//        nums[0] = 98; //if you make a change to the object vai this ref variable. same object will be changed .......


        int[] arr = {1,5,45,343,23,56};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[2] = 78;
    }
}
