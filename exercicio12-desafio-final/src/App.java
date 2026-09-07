import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o poder de ataque do personagem: ");
        double poderAtaque = leitor.nextDouble();

        System.out.print("Informe a quantidade de golpes: ");
        int quantidadeGolpes = leitor.nextInt();

        System.out.print("Informe a precisão do ataque (0 a 100%): ");
        double precisao = leitor.nextDouble();

        double danoBase = poderAtaque*quantidadeGolpes;
        double bonusCritico;

        double precisaoMinimaCritico = 80.0;
        double bonusDanoCritico = 50.0;

        if (precisao >= precisaoMinimaCritico) {
            bonusCritico = bonusDanoCritico;
        } else {
            bonusCritico = 0.0;
        }

        double danoTotal = danoBase + bonusCritico;

        System.out.println("--- RELATÓRIO DO ATAQUE ---");
        System.out.printf("Dano Base: "+ danoBase);
        
        if (bonusCritico > 0.0) {
            System.out.printf("Bônus Crítico: "+ bonusCritico);
        } else {
            System.out.println("Bônus Crítico: 0.00 pts");
        }

        System.out.printf("Dano Total Causado: " + danoTotal);

        leitor.close();
    }
}
