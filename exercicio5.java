package Atividades;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da base do triângulo: ");
        double base = input.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é %.2f", area);
    }

	}


