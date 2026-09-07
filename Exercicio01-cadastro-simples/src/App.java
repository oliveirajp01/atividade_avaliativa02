import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Cidade: ");
        String cidade = leitor.nextLine();
        
        System.out.println("Idade: ");
        int idade = leitor.nextInt();
        
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos e mora em " + cidade + "!");
        
        leitor.close();
    }
}
