import java.util.Scanner;

public class Ex18 {
    void main(){
        //18. Soma dos dígitos. Utilizando while, calcule e exiba a soma dos dígitos de um número inteiro
        //(ex.: 1234 → 1+2+3+4 = 10).
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int soma = 0;
        while (num != 0) {
            int digito = num % 10;
            soma = soma + digito;
            num = num / 10;
        }
        System.out.println(soma);
    }
}
