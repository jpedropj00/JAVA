import java.util.Scanner;

public class Ex30 {
    void main() {
        //30. Menu de calculadora. Crie um menu (soma, subtração, multiplicação, divisão e sair) utilizando
        //do-while e switch-case, tratando com if a tentativa de divisão por zero.
        Scanner input = new Scanner(System.in);
        final String MENU = """
                1 - SOMA
                2 - SUBTRAÇÃO
                3 - MULTIPLICAÇÂO
                4 - DIVISÃO
                0 - SAIR
                """;
        String resp;
        double num1, num2, resultado;
        do {
            System.out.println(MENU);
            System.out.println("Digite um número: ");
            resp = input.nextLine();
            if ( ! isNumerico(resp)) {
                System.out.println("Número inválido");
                continue;
            }
            switch (resp) {
                case "1":
                    System.out.println("Digite um número: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite outro número: ");
                    num2 = input.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("A soma é: " + resultado);
                    break;
                case "2":
                    System.out.println("Digite um número: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite outro número: ");
                    num2 = input.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("A soma é: " + resultado);
                    break;
                case "3":
                    System.out.println("Digite um número: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite outro número: ");
                    num2 = input.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("A multiplicação é: " + resultado);
                    break;
                case "4":
                    System.out.println("Digite um número: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite outro número: ");
                    num2 = input.nextDouble();
                    try {
                        resultado = num1 / num2;
                        System.out.println(resultado);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                case "0":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (resp.equals("0"));

    }
    public static boolean isNumerico(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
