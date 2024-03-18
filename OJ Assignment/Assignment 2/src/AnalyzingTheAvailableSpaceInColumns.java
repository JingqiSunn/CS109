import java.util.Arrays;

public class AnalyzingTheAvailableSpaceInColumns {
    public static void main(String[] args) {
        int[] array = {1,0,0,1,0};
        int lengthOfTheColumn = array.length;
        int availableSpaceInThisColumn = 0;
        if(array[0] == 0 && array[1] ==0) {
            availableSpaceInThisColumn +=1;
            array[0] = 1;
        }
        for (int i = 1; i < lengthOfTheColumn-1; i++) {
            if(array[i-1]==0&&array[i]==0&&array[i+1]==0){
                availableSpaceInThisColumn+=1;
                array[i] = 1;
            }
        }
        if (array[lengthOfTheColumn-1]==0&&array[lengthOfTheColumn-2]==0){
            availableSpaceInThisColumn +=1;
            array[lengthOfTheColumn-1]=1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(availableSpaceInThisColumn);
    }
}
