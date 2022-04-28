import java.util.Scanner;

public class TabuadaWhile {

    public static void main(String[] args) {

        int num, resultado, num2 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número da tabuada desejada: ");
        num = leitor.nextInt();

        while (num2 <= 10) {
            resultado = num * num2;
            System.out.println(num + " x " + num2++ + " = " + resultado);
        }
    }
}
