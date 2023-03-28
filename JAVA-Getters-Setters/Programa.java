package getters_setters;
import java.util.*;
import javax.swing.JOptionPane;

class Programa {

	public static void main(String[] args) {
		
		int opt = 0;
		Scanner entrada = new Scanner(System.in);	
		List<Pessoa> pessoas = new ArrayList();	
		
		do {
			System.out.print("\nSelecione uma opção:\n \n1- Adicionar nova pessoa  \n2- Mostrar pessoas cadastradas \n3- Sair \n");
        	opt = entrada.nextInt();
        	
        	if(opt == 1) {
        		String nomePessoa = JOptionPane.showInputDialog(null, "Digite o nome da pessoa: ");
        		String peso = JOptionPane.showInputDialog(null, "Digite o peso da pessoa: ");
        		double pesoDouble = Integer.parseInt(peso);
        		String idade = JOptionPane.showInputDialog(null, "Digite a idade da pessoa: ");
        		int idadeInt = Integer.parseInt(idade);
        		
        		Pessoa pessoa1 = new Pessoa();
        		
        		pessoa1.setNome(nomePessoa);
        		pessoa1.setPeso(pesoDouble);
        		pessoa1.setIdade(idadeInt);
        		
        		pessoas.add(pessoa1);
    
        	}
        	
        	if(opt == 2) {
        		for(int i = 0; i < pessoas.size(); i++) {
        			Pessoa pessoa1 = pessoas.get(i);
        			
        			System.out.println("Nome da pessoa: " + pessoa1.getNome());
        			System.out.println("Idade da pessoa: " + pessoa1.getIdade());
        			System.out.println("Peso da pessoa: " + pessoa1.getPeso());
        		}		
        		
        	}
        	
        	if(opt == 3) {
        		JOptionPane.showMessageDialog(null, "Obrigado!", null, 3);
        		System.exit(0);        		
        	}
			
		} while (opt !=3);
		
	}

}
