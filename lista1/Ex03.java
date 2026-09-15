package lista1;

public class Ex03 {
    public static void main(String[] args) {
        //3. Soma dos ímpares. Utilizando while e if, some todos os números ímpares entre 1 e 100 e exiba o
        //resultado.
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números ímpares de 1 até 100 é: " + soma);
    }
}
