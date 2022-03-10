import java.util.Scanner;

public class projetoidades {

    public static void main(String[] args) {

    int idade;

    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite sua idade para ser encaminhado à fila correta:");
    idade = leitor.nextInt();

    if (idade <60) {
        System.out.println("\nVocê deve se encaminhar para a FILA COMUM");
    }else if (idade >80) { 
        System.out.println("\nVocê deve se encaminhar para a FILA 80+");
    }else{
        System.out.println("\nVocê deve se encaminhar para a FILA PRIORITÁRIA");
         }
    
/*Atendendo ao Estatuto, escreva um programa que solicite a idade do usuário a ser atendido a 
fim de encaminhá-lo para a:
- fila comum, menor que 60 anos
- fila prioritária, 60 anos ou mais 
- “fila 80+”, maior que 80 anos. */
    }
    
} 