import java.util.Arrays;

public class UsePlugins {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];
        array2[0] = 6;
        array2[1] = 7;
        array2[2] = 8;
        array2[3] = 9;
        array2[4] = 10;

        for(int i = 0; i<array1.length; i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        for(int e:array2){
            System.out.print(e + "\t");
        }
        System.out.println();
        int[] array3 = null;
        System.out.println(array3);
        array3=array2;
        System.out.println(array3);
        for(int e:array3){
            e=1; //only change the value of e, it does't change the value of elements in array3
        }
        System.out.println("array3: " + Arrays.toString(array3));
        for(int i = 0; i<array3.length; i++){
            array3[i] = 1;// change the value in array3. array3 and array2 have the same address
        }
        System.out.println("array3: "+Arrays.toString(array3));
        System.out.println("array2: " + Arrays.toString(array2));
        char[] Array4 = {'a', 'b', 'c'};
        System.out.println(Array4);
    }
}
