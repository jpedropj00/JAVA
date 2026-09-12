import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //10. Saque bancário. Simule um caixa eletrônico: utilizando do-while, permita realizar saques até o
        //usuário optar por sair, verificando com if se há saldo suficiente antes de autorizar o saque.
        Scanner input = new Scanner(System.in);
        final String MENU = """
                [1] SAQUE
                [2] DEPOSITAR
                [0] SAIR
                """;

        double saldo = 0, valor = 0;


        int resp;
        do {
            System.out.print(MENU);
            resp = input.nextInt();
            if (resp == 1) {
                System.out.println("Digite o valor que deseja saque: ");
                valor = input.nextDouble();
                if (valor > saldo || valor < 0) {
                    System.out.println("Valor insuficiente!");
                } else {
                    saldo -= valor;
                }
            } else if (resp == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                valor = input.nextDouble();
                if (valor < 0) {
                    System.out.println("Valor insuficiente!");
                }
                saldo += valor;
            } else {
                System.out.println("Número inválido");
            }
        } while (resp != 0);
    }
}
