import java.util.ArrayList;

public class Test11 {
    public static void addElement(ArrayList arr){
        arr.add(2);
        arr = new ArrayList();
        arr.add(3);
        arr.add(4);
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        addElement(arr);
        System.out.println(arr.get(1));
    }
}
