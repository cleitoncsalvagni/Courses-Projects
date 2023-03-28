package herancas;

public class Mamifero extends Animal {
	private String alimento;
	
	Mamifero(){
		
	}
	
	Mamifero (String nome, String cor, String alimento, int comprimento, double velocidade, int patas){
		super(nome, cor, "Terra", comprimento, velocidade, patas);
	}
	
	void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	void dados() {
		super.dados();
		System.out.println("O seu alimento é: " + alimento);
	}
}
