package Examples;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        var alunos = new ArrayList<String>();
        alunos.add("Giovane");
        alunos.add("Giovane");
        alunos.add("Giovane");


      //  alunos.forEach(System.out::println);

        for (String nomes:alunos) {
            System.out.println(alunos);
        }



    }
}
