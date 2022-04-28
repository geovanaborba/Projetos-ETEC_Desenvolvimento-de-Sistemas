
import javax.swing.JOptionPane;

public class VooBagagem {

    public static void main(String[] args) {
        double bagagem1, bagagem2, bagagem3, bagagem4, bagagem5, bagagem6, bagagem7, bagagem8, bagagem9, bagagem10;
        double pesototal;
        String voo;
        int retorno;

        try {

            voo = (JOptionPane.showInputDialog(null, "Qual é o seu vôo?", "Identificação de vôo", JOptionPane.QUESTION_MESSAGE));

            bagagem1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 1ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 2ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 3ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 4ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 5ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 6ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 7ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem8 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 8ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem9 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 9ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem10 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 10ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));

            pesototal = bagagem1 + bagagem2 + bagagem3 + bagagem4 + bagagem5 + bagagem6 + bagagem7 + bagagem8 + bagagem9 + bagagem10;
            JOptionPane.showMessageDialog(null, "Identificação de Vôo: \n" + voo
                    + "\n\nPeso médio das malas: \nMala 1: " + bagagem1
                    + "\nMala 2: " + bagagem2
                    + "\nMala 3: " + bagagem3
                    + "\nMala 4: " + bagagem4
                    + "\nMala 5: " + bagagem5
                    + "\nMala 6: " + bagagem6
                    + "\nMala 7: " + bagagem7
                    + "\nMala 8: " + bagagem8
                    + "\nMala 9: " + bagagem9
                    + "\nMala 10: " + bagagem10
                    + "\n\nPeso total da carga: " + pesototal + " kgs", "Relatório", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao executar o programa. Por favor, insira o peso das malas somente com números e com ponto ( . ), invés de vírgula.", "ERRO", JOptionPane.ERROR_MESSAGE);

            voo = (JOptionPane.showInputDialog(null, "Qual é o seu vôo?", "Identificação de vôo", JOptionPane.QUESTION_MESSAGE));

            bagagem1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 1ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 2ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 3ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 4ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 5ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 6ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 7ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem8 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 8ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem9 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 9ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem10 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 10ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));

            pesototal = bagagem1 + bagagem2 + bagagem3 + bagagem4 + bagagem5 + bagagem6 + bagagem7 + bagagem8 + bagagem9 + bagagem10;

            JOptionPane.showMessageDialog(null, "Identificação de Vôo: \n" + voo + "\n\nPeso médio das malas: "
                    + "\nMala 1: " + bagagem1
                    + "\nMala 2: " + bagagem2
                    + "\nMala 3: " + bagagem3
                    + "\nMala 4: " + bagagem4
                    + "\nMala 5: " + bagagem5
                    + "\nMala 6: " + bagagem6
                    + "\nMala 7: " + bagagem7
                    + "\nMala 8: " + bagagem8
                    + "\nMala 9: " + bagagem9
                    + "\nMala 10: " + bagagem10
                    + "\n\nPeso total da carga: " + pesototal + " kgs", "Relatório", JOptionPane.INFORMATION_MESSAGE);
        }

        //código para aplicação continuar//
        retorno = JOptionPane.showConfirmDialog(null, "Deseja fechar a aplicação?");

        if (retorno == JOptionPane.YES_OPTION) {
            System.out.println("Programa encerrado");

        } else if (retorno == JOptionPane.NO_OPTION) {
            voo = (JOptionPane.showInputDialog(null, "Qual é o seu vôo?", "Identificação de vôo", JOptionPane.QUESTION_MESSAGE));

            bagagem1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 1ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 2ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 3ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 4ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 5ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 6ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 7ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem8 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 8ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem9 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 9ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));
            bagagem10 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da 10ª mala", "Verificação de peso", JOptionPane.WARNING_MESSAGE));

            pesototal = bagagem1 + bagagem2 + bagagem3 + bagagem4 + bagagem5 + bagagem6 + bagagem7 + bagagem8 + bagagem9 + bagagem10;
            JOptionPane.showMessageDialog(null, "Identificação de Vôo: \n" + voo
                    + "\n\nPeso médio das malas: \nMala 1: " + bagagem1
                    + "\nMala 2: " + bagagem2
                    + "\nMala 3: " + bagagem3
                    + "\nMala 4: " + bagagem4
                    + "\nMala 5: " + bagagem5
                    + "\nMala 6: " + bagagem6
                    + "\nMala 7: " + bagagem7
                    + "\nMala 8: " + bagagem8
                    + "\nMala 9: " + bagagem9
                    + "\nMala 10: " + bagagem10
                    + "\n\nPeso total da carga: " + pesototal + " kgs", "Relatório", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
