import java.util.Scanner;

public class Ex35 {
    void main() {
        //35. MMC. Utilizando while e if, calcule o Mínimo Múltiplo Comum (MMC) entre dois números
        //inteiros.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = input.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = input.nextInt();
        int mmc;
        if (n1 > n2) {
            mmc = n1;
        } else {
            mmc = n2;
        }
        boolean controller = true;
        while (controller) {
            if (mmc % n1 == 0 && mmc % n2 == 0) {
                controller = false;
                break;
            }
            mmc ++;

        }
        System.out.println(mmc);
    }
}
