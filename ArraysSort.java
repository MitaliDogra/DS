import java.util.Arrays;

public class ArraysSort {
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
    
}
}