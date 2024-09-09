public class WhetherStringCanBeChanged {
    public static void main(String[] args){
        String s = "Hello";
        s=change(s);
        System.out.println(s);
    }
    public static String change(String a){
        a = "h";
        return a;
    }
}
