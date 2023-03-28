package trabalho;

import java.util.Scanner;

public class Medicamento {
	String nome;
	double precoVenda;
	String laboratorio;
	boolean receitaObrigatoria;
	int qtdEstoque;
    Laboratorio lab;
	Data dataValidade;
	
	
	void reajustarPrecoVenda(){
        Scanner entrada = new Scanner (System.in);		
		int reajuste;
		double porcento, percentual = 0;
		System.out.print("\nInforme o percentual para reajuste: ");
		percentual = entrada.nextDouble();
		System.out.print("\n1- Acrescer \n2- Descontar");
		reajuste = entrada.nextInt();
		if(reajuste == 1) {
			porcento = percentual/100;
			this.precoVenda = this.precoVenda + (this.precoVenda * porcento);
			System.out.print("\nO valor atual da venda é: R$" + this.precoVenda);
		} if (reajuste == 2) {
			porcento = percentual/100;
			this.precoVenda = this.precoVenda - (this.precoVenda * porcento);
			System.out.print("\nO valor atual da venda é: R$" + this.precoVenda);
		}
		
	}
	
	void comprar(int quantidade){
		this.qtdEstoque += quantidade;
	}
	
	void vender(int quantidade){
		if(this.qtdEstoque > quantidade) {
			System.out.println("Aviso: Este produto necessita de receita!");
			this.qtdEstoque -= quantidade;
			
		}
		else {
			System.out.print("\nERRO! Quantidade superior ao estoque!\n");
		}
		
	}
	void mostrar() {
		System.out.println("\n" + this.nome);
		System.out.println("Valor: R$" + this.precoVenda);
		this.dataValidade.mostrarData();
		System.out.println("Laboratorio: " + this.lab.nomeFantasia);
		System.out.println("Quantidade em estoque: " + this.qtdEstoque);
	}
	
}
