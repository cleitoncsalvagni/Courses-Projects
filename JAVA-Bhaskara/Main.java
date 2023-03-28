import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int val_a, val_b, val_c;

		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor de A: ");
		val_a = entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		val_b = entrada.nextInt();		
		System.out.println("Digite o valor de C: ");
		val_c = entrada.nextInt();		
		
		Bhaskara b = new Bhaskara(val_a, val_b, val_c);
		
		b.calculaRaizes();

	}

}
