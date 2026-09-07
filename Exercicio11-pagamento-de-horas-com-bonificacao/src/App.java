import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do trabalhador: ");
        String nome = leitor.nextLine();
        System.out.println("Horas trabalhadas: ");
        double horas = leitor.nextDouble();
        System.out.println("Valor da hora: ");
        double valorHora = leitor.nextDouble();
        double salariobruto = horas*valorHora;
        double bonificacao = 0.0;

        
        if (salariobruto >= 1000) {
            bonificacao = salariobruto * 0.1;
        }
        double salarioliquido = salariobruto + bonificacao;

        System.out.println("O trabalhador " + nome + " recebeu o salário bruto de R$ " + salariobruto);
        System.out.println("Bonificação: R$ " + bonificacao);
        System.out.println("Salário líquido: R$ " + salarioliquido);

    }
}