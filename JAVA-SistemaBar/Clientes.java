package bodega;

public class Clientes {
	int codigoCliente;
	String nomeCliente;
	String cpfCliente;
	boolean fiado;
	
	Clientes (String nomeCliente, String cpfCliente, boolean fiado) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.fiado = fiado;
	}

}
