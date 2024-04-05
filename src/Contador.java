import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número 1: ");
        int number1 = scanner.nextInt();

        System.out.println("Entre com o número 2: ");
        int number2 = scanner.nextInt();

        System.out.println(number1 + " " + number2);

        try {
            contar(number1, number2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O número2 tem de ser maior que o número1");
        }
    }

    static void contar(int number1, int number2) throws ParametrosInvalidosException {
        if(number1 > number2) throw new ParametrosInvalidosException();

        int contagem = number2 - number1;

        for(int i = 1; i <= contagem; i++) {
            System.out.println("Contador: " + i);
        }
    }
}
