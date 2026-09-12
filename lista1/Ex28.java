import java.util.Scanner;

public class Ex28 {
    void main() {
        //28. Juros compostos. Utilizando for, calcule mês a mês o rendimento de um valor investido a uma
        //taxa fixa, utilizando if para indicar em qual mês o valor ultrapassa um limite definido.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um limite do seu investimeto: ");
        final double LIMITE = sc.nextDouble();
        System.out.println("Digite o valor a ser investido: ");
        double valorInvestido = sc.nextDouble();
        System.out.println("Valor taxa fixa em porcentagem: ");
        double taxaFixa = sc.nextDouble();
        double montante = valorInvestido;
        for (int i = 1; i <= 12; i++) {
            montante = montante * (i + taxaFixa / 100);
            if (montante >= LIMITE) {
                System.out.println("Mês " + i + " ultrapassou");
            }
            System.out.println(montante);
        }

    }
}
