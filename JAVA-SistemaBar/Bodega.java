package bodega;
import javax.swing.JOptionPane;
import java.util.*;

public class Bodega {
	public static void main(String[] args) {
		
		int opt = 0;
		Scanner entrada = new Scanner (System.in);
		JOptionPane.showMessageDialog(null, "Seja bem vindo!", "Bodega Seu Clóvis", 2); 
		int codigoFuncionario = 0;
		int codigoCliente = 0;
		int codigoBebida = 0;
		
		
		List<Funcionario> staffs = new ArrayList();
		List<Bebida> bebidas = new ArrayList();
		List<Clientes> clientesLista = new ArrayList();

		do{
			
        	System.out.print("\nSelecione uma opção:\n \n1- Cadastrar Funcionario  \n2- Mostrar Funcionários  \n3- Cadastrar Bebidas  \n4- Mostrar Bebidas  \n5- Compra de Bebida \n6- Venda de Bebida \n7- Cadastrar Clientes \n8- Mostrar clientes \n9- Sair do Sistema \n");
        	opt = entrada.nextInt();
        	
        	
        	if(opt == 1)  { //Cadastrar Funcionario
        		String nomeFuncionario = JOptionPane.showInputDialog(null, "Digite o nome do funcionario: ", "Cadastro de Funcionario", 2);
        		String idade = JOptionPane.showInputDialog(null, "Digite a idade do funcionario: ", "Cadastro de Funcionario", 2);
        		String salario = JOptionPane.showInputDialog(null, "Digite o salário do funcionario: (R$)", "Cadastro de Funcionario", 2);
        		int idadeInt = Integer.parseInt(idade);
        		
        		JOptionPane.showMessageDialog(null, "Codigo do funcionario: " + codigoFuncionario);

        		Funcionario staff1 = new Funcionario(nomeFuncionario, idadeInt, salario, codigoFuncionario);
        		
        		staffs.add(staff1);
        		
        		codigoFuncionario++;
        		
        	}if(opt == 2) { //Mostrar Funcionario
        		for(int i = 0; i < staffs.size(); i++) {
       			 Funcionario staff1 = staffs.get(i);
       			 System.out.println("\n------- Bodega Seu Clóvis ---------");
       			 System.out.println("- Codigo do funcionario: " + staff1.codigoFuncionario);
       			 System.out.println("- Nome do funcionario: " + staff1.nomeFuncionario);
       			 System.out.println("- Idade do funcionario: " + staff1.idade);
       			 System.out.println("- Salário do funcionario: R$" + staff1.salario);
       			 System.out.println("------------------------------------");
        		}
        		
        	}if(opt == 3) { //Cadastrar Bebidas
        		
        		String nomeBebida = JOptionPane.showInputDialog(null, "Nome da bebida:", "Cadastro de Bebidas", 2);
        		String precoBebida = JOptionPane.showInputDialog(null, "Preço de venda: (R$)", "Cadastro de Bebidas", 2);
        		double precoBebidaDouble = Integer.parseInt(precoBebida);
        		String teorAlcoolico = JOptionPane.showInputDialog(null, "Teor alcoolico: %", "Cadastro de Bebidas", 2);
        		String estoqueBebida = JOptionPane.showInputDialog(null, "Quantidade adquirida: ", "Cadastro de Bebidas", 2);
        		int estoqueBebidaInt = Integer.parseInt(estoqueBebida);
        		String quantidadeMl = JOptionPane.showInputDialog(null, "Quantidade de ML (Mililitros): ", "Cadastro de Bebidas", 2);
        		
        		Bebida bebida1 = new Bebida (nomeBebida, precoBebidaDouble, teorAlcoolico, estoqueBebidaInt, quantidadeMl, codigoBebida);
        		
        		bebidas.add(bebida1);
        		
        		codigoBebida++; 

        	}if(opt == 4) { //Mostrar Bebidas
        		for(int i = 0; i < bebidas.size(); i++) {
          			 Bebida bebida1 = bebidas.get(i);
          			 System.out.println("\n------- Bodega Seu Clóvis ---------");
          			 System.out.println("- Nome da bebida: " + bebida1.nomeBebida);
          			 System.out.println("- Preço de venda: R$" + bebida1.precoBebida);
          			 System.out.println("- Teor Alcoolico: " + bebida1.teorAlcoolico + "%");
          			 System.out.println("- Quantidade em Estoque: " + bebida1.estoqueBebida);
          			 System.out.println("- Quantidade em ML: " + bebida1.quantidadeMl + "ML");         			 
          			 System.out.println("------------------------------------");    
        		}
        		
        	}if(opt == 5) { //Compra de Bebida
        		String codBebida = JOptionPane.showInputDialog(null, "Digite o código da bebida: ", "Compra de Bebidas", 2);
        		int codBebidaInt = Integer.parseInt(codBebida);
        		Bebida bebida2 = bebidas.get(codBebidaInt);
        		String qtdBebida = JOptionPane.showInputDialog(null, "Quantidade que deseja comprar: ", "Compra de Bebidas", 2);
        		int qtdBebidaInt = Integer.parseInt(qtdBebida);
        		
        		JOptionPane.showMessageDialog(null, "Adquirido: " + qtdBebidaInt + " unidades" + " para a bebida código: " + codBebida, "Compra de Bebidas", 2);
        		
        		bebida2.comprarBebida(qtdBebidaInt);

        	}if(opt == 6) { //Venda de Bebida
        		String codBebida = JOptionPane.showInputDialog(null, "Digite o código da bebida: ", "Venda de Bebidas", 2);
        		int codBebidaInt = Integer.parseInt(codBebida);
        		Bebida bebida1 = bebidas.get(codBebidaInt);
        		String qtdBebida = JOptionPane.showInputDialog(null, "Digite a quantidade a vender: ", "Venda de Bebidas", 2);
        		int qtdBebidaInt = Integer.parseInt(qtdBebida);
   
        		
        		if(bebida1.estoqueBebida < qtdBebidaInt) {
        			JOptionPane.showMessageDialog(null, "Quantidade superior ao estoque!", "Erro!", 1);
        		} else {
        			JOptionPane.showMessageDialog(null, "Vendido: " + qtdBebidaInt + " unidades" + " da bebida código: " + codBebida, "Venda de Bebidas", 2);
        			bebida1.venderBebida(qtdBebidaInt);
        		}
        		
        	}if(opt == 7) { //Cadastrar Clientes
        		String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ", "Cadastro de Clientes", 2);
        		String cpfCliente = JOptionPane.showInputDialog(null, "Digite o CPF do cliente: ", "Cadastro de Clientes", 2);
        		int compra = JOptionPane.showConfirmDialog(null,"Venda fiado: ", "Venda Fiado", JOptionPane.YES_NO_OPTION);
        		boolean fiado = true;
        		
        		if(compra == 0) {
        			fiado = true;
        			JOptionPane.showMessageDialog(null, "Cliente cadastrado como confiável! ", "Cadastro de Clientes", JOptionPane.WARNING_MESSAGE);
        			
        		}else {
        			fiado = false;
        			JOptionPane.showMessageDialog(null, "Cliente cadastrado como não confiável! ", "Cadastro de Clientes", JOptionPane.ERROR_MESSAGE);
        			
        		}
        	
        		JOptionPane.showMessageDialog(null, "Codigo do cliente: " + codigoCliente);

        		Clientes cliente1 = new Clientes(nomeCliente, cpfCliente, fiado);
        		
        		clientesLista.add(cliente1);
        		
        		codigoCliente++;        		
        		
        	}if(opt == 8) { //Mostrar Clientes
        		for(int i = 0; i < clientesLista.size(); i++) {
         			 Clientes cliente1 = clientesLista.get(i);
         			 System.out.println("\n------- Bodega Seu Clóvis ---------");
         			 System.out.println("- Codigo do cliente: " + cliente1.codigoCliente);
         			 System.out.println("- Nome do cliente: " + cliente1.nomeCliente);
         			 System.out.println("- CPF do cliente: " + cliente1.cpfCliente); 
         			 System.out.println("-------------------------------------");
       		}        		
      
        	}if(opt == 9) {
        		JOptionPane.showMessageDialog(null, "Obrigado!");
        		System.exit(0);         		
        	}
        	
        }while(opt !=9);
	}
}
