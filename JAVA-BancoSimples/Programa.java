    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;
/**
 *
 * @author Doglas
 */
import java.util.*;

class Programa{
	public static void main (String[] args){
		Scanner entrada = new Scanner (System.in);
		int opt, numero = 0, lerConta;
		List<Conta> contas = new ArrayList<>();
		do{ 
			System.out.println("Digite o que deseja realizar na conta\n (0) Criar nova conta\n (1) Listar Contas Cadastradas\n (2) Efetuar Saque\n (3) Efetuar Deposito\n (4) Sair\n");
			opt = entrada.nextInt();

			if (opt == 0) {
				String lixo = entrada.nextLine();
				Conta minhaConta = new Conta();
				System.out.println("Digite o nome do titular dessa conta:");
				minhaConta.dono = entrada.nextLine();
				System.out.println("Digite o saldo inicial dessa conta:");
				minhaConta.saldo = entrada.nextDouble();
				minhaConta.numero = numero;
				numero++;
				contas.add(minhaConta);

			} else if (opt == 1) {
				for (int i = 0; i < numero; i++) {
					Conta a = contas.get(i);
					System.out.println("\nNumero da Conta: " + a.numero);
					System.out.println("Conta do(a): " + a.dono);
					System.out.println("Seu saldo atual eh R$" + a.saldo);

				}

			} else if (opt == 2) {
				System.out.println("\nNumero da Conta para saque(a): ");
				lerConta = entrada.nextInt();
				Conta saqueConta = contas.get(lerConta);
				System.out.println("\nNumero da Conta: " + saqueConta.numero);
				System.out.println("Conta do(a): " + saqueConta.dono);
				System.out.println("Seu saldo atual eh R$ " + saqueConta.saldo);
				System.out.println("Qual o valor do saque\n?");

				if (saqueConta.saca(entrada.nextDouble())) {
					System.out.println("Saque efetuado!\nNovo Saldo R$ " + saqueConta.saldo);

				} else {
					System.out.println("Saldo insuficiente!\n");
				}

			} else if (opt == 3) {
				System.out.println("\nNumero da Conta para Deposito(a): ");
				lerConta = entrada.nextInt();
				Conta depositaConta = contas.get(lerConta);
				System.out.println("\nNumero da Conta: " + depositaConta.numero);
				System.out.println("Conta do(a): " + depositaConta.dono);
				System.out.println("Seu saldo atual eh R$ " + depositaConta.saldo);
				System.out.println("Qual o valor do deposito\n?");
				depositaConta.deposita(entrada.nextDouble());

			} else if (opt == 4) {
				System.out.println("Saiu da aplicacao\n");
			} else {
				System.out.println("Opcao invalida\n");
			}
		} while(opt != 4);
	}
}