package herancas;

public class Peixe extends Animal {
	private String caracteristica;

	Peixe(){
	
	}
	
	Peixe(String nome, String caracteristica, int comprimento, double velocidade){
		super(nome, "Cinzento", "Mar", comprimento, velocidade, 0);
		this.caracteristica = caracteristica;
	}
	
	void setCaracteristica(String caracteristica) {
		
	}
	
	void dados() {
		super.dados();
		System.out.println("Caracteristica: " + caracteristica);
	}
}
