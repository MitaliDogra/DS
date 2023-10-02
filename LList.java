import java.util.*;
public class LList {
    public static void main(String[]args){
        LinkedList <Integer> l1 = new LinkedList<>();

        l1.add(4);
        l1.add(3);
        l1.add(6);
        l1.add(2,5);

        l1.remove(2);
        l1.removeFirst();
        l1.removeLast();

        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        System.out.println(l1.size());

        boolean b1 =  l1.contains(11);
        System.out.println(b1);

        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();

        s1.push("hello");
        s1.push("Welcome!");
        l2.addAll(s1);

        Iterator it1 = l2.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
    }
    
}}
