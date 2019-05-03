package Movimientos;
import Entidades.Cuenta;

public class Traspaso {
	
	public static boolean traspaso(Cuenta origen, Cuenta destino, float cantidad) {

		if (origen.getCliente().getDni().equals(destino.getCliente().getDni())
				&& origen.getNumCuenta().substring(0, 4).equals(destino.getNumCuenta().substring(0, 4))) {

			if (origen.getSaldo() >= cantidad) {

				origen.setSaldo(origen.getSaldo() - cantidad);

				destino.setSaldo(destino.getSaldo() + cantidad);

			} else {
				return false;
			}
			return true;
		} else {
			return false;
		}

	}

}
