
public class ArraysSolution{
    public static void main(String[]args){
        int[] a1 = new int[8];
        int count=1;
        for (int i=0;i<a1.length;i++){
            a1[i]=count;
            count++;
        }
        for (int i=0;i<a1.length;i++){
            System.out.println(a1[i]+" ");

        }
}}