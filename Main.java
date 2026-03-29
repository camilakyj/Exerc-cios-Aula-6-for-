// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.print("Digite um número:");
        numero = entrada.nextInt();

        for (int cont = 1; cont <= numero; cont++) {
            System.out.print(cont + " ");


        }
    }
}
