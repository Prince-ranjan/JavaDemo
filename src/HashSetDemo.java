import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(25);
        hashSet.add(20);
        hashSet.add(null);

//        for(Integer x : hashSet) {
//            System.out.println(x);
//        }
      //     p
        // null -> 20 -> 25 ->  10

        Iterator<Integer> itr = hashSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
