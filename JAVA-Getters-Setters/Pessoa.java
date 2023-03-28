package getters_setters;

public class Pessoa {
	private int idade;
	private double peso;
	private String nome;
	
	public Pessoa() {
		
	}
	public void setIdade(int idadeInt) {
		this.idade = idadeInt;
		
	}
	public int getIdade() {
		return this.idade;
		
	}
	public void setPeso(double pesoDouble) {
		this.peso = pesoDouble;
		
	}
	double getPeso() {
		return this.peso;
	}
	public void setNome(String nomePessoa) {
		this.nome = nomePessoa;
		
	}
	public String getNome() {
		return this.nome;
	}
}
