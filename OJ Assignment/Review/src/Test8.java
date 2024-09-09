public class Test8 {
    public static void doPaint(Base o){
        o.Print();
    }
    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        doPaint(x);
        doPaint(y);
        doPaint(z);
    }
}
class Base{
    public void Print(){
        System.out.print("Base ");
    }
}
class Derived extends Base{
    public void Print(){
        System.out.print("Derived ");
    }
}