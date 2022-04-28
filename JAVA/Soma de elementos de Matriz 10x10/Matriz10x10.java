import javax.swing.JOptionPane;

public class Matriz10x10 {

    public static void main(String[] args) {

        int num[][] = new int[10][10];
        int soma = 0;
        int linha, coluna;
        String mostrar = "";

        try {
            JOptionPane.showMessageDialog(null, "Inserindo os dados na Matriz", "Programa Matriz", JOptionPane.PLAIN_MESSAGE);
            for (linha = 0; linha < 10; linha++) {
                for (coluna = 0; coluna < 10; coluna++) {
                    num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número para a: " + "\n Linha " + linha + "\nColuna " + coluna, "Inserção de dados", JOptionPane.WARNING_MESSAGE));
                }
            }

            JOptionPane.showMessageDialog(null, "Mostrando os dados na Matriz", "Mostrar dados", JOptionPane.PLAIN_MESSAGE);
            for (linha = 0; linha < 10; linha++) {
                for (coluna = 0; coluna < 10; coluna++) {
                    mostrar += num[linha][coluna] + " | ";
                    soma += num[linha][coluna]; //soma de TODA  a matriz
                    //JOptionPane.showMessageDialog(null, "Linha " + linha + "\nColuna " + coluna + "\nNúmero inserido: " + num[linha][coluna]);
                }
                mostrar += "\n";
            }
            JOptionPane.showMessageDialog(null, "Matriz Completa: \n\n" + mostrar, "Matriz", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "Soma dos elementos inseridos: \n\n" + soma, "Soma dos valores", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você não inseriu um dado válido. Por favor, utilize apenas números inteiros. \n\n O programa será reiniciado.", "ERRO", JOptionPane.ERROR_MESSAGE);

            JOptionPane.showMessageDialog(null, "Inserindo os dados na Matriz", "Programa Matriz", JOptionPane.PLAIN_MESSAGE);
            for (linha = 0; linha < 10; linha++) {
                for (coluna = 0; coluna < 10; coluna++) {
                    num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número para a: " + "\n Linha " + linha + "\nColuna " + coluna, "Inserção de dados", JOptionPane.WARNING_MESSAGE));
                }
            }

            JOptionPane.showMessageDialog(null, "Mostrando os dados na Matriz", "Mostrar dados", JOptionPane.PLAIN_MESSAGE);
            for (linha = 0; linha < 10; linha++) {
                for (coluna = 0; coluna < 10; coluna++) {
                    mostrar += num[linha][coluna] + " | ";
                    soma += num[linha][coluna]; //soma de TODA  a matriz
                    //JOptionPane.showMessageDialog(null, "Linha " + linha + "\nColuna " + coluna + "\nNúmero inserido: " + num[linha][coluna]);
                }
                mostrar += "\n";
            }
            JOptionPane.showMessageDialog(null, "Matriz Completa: \n\n" + mostrar, "Matriz", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "Soma dos elementos inseridos: \n\n" + soma, "Soma dos valores", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
