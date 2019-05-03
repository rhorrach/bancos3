package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Cuenta;

public class ClienteTEST {
	
	private Cliente cliente1;
	private Cliente cliente2;
	private Cuenta Cliente1Cuenta1;
	private Cuenta Cliente2Cuenta1;
	private Cuenta Cliente1Cuenta2;
	private Cuenta Cliente2Cuenta2;
	private Banco santander;
	private Banco bbva;
	
	@Before
	public void runBeforeTestMethod() {
		
		santander = new Banco("Santander", "0049");
		bbva = new Banco("BBVA", "0128");
		
		cliente1 =  new Cliente("Ramon", "Horrach", "43161224e", "Lope de vega", 630531222);
		cliente2 = new Cliente("Maria", "Palacios", "77745467q", "Joan Alcover", 618377199);
		
		Cliente1Cuenta1 = new Cuenta(cliente1, "00491111222233334444",santander ,500);
		Cliente1Cuenta2 = new Cuenta(cliente1, "00492222333344445555",santander ,600);
		
		Cliente2Cuenta1 = new Cuenta(cliente2, "01281111222233334444",bbva ,300);
		Cliente2Cuenta2 = new Cuenta(cliente2, "01285555666644447777",bbva ,100);
	}
	
	

	@Test
	public void transferenciaOK() {
		
		assertEquals(Cliente1Cuenta1.mismoCliente(Cliente1Cuenta1, Cliente1Cuenta2), true);
		
	}
	
	

}
