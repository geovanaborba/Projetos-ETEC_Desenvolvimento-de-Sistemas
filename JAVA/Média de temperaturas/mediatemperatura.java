import java.util.Scanner;

public class mediatemperatura {

    public static void main(String[] args) {

        float temperatura = 0, soma = 0, media;

        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            System.out.println("\n MEDIA DE TEMPERATURAS DA SEMANA");

            System.out.println("Digite a maior temperatura de cada um dos dias da semana: " + i);
            temperatura = leitor.nextFloat();
            soma = soma + temperatura;
        }
        media = soma / 7;
        System.out.println("\nA média das temperaturas mais altas da semana é de: " + media);
    }
}
