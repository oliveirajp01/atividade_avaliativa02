import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner leitor = new Scanner(System.in);

    System.out.println("Graus Celsius: ");
    double grau = leitor.nextDouble();
    
    double f = grau*9.0/5.0 + 32;
    
    System.out.println(" Graus Celsius:  " + grau );
    System.out.println(" Fahrenheit: " + f );

    leitor.close();
    }
}
