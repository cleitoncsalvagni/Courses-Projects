package bodega;

public class Bebida {
	int codigoBebida;
	int estoqueBebida;
	String nomeBebida;
	double precoBebida;
	String teorAlcoolico;
	String quantidadeMl;
	
	Bebida(String nomeBebida, double precoBebida, String teorAlcoolico, int estoqueBebidaInt, String quantidadeMl, int codigoBebida){
		this.nomeBebida = nomeBebida;
		this.precoBebida = precoBebida;
		this.teorAlcoolico = teorAlcoolico;
		this.estoqueBebida = estoqueBebidaInt;
		this.quantidadeMl = quantidadeMl;
		this.codigoBebida = codigoBebida;
	}
	
	void comprarBebida(int quantidade) {
		this.estoqueBebida += quantidade;
	}
	
	void venderBebida(int quantidade) {
		this.estoqueBebida -= quantidade;
	}
}