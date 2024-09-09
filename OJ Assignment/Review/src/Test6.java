public class Test6 {
    public static void main(String[] args) {
        int a =0;
        int b =0;
        for (int i = 0; i < 4; i++) {
            if ((a++>2||(b++>2))){
                a++;
            }
        }
        System.out.println(a+" "+b);
    }
}
