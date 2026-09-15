package lista1;
import java.util.ArrayList;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        //7. Números perfeitos. Utilizando for (com um for interno para somar os divisores) e if, encontre e
        //exiba todos os números perfeitos entre 1 e 500 (ex.: 6, pois 1+2+3=6).
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <= 500; i++) {
            int cont = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    cont += j;
                }
            }
            if (cont == i) {
                lista.add(i);
            }
        }
        for (Integer item: lista) {
            System.out.println(item);
        }
    }
}
