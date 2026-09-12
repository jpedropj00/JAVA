
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex32 {
    //32. Pirâmide de asteriscos. Utilizando for aninhado (laço dentro de laço) e if para controlar
    //espaços, monte uma pirâmide de asteriscos (*) com N linhas.
    void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int qtdLinhas = input.nextInt();
        for (int i = 0; i < qtdLinhas; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
