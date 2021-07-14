package Examples.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);
    }
}
