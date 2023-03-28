package herancas;

public class PastorAlemao extends Cachorro {
	private int areaCaca;
	
	public void cacar() {
		System.out.println("Estou caçando!");
	}
	
/*	@Override
	public void latir() {
	System.out.println("Woof Woof!");
	} */

	public void latir() {
		super.latir(); // Imprime "Au au!"
		System.out.println("Terminei o latido");
		}
	
	public PastorAlemao() {
		// Chamando o construtor sem parâmetros da classe Cachorro
		super();
		// Agora inicializamos as propriedades da classe
		// PastorAlemao
		this.areaCaca = 13;
		}
}
