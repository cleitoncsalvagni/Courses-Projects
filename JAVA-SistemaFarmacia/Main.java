package trabalho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int opt = 0;
        Scanner entrada = new Scanner (System.in);
        Medicamento medicamento1 = new Medicamento();
        medicamento1.nome = "Ibuprofeno 500MG";
        medicamento1.precoVenda = 35.50;
        medicamento1.laboratorio = "Farmacia Popular";
        medicamento1.receitaObrigatoria = true;
        medicamento1.qtdEstoque = 10;
        
        Laboratorio laboratorio1 = new Laboratorio();
        laboratorio1.nomeFantasia = "Salvagni Lab";
        laboratorio1.razaoSocial = "Salvagni Solucoes Laboratoriais";
        laboratorio1.cnpj = "13.125.642/0001-62";
        laboratorio1.endereco = "Avenida Brasil, Chapeco, SC";
        laboratorio1.inscricaoEstadual = "320085650";
        laboratorio1.telefone = "(49) 9 9915-1372";
        
        medicamento1.lab = laboratorio1;
        Data dataValidade = new Data();
        dataValidade.dia = 12;
        dataValidade.mes = 10;
        dataValidade.ano = 2025;
        
        medicamento1.dataValidade = dataValidade;
        
        do {
        	System.out.println("\n| Produto Selecionado: " + medicamento1.nome + " |");
        	System.out.print("1- Comprar \n2- Vender \n3- Reajuste Preco \n4- Mostrar Medicamento \n5- Sair\n");
        	opt = entrada.nextInt();
        	
        	if(opt == 1) {
        		System.out.print("Digite a quantidade que deseja comprar: ");
        		medicamento1.comprar(entrada.nextInt());
     
        	} if(opt == 2) {
        		System.out.print("Informe a quantidade que deseja vender: ");
        		medicamento1.vender(entrada.nextInt());
        	} if(opt == 3) {
        		medicamento1.reajustarPrecoVenda();
        		
        	} if(opt == 4) {
        		medicamento1.mostrar();
  
        	} if(opt == 5) {
        		System.out.print("\nFinalizando o programa. Obrigado!");
        		System.exit(0);
        	}
        } while (opt !=5);
	}
}
