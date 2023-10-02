
import java.util.Arrays;

public class ArraysSearch {
    static int search(int array[], int key){
        for (int i=0;i<array.length;i++){
            if(array[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String[]args){
        int a1[]= new int[] {9,8,7,6,5,4};
        for (int i=0;i<a1.length;i++){
            System.out.print(a1[i]);
        }
        Arrays.sort(a1);
        System.out.println();
        for (int i=0;i<a1.length;i++){
            System.out.print(a1[i]);
        }
        
            int indexValue = search(a1,9);
            if(indexValue== -1)
            System.out.println("element not found");
            else
            System.out.println("element found" +indexValue);
            
        }
        }
            
        
        
        
    