import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(25);
        hashSet.add(20);
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add(59);
        hashSet.remove(40);
        hashSet.remove(20);
//10 25 null 59
        List<Integer> list = new ArrayList<>(hashSet);

        Collections.sort(list);

        System.out.println(list);
//        for(Integer x : hashSet) {
//            System.out.println(x);
//        }
      //     p
        // null -> 20 -> 25 ->  10

//        Iterator<Integer> itr = hashSet.iterator();
//
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        hashSet.clear();
//
//        System.out.println(hashSet);
    }
}
