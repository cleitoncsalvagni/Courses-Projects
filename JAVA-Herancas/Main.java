package herancas;

public class Main{
		public static void main(String[] args) {
			Cachorro r = new Cachorro();
			PastorAlemao p = new PastorAlemao();
			r.latir(); // imprime "Au au!"
			p.latir(); // imprime "Woof woof!"
		}
}