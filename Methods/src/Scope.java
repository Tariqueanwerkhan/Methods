public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Usman";

        {
            // values initialised in this block will remain in block.......
            a = 78; // reassign the original ref variable to some other value ......
            int c = 89;
            System.out.println(a);
            name = "Usman";
            System.out.println(name);
        }
        //System.out.println(c); // cannot use outside the block......
        System.out.println(name);

        for (int i = 0; i < 4; i++) {
           // System.out.println(i);
            int num = 90;
            a = 10;
        }
        System.out.println(a);
    }

    static void random(){
        int num = 67;
        System.out.println(num);
    }
}
