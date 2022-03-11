import java.util.Scanner;

public class ImpostoRenda {

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
        
        double pagar_cd;
        double pagar_sd;
       
        Scanner leitor = new Scanner (System.in);
       
        System.out.println("Defina qual é o seu salário bruto");
        salario = leitor.nextDouble();
        
        
        if (salario <= 1903.98){
            System.out.println("Você é isento do Imposto de Renda");
        }else if (salario > 1903.98 && salario <= 2826.65){
            pagar_sd = salario*aliquota1;
            pagar_cd = salario*aliquota1-desconto1;
            salario = salario - pagar_cd;
            System.out.println("A Alíquota do seu salário é de 7,5% e o valor a ser descontado é de R$" +desconto1+"\nRELATÓRIO:\nImposto à pagar sem o desconto = " + pagar_sd + " reais\nImposto à pagar com o desconto = "+ pagar_cd + " reais\nSalário líquido = R$ "+salario+ " reais");
        }else if (salario > 2826.65 && salario <= 3751.06){
            pagar_sd = salario*aliquota2;
            pagar_cd = salario*aliquota2-desconto2;
            salario = salario - pagar_cd;
            System.out.println("A Alíquota do seu salário é de 7,5% e o valor a ser descontado é de R$" +desconto2+"\nRELATÓRIO:\nImposto à pagar sem o desconto = " + pagar_sd + " reais\nImposto à pagar com o desconto = "+ pagar_cd + " reais\nSalário líquido = R$ "+salario+ " reais");
        }else if (salario > 3751.06 && salario <= 4664.68) {
            pagar_sd = salario*aliquota3;
            pagar_cd = salario*aliquota3-desconto3;
            salario = salario - pagar_cd;
            System.out.println("A Alíquota do seu salário é de 7,5% e o valor a ser descontado é de R$" +desconto3+"\nRELATÓRIO:\nImposto à pagar sem o desconto = " + pagar_sd + " reais\nImposto à pagar com o desconto = "+ pagar_cd + " reais\nSalário líquido = R$ "+salario+ " reais");
        }else {
            pagar_sd = salario*aliquota4;
            pagar_cd = salario*aliquota4-desconto4;
            salario = salario - pagar_cd;
            System.out.println("A Alíquota do seu salário é de 7,5% e o valor a ser descontado é de R$" +desconto4+"\nRELATÓRIO:\nImposto à pagar sem o desconto = " + pagar_sd + " reais\nImposto à pagar com o desconto = "+ pagar_cd + " reais\nSalário líquido = R$ "+salario+ " reais");
        }
        }
    
}
