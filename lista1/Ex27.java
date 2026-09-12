import java.util.Scanner;

public class Ex27 {
    void main() {
        //27. Jogo de adivinhação. Defina um número secreto fixo e simule tentativas de "chute". Utilizando
        //do-while, repita até o chute ser igual ao número secreto, informando com if se o chute foi maior ou
        //menor que o número secreto.
        final int NUMERO_SECRETO = 22;
        Scanner sc = new Scanner(System.in);
        int numEscolhido;
        do {
            System.out.println("Digite um numero de 1 a 100: ");
            numEscolhido = sc.nextInt();
            if (numEscolhido == NUMERO_SECRETO) {
                System.out.println("Acertou");
            }
        } while (numEscolhido != NUMERO_SECRETO);
    }
}
