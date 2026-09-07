import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Idade: ");
        int idade = Leitor.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }
}
