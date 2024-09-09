public class TypeCasting {
    public static void main(String[] args) {
        final int a =875;
        long c = 2147483648L;
        char e ='a';
        int d;
        byte b;
        int f;
        b= (byte) a;
        d= (int)c;
        f=(int) e;
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
        test();
    }
    public static void test(){
        final int u = 110;
        System.out.println(u);
    }
}
