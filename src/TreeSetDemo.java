import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(21);
        treeSet.add(3);
        treeSet.add(47);
        treeSet.add(56);
        treeSet.add(10);
        treeSet.add(21);

        treeSet.last(); //3
        treeSet.first(); // 56
        treeSet.addFirst(10);
        treeSet.contains(45); //false
        treeSet.headSet(20);
        System.out.println(treeSet);
    }
}
