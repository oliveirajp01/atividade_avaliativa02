import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Negativo ou Positivo: ");
        int numero = leitor.nextInt();
        if (numero < 0) {
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número é positivo");
        }
        
    }
}
