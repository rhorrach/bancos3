package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Cuenta;
import Movimientos.Traspaso;

public class TraspasoTEST {
	
	private Cliente cliente1;
	private Cuenta Cliente1Cuenta1;
	private Cuenta Cliente1Cuenta2;
	
	private static final float aTransferir = 80;
	
	@Before
	public void runBeforeTestMethod() {
		Banco santander = new Banco("Santander", "0049");
		cliente1 = new Cliente("Ramon", "Horrach", "43161224e", "Lope de vega", 630531222);
		

		Cliente1Cuenta1 = new Cuenta(cliente1, "00491111222233334444",santander ,500);
		Cliente1Cuenta2 = new Cuenta(cliente1, "00492222333344445555",santander,600);		
		
	}

	@Test
	public void comprobarTraspaso() {
		
		assertEquals(Traspaso.traspaso(Cliente1Cuenta1, Cliente1Cuenta2, aTransferir), true);
		
	}

}
