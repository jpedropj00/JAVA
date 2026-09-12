import java.util.Scanner;

public class Ex33 {
    void main() {
        //33. Tabela Celsius-Fahrenheit. Utilizando for, monte uma tabela de conversão de Celsius para
        //Fahrenheit de 0°C a 100°C, destacando com if as temperaturas de congelamento (0°C) e ebulição
        //(100°C) da água.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores a serem lidos: ");
        int qtdValores = input.nextInt();

        for (int i = 0; i <= qtdValores; i++) {
            double celsius, fahrenheit;
            System.out.println("Digite o valor em celsius");

            celsius = input.nextDouble();
            fahrenheit = celsius * 1.8 + 32;
            if (fahrenheit == 32) {
                System.out.println("Ponto de fusão");
            } else if (fahrenheit == 212) {
                System.out.println("Ponto de ebulição");
            }

        }
    }
}
