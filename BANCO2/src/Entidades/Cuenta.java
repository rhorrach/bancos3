package Entidades;
public class Cuenta{

	Cliente cliente;
	String numCuenta;
	Banco nombre;
	Banco identificador;
	
	float saldo;	
	
	public Cuenta() {
		
	}
	
	public Cuenta(Cliente cliente, String numCuenta, Banco identificador, float saldo) {
		super();
		this.cliente = cliente;
		this.numCuenta = numCuenta;
		this.identificador = identificador;
		this.saldo = saldo;
	}
	
	
	
	public Cuenta(Cliente cliente, String numCuenta, Banco nombre, Banco identificador, float saldo) {
		super();
		this.cliente = cliente;
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.identificador = identificador;
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Banco getNombre() {
		return nombre;
	}

	public void setNombre(Banco nombre) {
		this.nombre = nombre;
	}

	public Banco getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Banco identificador) {
		this.identificador = identificador;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public static boolean mismoCliente(Cuenta cuentaOrigen, Cuenta cuentaDestino) {

		return cuentaOrigen.getCliente().getDni().equals(cuentaDestino.getCliente().getDni());

	}
	
	public static boolean comprobarSaldo(Cuenta cuenta, float aTransferir) {
		
		if(cuenta.getSaldo() >= aTransferir) {
			return true;
		}
		return false;
	}

}
