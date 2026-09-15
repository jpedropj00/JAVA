package lista1;
public class Ex04 {
    public static void main(String[] args) {
        //4. FizzBuzz. De 1 a 50, exiba "Fizz" se o número for múltiplo de 3, "Buzz" se for múltiplo de 5,
        //"FizzBuzz" se for múltiplo de ambos, e o próprio número nos demais casos (for + if/else if).
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz: " + i);
            }  else if (i % 3 == 0) {
                System.out.println("Fizz: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
            }
        }
    }
}
