import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList =  new ArrayList<>();

        System.out.println(arrayList.size()); // 0

        arrayList.add(15);

        arrayList.add(20);

        arrayList.add(25);

        System.out.println(arrayList); // 15 20 25

        arrayList.remove(0);

        System.out.println(arrayList); // 20 25
    }
}

