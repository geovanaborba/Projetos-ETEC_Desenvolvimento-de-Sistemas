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
