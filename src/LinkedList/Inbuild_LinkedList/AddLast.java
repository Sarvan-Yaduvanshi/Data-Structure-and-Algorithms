package LinkedList.Inbuild_LinkedList;
import  java.util.LinkedList;
import java.util.*;
public class AddLast {
    public static void main(String[] args) {
        // create -objects int, float, boolean --> Integer, Float, Character --> not use primitive data
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0-->1-->2
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        // 2
    }
}
