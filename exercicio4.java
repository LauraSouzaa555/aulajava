package Atividades;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();

        double quadrado = valor * valor;
        double cubo = valor * valor * valor;

        System.out.printf("O valor ao quadrado é %.2f\n", quadrado);
        System.out.printf("O valor ao cubo é %.2f", cubo);
    }

	}


