package atividadesArray;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    void main() {
        //Gere um vetor de tamanho aleatório (5 a 20), e preencha com valores aleatórios (0 a 9). Exiba o vetor gerado, depois ordene o vetor em ordem crescente e exiba-o. Não pode usar a função .sort para resolver7
        Random aleatorio = new Random();
        int[] vect = new int[aleatorio.nextInt(5,20)];
        for (int i = 0; i < vect.length; i++) {
            vect[i] = aleatorio.nextInt(0,9);
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        for  (int i = 0; i < vect.length - 1; i++) {
            for (int j = i + 1; j < vect.length; j++) {
                if (vect[i] < vect[j]) {
                    int aux = vect[i];
                    vect[i] = vect[j];
                    vect[j] = aux;
                }
            }
        }
        System.out.println("Vetor: " + Arrays.toString(vect));
    }
}
