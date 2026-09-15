package lista1;
public class Ex05 {
    public static void main(String[] args) {
        //5. Contagem de primos. Utilizando for (com um for interno para testar os divisores) e if, conte
        //quantos números primos existem entre 1 e 50 e exiba o total.
        int contTotal = 0;
        for (int i = 1; i <= 50; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                contTotal++;
            }
        }
        System.out.println(contTotal);
    }
}
