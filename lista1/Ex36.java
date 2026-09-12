import java.util.Scanner;

public class Ex36 {
    void main() {
        //36. Sequência crescente. Leia números inteiros em um laço, um a um, até que o usuário digite -1.
        //Utilizando if, verifique a cada novo número se ele é maior que o anterior e informe ao final se toda
        //a sequência informada foi crescente.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade: ");
        int n = sc.nextInt();
        boolean isOrdem = true;
        Integer numAnterior = null;
        int num, i = 1;
        do {
            System.out.println("Digite o num " + i + "° da sequência: ");
            num = sc.nextInt();
            if (numAnterior == null) {
                numAnterior = num;
            }
            if (isOrdem) {
                if  (num < numAnterior) {
                    isOrdem = false;
                }
            }
            i++;
            } while (num != -1 || i != n) ;
            if (isOrdem) {
                System.out.println("Sequência em ordem ");
            } else {
                System.out.println("Sequência não em ordem");
            }
        }
    }