package lista1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex16 {
    void main() {
        //16. Número de Armstrong. Utilizando for e if, verifique se um número é de Armstrong (a soma de
        //cada dígito elevado à quantidade de dígitos é igual ao próprio número, ex.: 153 = 13+53+33).
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        String numString = String.valueOf(num);
        int soma = 0;
        for (int i = 0; i <= numString.length() - 1; i++) {
            System.out.println(i);
            int expoente = numString.length();
            int numPequeno = Integer.parseInt(String.valueOf(numString.charAt(i)));
            soma = soma + (int) pow(numPequeno, expoente);
        }
        if (soma == num) {
            System.out.println("São Armstrong");
            System.out.println(soma);
        } else {
            System.out.println("Diferentes");
        }
    }
}
