package Movimientos;
import Entidades.Cliente;
import Entidades.Cuenta;

public class Transferencia {
	
	public static boolean transferencia(Cuenta origen, Cuenta destino, Cliente clienteOrigen, Cliente clienteDestino,
			float cantidad) {

		if (!origen.getNumCuenta().substring(0, 4).equals(destino.getNumCuenta().substring(0, 4))
				|| !clienteOrigen.getDni().equals(clienteDestino.getDni())) {

			if (origen.getSaldo() >= cantidad) {

				origen.setSaldo(origen.getSaldo() - cantidad);

				destino.setSaldo(destino.getSaldo() + cantidad);

			}else {
				return false;
			}
			return true;

		} else {
			return false;
		}

	}
	
	public static boolean comprobarSaldo(Cuenta saldo, float saldoEsperado) {
		
		return saldo.getSaldo() == saldoEsperado;
		
	}
	
	

}
