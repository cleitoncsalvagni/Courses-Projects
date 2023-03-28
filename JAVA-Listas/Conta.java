/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;
class Conta{
	int numero;
    String dono;
	double saldo;
	
	boolean saca(double valor){
		if (valor>this.saldo){
			return false;	
		}
		this.saldo -=valor;
		return true;
	}
	void deposita (double valor){
		this.saldo +=valor;
		System.out.println("\nDeposito realizado com sucesso!");
		System.out.printf ("Novo saldo" + this.saldo+ "\n");
	}
}
