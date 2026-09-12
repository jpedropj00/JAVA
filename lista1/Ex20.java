import java.util.Scanner;

public class Ex20 {
    void main () {
        //20. Sequência de Collatz. A partir de um número N, aplique repetidamente a regra: se par, divida
        //por 2; se ímpar, multiplique por 3 e some 1 (if/else). Repita com while até chegar a 1, contando e
        //exibindo o número de passos.
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int cont = 0;
        while (num != 1) {
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            cont ++;
            System.out.println(num);
        }
        System.out.println(cont);
    }
}
