package Examples.map;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        LinkedList<Integer> linkedList4 = new LinkedList<>();



        for (int i = 0; i < 10000000; i++) {
            linkedList4.add(i);
            arrayList4.add(i);
        }

        final long start4 = System.nanoTime();
        linkedList4.remove(1);
        final long end4 = System.nanoTime();

        final long start5 = System.nanoTime();
        arrayList4.remove(1);
        final long end5 = System.nanoTime();

        long totalTimeLL = end4 - start4;
        long totalTimeAL = end5 - start5;

        System.out.println("Metodo remove first position ArrayList: "+totalTimeAL);
        System.out.println("Metodo remove first position LinkedList: "+totalTimeLL);

    }
}
