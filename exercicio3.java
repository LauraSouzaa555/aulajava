package Atividades;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f", imc);
    }

	}


