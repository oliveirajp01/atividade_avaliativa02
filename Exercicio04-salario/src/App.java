import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Horas Trabalhadas: ");
        double horas = Leitor.nextDouble();
        System.out.println("Valor da hora: ");
        double valorHora = Leitor.nextDouble();
        double salario = horas*valorHora;
        System.out.println("Salário: " + salario);
        if (salario < 2000)  { 
            System.out.println("Salario Minimo");
        } else{
            System.out.println("Salario acima do minimo");
        }
        if (salario == 0 ) {
            System.out.println("Vai trabalhar vagabundo");
        }

        Leitor.close();
    }
}
