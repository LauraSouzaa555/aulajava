package Atividades;
import java.util.Scanner;
public class exercico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.2f Celsius equivalem a %.2f Fahrenheit.", celsius, fahrenheit);
    }

	}


