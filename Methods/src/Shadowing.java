import java.util.Arrays;

public class Shadowing {
//    static int x = 90; // this will be showed at line 8
//    public static void main(String[] args) {
//        System.out.println(x); // 90
//        int x = 40; // the class variable at line  is shadowed by this
//        System.out.println(x); // 40
//        fun();
//    }
//    static void fun(){
//        System.out.println(x);


    // variable arguments .....
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 2, 66, 66, 44, 98);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
