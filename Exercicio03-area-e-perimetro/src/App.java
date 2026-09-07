import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Base: ");
        double base = Leitor.nextDouble();
        System.out.print("Altura: ");
        double altura = Leitor.nextDouble();
        double area = base*altura;
        System.out.println("Área: " + area);
        double perimetro = 2*(base+altura);
        System.out.println("Perímetro: " + perimetro);
        if (area < 13) {
            System.out.println("Área menor que 13");
        } else {
        System.out.println("Área maior que 13");
        }
        Leitor.close();
    }
}
