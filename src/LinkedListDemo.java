import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(100);
        linkedList.add(20);
        linkedList.add(130);

        linkedList.addFirst(35);
        linkedList.addLast(250);

        linkedList.addFirst(10);
        linkedList.addLast(500);

        linkedList.removeFirst();
        linkedList.removeLast();
       // linkedList.add(null);


        System.out.println(linkedList);

//        Collections.sort(linkedList);
//
//        System.out.println(linkedList);

//        for(int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }

        for(Integer x : linkedList) {
            System.out.println(x);
        }
    }
}

// sorting time complexity = O(nlogn)