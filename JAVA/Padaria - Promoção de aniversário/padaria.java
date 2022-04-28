
import javax.swing.JOptionPane;

public class padaria {


    public static void main(String[] args) {
        
        float preco;
        String produto;
        float desconto;

        JOptionPane.showMessageDialog(null, "Promoção de aniversário!! \n10 produtos com a metade do preço!", "Padaria", JOptionPane.WARNING_MESSAGE);
        
        for (int i=1; i<=10; i++){ 
            produto = JOptionPane.showInputDialog(null, "\nDigite o nome do produto: " + i ,"Produto", JOptionPane.QUESTION_MESSAGE);

            preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor original do produto inserido: " + i, "Valor Original", JOptionPane.QUESTION_MESSAGE));

            desconto = (float) (preco*0.50);
            JOptionPane.showMessageDialog(null, "Produto: " +produto+ "  \n\nValor com desconto: R$ " +desconto);

        }   
    }
}

/* PROGRAMA COM PRINTLN


import java.util.Scanner;
public class padaria {


    public static void main(String[] args) {
        
        float preco;
        String produto;
        float desconto;

        System.out.println("Promoção de aniversário!! \n10 produtos com a metade do preço!");
            Scanner ler = new Scanner(System.in);
        
        for (int i=1; i<=10; i++){ 
            System.out.println("\nDigite o nome do produto: " + i);
            produto = ler.next();

            System.out.println("Digite o valor original do produto inserido: " + i);
            preco = ler.nextFloat();

            desconto = (float) (preco*0.50);
            System.out.println("\nProduto: " +produto+ " // Valor com desconto: R$ " +desconto);
        }   
    }
}
   */
