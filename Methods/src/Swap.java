public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //swap numbers code .....
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);
        String name = "Tarique anwer khan";
                changeName(name);
        System.out.println(name);

    }
    static void changeName(String naam){
        naam = "Anwer khan"; // creating a new object .....
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
