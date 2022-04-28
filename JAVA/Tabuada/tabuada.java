
import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {

        int num;
        int resultado;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número da tabuada desejada: ");
        num = leitor.nextInt();

        for (int i = 0; i < 11; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}

/* PROGRAMA COM JOPTIONPANE


import javax.swing.JOptionPane;
        
public class tabuada {

    public static void main(String[] args) {

        int num;
        int resultado;
    
        try{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da tabuada desejada: ", "Tabuada",JOptionPane.WARNING_MESSAGE));

            for (int i = 0; i < 11; i++) {
            resultado= num* i;
            JOptionPane.showMessageDialog(null, num + " x " + i + " = " + resultado);
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao executar o programa. Por favor, utilize números válidos.", "ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
}
 */
