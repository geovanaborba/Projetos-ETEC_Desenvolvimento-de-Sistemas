 import javax.swing.JOptionPane;

 public class agenda05 {

 public static void main(String[] args) {

 int idade; 

idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade para ser encaminhado à fila correta:"));

    if (idade <60) {
        JOptionPane.showMessageDialog(null,"Você deve se encaminhar para a FILA COMUM");
    }else if (idade >80) { 
        JOptionPane.showMessageDialog(null,"Você deve se encaminhar para a FILA 80+");
    }else{
        JOptionPane.showMessageDialog(null,"Você deve se encaminhar para a FILA PRIORITÁRIA");
    }
}
 
}