import java.util.Scanner;

public class Ex37 {
    void main() {
        //37. Fila de atendimento. Simule o atendimento de N clientes utilizando while, exibindo com if
        //uma mensagem especial a cada 5o cliente atendido.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de clientes");
        int quantidade = input.nextInt();
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite seu nome: ");
            String nome = input.nextLine();
            if (i % 5 == 0) {
                System.out.println("Oi, " + nome + " um atendimento especial para você");
            } else {
                System.out.println("Oi, " + nome);
            }
        }
    }
}
