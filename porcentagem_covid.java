/*Escreva um fluxograma e a codificação em Java para calcular o percentual de casos de coronavírus nas regiões do Brasil. Para tanto, o programa deve ler os seguintes dados:
1. Número de casos no Brasil
2. Nome da região
3. Número de casos da região
 
O programa deve exibir na tela um painel de dados com as seguintes informações:
1. Nome da região
2. Número de casos no Brasil
3. Número de casos digitado
4. Porcentual que a região representa em relação ao total de casos no Brasil*/


import java.util.Scanner;

public class porcentagem_covid {
 
    public static void main(String[] args) {
        
    int n_casosBrasil;
    int n_casosRegiao;
    String nome_regiao;
    float porcentagem;
        
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("Este programa calculará o porcentual de casos de corona em sua região");
    
    System.out.println("Digite o nº de casos no Brasil:");
    n_casosBrasil = leitor.nextInt();
    
    System.out.println("Digite o nome da região:");
    nome_regiao = leitor.next();
    
    System.out.println("Digite o nº de casos na região:");
    n_casosRegiao = leitor.nextInt();
    
    porcentagem = (n_casosRegiao*100)/n_casosBrasil;

    System.out.println("\nCASOS DE COVID: \nRegião: "+nome_regiao+"\nNúmero de casos no Brasil: "+n_casosBrasil+"\nNúmero de casos em "
            +nome_regiao+": "+n_casosRegiao+"\nPorcentual de casos na região: "+porcentagem+"%");
    
    }
    
}
