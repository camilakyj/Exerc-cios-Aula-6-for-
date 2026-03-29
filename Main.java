// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {
public    static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int idade, contador = 0;
    double altura, somaAltura = 0;

    for (int i = 1;  i <=10; i++) {

        System.out.print("Digite a idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        if (idade > 50) {
            somaAltura += altura;
            contador ++;


        }
        }
    if (contador > 0) {
        double media = somaAltura / contador;
        System.out.println("Média das alturas:" + media);
    } else {
        System.out.println("Nenhuma pessoa com mais de 50 anos");

    }
    }
}
