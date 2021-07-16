package Examples.map.performance;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        

        long inicioDaContagem = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashMap.put(i, i);
        }
        long finalDaContagem = System.nanoTime();
        long duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do add HashMap: " + duration);
        System.out.println("===================================================================================");

        
        
        inicioDaContagem = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            treeMap.put(i, i);
        }
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do add TreeMap: " + duration);
        System.out.println("===================================================================================");

        
        
        
        inicioDaContagem = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedHashMap.put(i, i);
        }
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do add LinkedHashMap: " + duration);
        System.out.println("===================================================================================");

        

        
        
        
        
        
        
        
        
        
        inicioDaContagem = System.nanoTime();
        hashMap.remove(5000);
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo de remoção HashMap: " + duration);
        System.out.println("===================================================================================");

        
        
        
        
        
        inicioDaContagem = System.nanoTime();
        treeMap.remove(5000);
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo de remoção TreeMap: " + duration);
        System.out.println("===================================================================================");

        
        
        
        
        
        
        
        inicioDaContagem = System.nanoTime();
        linkedHashMap.remove(5000);
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo de remoção LinkedHashMap: " + duration);
        System.out.println("===================================================================================");

        
        
        
        
        
        
        
        
        
        inicioDaContagem = System.nanoTime();
        hashMap.get(76543);
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do get HashMap: " + duration);
        System.out.println("===================================================================================");

        
        
        
        
        
        
        
        
        inicioDaContagem = System.nanoTime();
        treeMap.get(76543);
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do get TreeMap: " + duration);
        System.out.println("===================================================================================");

        
        
        
        
        
        
        
        
        
        inicioDaContagem = System.nanoTime();
        linkedHashMap.get(76543);
        finalDaContagem = System.nanoTime();
        duration = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do get LinkedHashMap: " + duration);
    }
}
