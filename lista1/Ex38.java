import java.util.Scanner;

public class Ex38 {
    void main() {
//        38. Potência sem Math.pow. Utilizando for, calcule o valor de uma base elevada a um expoente
//        sem usar Math.pow(), tratando com if o caso especial de expoente igual a 0.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = input.nextInt();
        System.out.println("Digite o expoente:");
        int expoente = input.nextInt();
        int valPotencia = num;
        if (expoente < 0) {
            System.out.println("Expoente negativo");
        } else {
            if (expoente == 0) {
                System.out.println("Todo número elevado a 0 é 1");
            } else {
                for (int i = 1; i < expoente; i++) {
                    valPotencia = valPotencia * num;
                }
            }
        }
        System.out.println(valPotencia);

    }

}
