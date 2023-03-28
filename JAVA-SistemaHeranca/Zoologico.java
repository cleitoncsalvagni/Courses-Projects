package herancas;

public class Zoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero camelo = new Mamifero("Habibs", "Marrom", "Vegetais", 5, 6.0, 4);
		Peixe tubarao = new Peixe("Santos", "Barbatanas e Cauda", 2, 3.0);
		Mamifero ursoDoCanada = new Mamifero("Ursula", "Marrom", "Pinguim", 5, 5, 4);
		
		camelo.dados();
		tubarao.dados();
		ursoDoCanada.dados();
		
		Mamifero cachorro = new Mamifero();
		cachorro.setNome("Doguinho");
		cachorro.setAlimento("Carne");
		cachorro.setAmbiente("Terra");
		cachorro.setComprimento(1);
		cachorro.setCor("Caramelo");
		cachorro.setPatas(4);
		cachorro.setVelocidade(3);
		
		Peixe dourado = new Peixe();
		dourado.setNome("Carpa");
		dourado.setAmbiente("Terra");
		dourado.setComprimento(1);
		dourado.setCor("Cinza");
		dourado.setPatas(4);
		dourado.setVelocidade(3);
		
		Mamifero gato = new Mamifero();
		gato.setNome("Mimi");
		gato.setAlimento("Carne");
		gato.setAmbiente("Terra");
		gato.setComprimento(3);
		gato.setCor("Misto");
		gato.setPatas(4);
		gato.setVelocidade(7);
		
		cachorro.dados();
		dourado.dados();
		gato.dados();
	}

}
