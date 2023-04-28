public class Overloading {
    public static void main(String[] args) {
        fun(56);
        fun("Tarique khan");
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
