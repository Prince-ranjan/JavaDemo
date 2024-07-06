import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList =  new ArrayList<>();

  //      System.out.println(arrayList.size()); // 0

        arrayList.add(150);

        arrayList.add(200);

        arrayList.add(25);

        arrayList.add(215);

        arrayList.add(120);

        arrayList.add(120);

        arrayList.add(null);

        HashSet<Integer> hashSet = new HashSet<>(arrayList);

        System.out.println(arrayList);


        System.out.println(hashSet);


        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.println(arrayList);

        for(int index = 0; index < arrayList.size() ; index++) {
            System.out.println("index = " + index + " value = " + arrayList.get(index));
        }

        for(Integer x : arrayList) {
            System.out.println(x);
        }


        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Rohit");
        stringArrayList.add("Kohli");
        stringArrayList.add("Bumraha");

        for(int i = 0; i < stringArrayList.size(); i++)
        {
            System.out.println(stringArrayList.get(i));
        }

        Iterator<String> itr = stringArrayList.iterator();

        ListIterator<String> listIterator = stringArrayList.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (String player : stringArrayList) {
            System.out.println(player);
        }
        System.out.println(arrayList); // 15 20 25

        arrayList.remove(0);

        System.out.println(arrayList); // 20 25
    }
}

