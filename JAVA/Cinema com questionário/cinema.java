import javax.swing.JOptionPane;

public class cinema {

    public static void main(String[] args) {
        int idade = 0, somaidade = 0, Otimo = 0, Bom = 0, Regular = 0, Ruim = 0, Pessimo = 0, pessoa = 0, media_ruim = 0;
        int lugares = 40;
        char nota;

        while (pessoa < lugares) {
            pessoa = pessoa + 1;
            try {
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, informe a sua idade: ", "Idade", JOptionPane.QUESTION_MESSAGE));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);

                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, informe a sua idade: ", "Idade", JOptionPane.QUESTION_MESSAGE));
            }

            nota = JOptionPane.showInputDialog("Digite a nota (como letra) que você deseja dar em relação ao filme, sendo "
                    + "\n A - para Ótimo "
                    + "\n B - para Bom"
                    + "\n C - para Regular"
                    + "\n D - para Ruim"
                    + "\n E - para Péssimo").charAt(0);

            switch (nota) {
                case 'A':
                case 'a':
                    Otimo = Otimo + 1;
                    break;

                case 'B':
                case 'b':
                    Bom = Bom + 1;
                    break;

                case 'C':
                case 'c':
                    Regular = Regular + 1;
                    break;

                case 'D':
                case 'd':
                    Ruim = Ruim + 1;
                    if (Ruim >= 1) {
                        somaidade += idade;
                        media_ruim = somaidade / Ruim;
                    }
                    break;

                case 'E':
                case 'e':
                    Pessimo = Pessimo + 1;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida. Digite apenas letras.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de pessoas que responderam A - Ótimo: " + Otimo + " pessoa(s)."
                + "\n__________________________________________________________________________________ "
                + "\n Média de idade das pessoas que responderam Ruim: " + media_ruim + " anos."
                + "\n__________________________________________________________________________________ "
                + "\n Porcentagem de pessoas que avaliaram como E - Péssimo: " + (Pessimo * 100 / lugares) + "%.");
    }
}
