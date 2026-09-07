import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Valor do Produto:");
    double valorproduto = leitor.nextDouble();
    System.out.println("Valor do Frete: ");
    double valordoFrete = leitor.nextDouble();
    if (valorproduto >= 150) {
        System.out.println("Frete Grátis");
    }else{
        System.out.println("Valor do Frete: " + valordoFrete);
    }
    
    leitor.close();
    }
}
