package actionet;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        //ArrayLists
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        //randomize
        long seed = System.nanoTime();
        Collections.shuffle(list1, new Random(seed));
        Collections.shuffle(list2, new Random(seed));

        //calculate size
        int list1size = list1.size();
        int list2size = list2.size();

        //print
        System.out.print(" List 1: " + list1 + "List 1 size: " + list1size);
        System.out.print(" List 2: " + list2 + "List 2 size: " + list2size);

        //I'm writing this in the order that the test dictates so that it's easier to grade
        //new list
        ArrayList<Integer> list3 = new ArrayList<>();

        //add list1 and list2 to make list3
        list3.addAll(list1);
        list3.addAll(list2);

        //remove duplicates
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list3);
        list3.clear();
        list3.addAll(set1);

        //sort
        Collections.sort(list3);

        //calc list size
        int list3size = list3.size();

        //remove middle index
        list3.remove(list3size / 2);

        //recalc list size
        int list3sizeUpdate = list3.size();

        //reverse order
        Collections.reverse(list3);

        //print list 3
        System.out.print(" List 3: " + list3 + "List 3 size: " + list3sizeUpdate);


    }
}
