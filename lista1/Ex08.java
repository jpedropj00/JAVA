package lista1;
import java.util.ArrayList;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        //8. Fibonacci com destaque. Gere os 20 primeiros termos da sequência de Fibonacci utilizando for,
        //indicando com if quais termos são pares.
        List<Integer> vect = new ArrayList<Integer>() {
        };
        for (int i = 0; i < 20; i++) {
            if (i == 0 || i == 1) {
                vect.add(1);
            } else {
                vect.add((vect.getLast() + vect.get(vect.size() - 2)));
            }
        }
        for (int num: vect) {
            System.out.println(num);
        }
    }
}
