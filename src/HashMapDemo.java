import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "rahul");
        hashMap.put(7, "Dhoni");
        hashMap.put(2, "Rohit");
        hashMap.put(18, "Virat");
        hashMap.put(1, "rahul");

        ArrayList<String> arrayList = new ArrayList<>(hashMap.values());

        ArrayList<Integer> integerArrayList = new ArrayList<>(hashMap.keySet());


        System.out.println(hashMap);
    }
}
