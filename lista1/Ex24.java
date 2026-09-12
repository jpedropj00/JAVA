import java.util.Scanner;

public class Ex24 {
    void main() {
        //24. Uso de break. Percorra a tabuada de um número com while e, utilizando if e break, interrompa
        //o laço assim que encontrar o primeiro resultado múltiplo de 7.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int cont = 0;
        boolean controller = true;
        while (controller) {

            int resultado = num * cont;
            if (resultado % 7 == 0 && resultado != 0) {
                controller = false;
            }
            cont ++;
            System.out.println(resultado);

        }
    }
}
