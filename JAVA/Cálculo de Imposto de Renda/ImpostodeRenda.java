import java.util.Scanner;

public class ImpostodeRenda {

    public static void main(String[] args) {
        
        double salario;
        
        double aliquota1 = 0.075;
        double aliquota2 = 0.15;
        double aliquota3 = 0.225;
        double aliquota4 = 0.275;
       
        double desconto1 = 142.80;
        double desconto2 = 354.80;
        double desconto3 = 636.13;
        double desconto4 = 869.36;
        
       
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("CALCULADORA DE IMPOSTO DE RENDA");
        System.out.println("Defina qual é o seu salário bruto: ");
        salario = leitor.nextDouble();
        
        
        if (salario <= 1903.98){
            System.out.println("Você é isento do Imposto de Renda");
        }else if (salario > 1903.98 && salario <= 2826.65){
            System.out.println("A Alíquota do seu salário é de 7,5% e o valor a ser descontado é de R$" +desconto1+"\n\nRELATÓRIO:\nSalário declarado: R$ "+salario+"\nImposto à pagar sem o desconto = R$ " +(salario*aliquota1)+ "\nImposto à pagar com o desconto = R$ "+(salario*aliquota1-desconto1)+ "\nSalário líquido = R$ "+(salario-(salario*aliquota1-desconto1)));
         }else if (salario > 2826.65 && salario <= 3751.06){
            System.out.println("A Alíquota do seu salário é de 15% e o valor a ser descontado é de R$"+desconto2+"\n\nRELATÓRIO:\nSalário declarado: R$ "+salario+"\nImposto à pagar sem o desconto = R$ " +(salario*aliquota2)+ "\nImposto à pagar com o desconto = R$ "+(salario*aliquota2-desconto2)+"\nSalário líquido = R$ "+(salario-(salario*aliquota2-desconto2)));
         }else if (salario > 3751.06 && salario <= 4664.68) {
            System.out.println("A Alíquota do seu salário é de 22,5% e o valor a ser descontado é de R$"+desconto3+"\n\nRELATÓRIO:\nSalário declarado: R$ "+salario+"\nImposto à pagar sem o desconto = R$ " +(salario*aliquota3)+ "\nImposto à pagar com o desconto = R$ "+(salario*aliquota3-desconto3)+"\nSalário líquido = R$ "+(salario-(salario*aliquota3-desconto3)));
         }else {
            System.out.println("A Alíquota do seu salário é de 27,5% e o valor a ser descontado é de R$"+desconto4+"\n\nRELATÓRIO:\nSalário declarado: R$ "+salario+"\nImposto à pagar sem o desconto = R$ " +(salario*aliquota4)+ "\nImposto à pagar com o desconto = R$ "+(salario*aliquota4-desconto4)+ "\nSalário líquido = R$ "+(salario-(salario*aliquota4-desconto4)));
         }
        }
    
}
    