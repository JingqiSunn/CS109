public class Test13 {
    public static void main(String[] args) {
        Father test = new son();
        test.StaticMethod();
    }
}
class Father {
    public static void StaticMethod(){
        System.out.println("Father");
    }
}
class son extends  Father {
    public static void StaticMethod(){
        System.out.println("son");
    }
}