package Examples.arraylinked;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();


        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        final long start1 = System.nanoTime();
        linkedList.get(100);
        final long end1 = System.nanoTime();

        final long start2 = System.nanoTime();
        arrayList.get(100);
        final long end2 = System.nanoTime();

        long totalTimeLL1 = end1 - start1;
        long totalTimeAL1 = end2 - start2;



        final long start3= System.nanoTime();
        linkedList.remove(5000);
        final long end3 = System.nanoTime();

        final long start4 = System.nanoTime();
        arrayList.remove(5000);
        final long end4= System.nanoTime();

        long totalTimeLL2 = end3 - start3;
        long totalTimeAL2 = end4 - start4;




        long startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList1.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("\n--------------------------------");
        System.out.println("ArrayList add: "+duration);

        long startTime1 = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList1.add(i);
        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("LinkedList add: "+duration1);


        System.out.println("--------------------------------");
        System.out.println("Método get LinkedList: "+ totalTimeLL1);
        System.out.println("Método get ArrayList: "+ totalTimeAL1);
        System.out.println("--------------------------------");
        System.out.println("Método remove LinkedList: "+ totalTimeLL2);
        System.out.println("Método remove ArrayList: "+ totalTimeAL2);
        System.out.println("--------------------------------");

    }
}
