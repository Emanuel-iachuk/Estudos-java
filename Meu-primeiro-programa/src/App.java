import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner snc = new Scanner(System.in);

    public static int soma(int n1, int n2){
        return n1 + n2;
    }

    public static void main(String[] args){
        while(true){
            try {
                System.out.println("Digite um numero:");
                int numero1 = snc.nextInt();
                System.out.println("Digite outro numero:");
                int numero2 = snc.nextInt();
                int resultado = soma(numero1, numero2);

                System.out.println("Resultado: " + resultado);

                snc.nextLine();

                break;
            } catch (InputMismatchException e) {
                System.out.println("❌ Digite APENAS números válidos!");
                snc.nextLine();

            }
        }
        snc.close();
    }
}
