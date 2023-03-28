
public class Bhaskara {
	
	int a, b, c;
	
	
	Bhaskara (int val_a, int val_b, int val_c){
		this.a=val_a;
		this.b=val_b;
		this.c=val_c;
	}

	void calculaRaizes(){
		double delta, x1, x2;
		delta = b*b-4*a*c;
		x1 = (-b+Math.sqrt(delta)) / (2*a);
		x2 = (-b-Math.sqrt(delta)) / (2*a);
		if(delta > 0) {
			System.out.println("A raiz positiva é: " + x1);
			System.out.println("A raiz negativa é: " + x2);
			
		} else if (delta == 0) {
			System.out.print("A raiz real é: " + x1);
		} else {
			System.out.print("Valor de delta menor que zero!");
		}
	}

}
