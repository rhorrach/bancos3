package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Cuenta;
import Movimientos.Transferencia;

public class TransferenciaTEST {

	private Cliente cliente1;
	private Cliente cliente2;
	private Cuenta Cliente1Cuenta1;
	private Cuenta Cliente2Cuenta1;
	private Cuenta Cliente1Cuenta2;
	private Cuenta Cliente2Cuenta2;

	@Before
	public void runBeforeTestMethod() {
		Banco santander = new Banco("Santander", "0049");
		Banco bbva = new Banco("BBVA", "0128");
		
		cliente1 = new Cliente("Ramon", "Horrach", "43161224e", "Lope de vega", 630531222);
		cliente2 = new Cliente("Maria", "Palacios", "77745467q", "Joan Alcover", 618377199);

		Cliente1Cuenta1 = new Cuenta(cliente1, "00491111222233334444",santander,500);
		Cliente1Cuenta2 = new Cuenta(cliente1, "00492222333344445555",santander, 50);

		Cliente2Cuenta1 = new Cuenta(cliente2, "00491111222233334444",santander,300);
		Cliente2Cuenta2 = new Cuenta(cliente2, "01285555666644447777",bbva,100);
		
		
	}

	@Test
	public void comprobarSaldoCuentaOrigen() {
		
		Transferencia.transferencia(Cliente1Cuenta1, Cliente2Cuenta1, cliente1, cliente2, 200);
		
		float saldoEsperado = 300;
		
		assertEquals(Transferencia.comprobarSaldo(Cliente1Cuenta1, saldoEsperado), true);
		
	}
	
	@Test
	public void comprobarSaldoCuentaDestino() {
		
		Transferencia.transferencia(Cliente1Cuenta1, Cliente2Cuenta1, cliente1, cliente2, 200);
		
		float saldoEsperado = 500;
		
		assertEquals(Transferencia.comprobarSaldo(Cliente2Cuenta1, saldoEsperado), true);
		
	}
	
	@Test
	public void saldoSuficiente() {
		
		assertEquals(Cuenta.comprobarSaldo(Cliente1Cuenta2, 50), true);
		
	}
	
	@Test
	public void saldoInsuficiente() {
		assertEquals(Cuenta.comprobarSaldo(Cliente1Cuenta2, 60),true);
	}
	
	

}
