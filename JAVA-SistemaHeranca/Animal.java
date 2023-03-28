package herancas;

public class Animal {
	private String nome;
	private int comprimento;
	private String cor;
	private String ambiente;
	private double velocidade;
	private int patas;
	
	Animal() {

	}
	
	Animal(String nome, String cor, String ambiente, int comprimento, double velocidade, int patas){
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
		
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}

	void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	void setPatas(int patas) {
		this.patas = patas;
	}

	void setCor(String cor) {
		this.cor = cor;
	}

	void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	void dados(){// Imprime os dados do animal
	
		System.out.println("\nNome do animal: " + this.nome);
		System.out.println("Cor do animal: " + this.cor);
		System.out.println("Habitat do animal: " + this.ambiente);
		System.out.println("Comprimento do animal: " + this.comprimento);
		System.out.println("Velocidade do animal: " + this.velocidade + "m/s");
		System.out.println("Quantidades de patas do animal: " + this.patas);
	}
}	
