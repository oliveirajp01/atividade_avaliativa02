import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Distancia percorrida (KM): ");
        double distancia = leitor.nextDouble();
        System.out.println("Litros de combustivel consumidos: ");
        double combustivel = leitor.nextDouble();
        double consumo = distancia/combustivel;
        if (consumo <= 10) {
            System.out.println("Alto consumo ");
        }else{
            System.out.println("Econômico ");
        }
        leitor.close();
    }
}
