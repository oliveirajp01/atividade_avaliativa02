import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Nota 1: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = leitor.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno " +nome+ " é: " +media);
        if (media >= 7) {
        System.out.println("Aluno aprovado ");
        }else{
            System.out.println("Aluno reprovado ");
        }

        leitor.close();

    }
}
