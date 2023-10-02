import java.util.Iterator;
import java.util.Stack;

public class StackSolution {
    public static void main(String[]args){
        // created a stack 
        Stack<Integer> s1 = new Stack<>();
        // inserting elements into stack
        s1.push(2);
        s1.push(5);
        s1.push(6);
        System.out.println(s1);
        // deleting elements in stack 
        s1.pop();
        System.out.println(s1);
        // peek operation 
        System.out.println(s1.peek());
        boolean status = s1.empty();
        System.out.println(status);
        int indexfound = s1.search(4);
        System.out.println(indexfound);
        // how to iterate over stack 
        Iterator it = s1.iterator();
        while (it.hasNext()){
            Object s2 = it.next();
            System.out.print(s2);
        }
        System.out.println();
        System.out.println(s1.size());
        s1.sort(null);
        System.out.println(s1);
    }

    
}
