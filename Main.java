// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maiores50 = 0;
        int contAltura = 0;
        double somaAltura = 0;
        int pesoMenor40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa" + i + ":");

            System.out.print("Idade: ");
            int idade = entrada.nextInt();

            System.out.print("Altura: ");
            double altura = entrada.nextInt();

            System.out.print("Peso: ");
            double peso = entrada.nextDouble();

            if (idade > 50) {
                maiores50++;
            }
            if (idade >=10 && idade <= 20) {
                somaAltura += altura;
                contAltura++;

            }
            if (peso < 40) {
                pesoMenor40++;
            }
            System.out.println();

            }
        System.out.println("Quantidade de pessoas com mais de 50 anos:" + maiores50);

        if (contAltura > 0 ) {
            double mediaAltura = somaAltura / contAltura;
            System.out.println("Média das alturas ( 10 a 20 anos): " + mediaAltura);
        } else {
            System.out.println("Não há pessoas entre 10 e 20 anos.");
        }
        double porcentagem = (pesoMenor40 * 100.0) / 10;
        System.out.println("Porcentagem com peso inferior a 40kg: " + porcentagem + "%");

        entrada.close();
        }
    }
