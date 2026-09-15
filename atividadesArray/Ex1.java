package atividadesArray;

import java.util.Scanner;

public class Ex1 {
    void main() {
        //Crie um vetor de 5 posições para as notas de uma turma. Peça ao usuário que digite as 5 notas, uma por uma. Ao final, exiba: todas as notas digitadas, a maior e a menor nota, e a média da turma. Use um vetor do tipo double, já que notas podem ter casas decimais.
        double[] vect = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite a nota " + i);
            vect[i] = sc.nextDouble();
        }
        double maiorNota = vect[0];
        double menorNota = vect[0];

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maiorNota) {
                maiorNota = vect[i];
            }
        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < menorNota) {
                menorNota = vect[i];
            }
        }
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            media += vect[i];
        }
        media = media / vect.length;
        System.out.println(media);



    }
}
