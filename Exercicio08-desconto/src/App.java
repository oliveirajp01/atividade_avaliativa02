import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Preço: ");
    double preco = leitor.nextDouble();
    System.out.println("Quantidade: ");
    int qtd = leitor.nextInt();

    double total = preco*qtd;
    double desconto = 0.0;

    if (total >= 200.0) {
        desconto = total * 0.05;
    } 

    double valorFinal = total - desconto;
    System.out.println("Subtotal: R$ " + total);
    System.out.println("Desconto: R$ " + desconto);
    System.out.println("Total a pagar: R$ " + valorFinal );

        leitor.close();

        
        
    }
}
