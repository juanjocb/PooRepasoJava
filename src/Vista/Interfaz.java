package Vista;

import javax.swing.JOptionPane;

import Modelo.Concesionario;
import Modelo.Moto;
import Modelo.Auto;
import Modelo.Camiones;

public class Interfaz {

	Concesionario miConcesionario = new Concesionario();

	public Interfaz() {
		menuOpciones();
	}

	private void menuOpciones() {

		String menu = "MENU CONCESIONARIO\n\n";
		menu += "1. Registrar Vehiculo\n";
		menu += "2. Buscar Vehiculo \n";
		menu += "3. Listar Vehiculos Disponibles\n";
		menu += "4. Vender Vehiculo\n";
		menu += "5. Listar Vehiculos en Stock y Vendidos\n";
		menu += "6. Actualizar Vehiculo\n";
		menu += "7. Valor Vehiculos Vendidos\n";
		menu += "8. Eliminar Vehiculo\n";
		menu += "9. Salir\n";
		menu += "INGRESE UNA OPCION\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				menuRegistrarVehiculo();
				break;
			case 2:
				menuBuscarVehiculo();
				break;
			case 3:
				listarVehiculosDisponibles();
				break;
			case 4:
				venderVehiculo();
				break;
			case 5:
				vehiculosStockVendidos();
				break;
			case 6:
				// actualizarVehiculo();
				break;
			case 7:
				// valorVentasTotales();
				break;
			case 8:
				// eliminarVehiculoNoVendido();
				break;
			default:
				break;
			}
		} while (opcion != 9);

	}

	private void vehiculosStockVendidos() {

		String menu = "MSOTRAR CANTIDAD DE VEHICULOS EN STOCK O VENDIDOS\n\n";
		menu += "1. Mostrar cantidad de motos en stock\n";
		menu += "2. Mostrar cantidad de autos en stock\n";
		menu += "3. Mostrar cantidad de camiones en stock\n";
		menu += "4. Mostrar cantidad de vehiculos VENDIDOS\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				cantMotosStock();
				break;
			case 2:
//				cantAutosStock();
				break;
			case 3:
//				cantCamionesStock();
				break;
			case 4:
//				cantVehiculosVendidos();
				break;
			default:
				break;
			}
		} while (opcion != 5);

	}

	private void cantMotosStock() {
		
		if(miConcesionario.validarMoto()) {
			miConcesionario.motosEnStock();
		}
		
	}

	private void venderVehiculo() {

		if (miConcesionario.validadDatos()) {
			miConcesionario.venderVehiculo();
		}

	}

	private void listarVehiculosDisponibles() {

		if (miConcesionario.validadDatos()) {
			miConcesionario.mostrarVehiculosDisponibles();
		}

	}

	private void menuRegistrarVehiculo() {

		String menu = "REGISTRAR VEHICULO\n\n";
		menu += "1. Registrar Moto\n";
		menu += "2. Registrar Auto\n";
		menu += "3. Registrar Camion\n";
		menu += "4. Salir\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				registrarMoto();
				break;
			case 2:
				registrarAuto();
				break;
			case 3:
				registrarCamion();
				break;
			case 4:
				menuOpciones();
			default:
				break;
			}
		} while (opcion != 4);

	}

	private void menuBuscarVehiculo() {

		String menu = "BUSCAR VEHICULO\n\n";
		menu += "1. Buscar vehiculo por placa\n";
		menu += "2. Buscar vehiculo por marca \n";
		menu += "3. Buscar vehiculo por referencia \n";
		menu += "4. Buscar vehiculo por modelo\n";
		menu += "5. Salir\n";
		menu += "Ingrese una Opcion\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				escogerVehiculoPlaca();
				break;
			case 2:
				escogerVehiculoMarca();
			case 3:
				escogerVehiculoReferencia();
				break;
			case 4:
				escogerVehiculoModelo();
			case 5:
				menuOpciones();
			default:
				break;
			}
		} while (opcion != 6);

	}

	private void escogerVehiculoModelo() {

		String menu = "BUSCAR VEHICULO POR MODELO\n\n";
		menu += "1. Buscar Moto\n";
		menu += "2. Buscar Auto\n";
		menu += "3. Buscar Camion\n";
		menu += "4. Salir\n";
		menu += "Ingrese una Opcion\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				buscarMotoPorModelo();
				break;
			case 2:
				buscarAutoPorModelo();
			case 3:
				buscarCamionPorModelo();
				break;
			case 4:
				menuOpciones();
			default:
				break;
			}
		} while (opcion != 5);

	}

	private void buscarCamionPorModelo() {

		if (miConcesionario.validarCamion()) {
			String modelo = JOptionPane.showInputDialog("Ingrese la modelo del camion");
			miConcesionario.consultarCamionPorModelo(modelo);
		}

	}

	private void buscarAutoPorModelo() {

		if (miConcesionario.validarAuto()) {
			String modelo = JOptionPane.showInputDialog("Ingrese la modelo del auto");
			miConcesionario.consultarAutoPorModelo(modelo);
		}

	}

	private void buscarMotoPorModelo() {

		if (miConcesionario.validarMoto()) {
			String modelo = JOptionPane.showInputDialog("Ingrese la modelo de la moto");
			miConcesionario.consultarMotoPorModelo(modelo);
		}

	}

	private void escogerVehiculoReferencia() {

		String menu = "BUSCAR VEHICULO POR REFERENCIA\n\n";
		menu += "1. Buscar Moto\n";
		menu += "2. Buscar Auto\n";
		menu += "3. Buscar Camion\n";
		menu += "4. Salir\n";
		menu += "Ingrese una Opcion\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				buscarMotoPorReferencia();
				break;
			case 2:
				buscarAutoPorReferencia();
			case 3:
				buscarCamionPorReferencia();
				break;
			case 4:
				menuOpciones();
			default:
				break;
			}
		} while (opcion != 5);

	}

	private void buscarCamionPorReferencia() {

		if (miConcesionario.validarCamion()) {
			String referencia = JOptionPane.showInputDialog("Ingrese la referencia del camion");
			miConcesionario.consultarCamionPorReferencia(referencia);
		}

	}

	private void buscarAutoPorReferencia() {

		if (miConcesionario.validarAuto()) {
			String referencia = JOptionPane.showInputDialog("Ingrese la referencia del auto");
			miConcesionario.consultarAutoPorReferencia(referencia);
		}

	}

	private void buscarMotoPorReferencia() {

		if (miConcesionario.validarMoto()) {
			String referencia = JOptionPane.showInputDialog("Ingrese la referencia de la moto");
			miConcesionario.consultarMotoPorReferencia(referencia);
		}

	}

	private void escogerVehiculoMarca() {

		String menu = "BUSCAR VEHICULO POR MARCA\n\n";
		menu += "1. Buscar Moto\n";
		menu += "2. Buscar Auto\n";
		menu += "3. Buscar Camion\n";
		menu += "4. Salir\n";
		menu += "Ingrese una Opcion\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				buscarMotoPorMarca();
				break;
			case 2:
				buscarAutoPorMarca();
			case 3:
				buscarCamionPorMarca();
				break;
			case 4:
				menuOpciones();
			default:
				break;
			}
		} while (opcion != 5);
	}

	private void buscarMotoPorMarca() {

		if (miConcesionario.validarMoto()) {
			String marca = JOptionPane.showInputDialog("Ingrese la marca de la moto");
			miConcesionario.consultarMotoPorMarca(marca);
		}
	}

	private void buscarAutoPorMarca() {

		if (miConcesionario.validarAuto()) {
			String marca = JOptionPane.showInputDialog("Ingrese la marca del auto");
			miConcesionario.consultarAutoPorMarca(marca);
		}
	}

	private void buscarCamionPorMarca() {

		if (miConcesionario.validarCamion()) {
			String marca = JOptionPane.showInputDialog("Ingrese la marca del camion");
			miConcesionario.consultarCamionPorMarca(marca);
		}
	}

	private void escogerVehiculoPlaca() {

		String menu = "BUSCAR VEHICULO POR PLACA\n\n";
		menu += "1. Buscar Moto\n";
		menu += "2. Buscar Auto\n";
		menu += "3. Buscar Camion\n";
		menu += "4. Salir\n";
		menu += "Ingrese una Opcion\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				buscarMotoPorPlaca();
				break;
			case 2:
				buscarAutoPlaca();
			case 3:
				buscarCamionPlaca();
				break;
			case 4:
				menuOpciones();
			default:
				break;
			}
		} while (opcion != 5);

	}

	private void buscarMotoPorPlaca() {

		if (miConcesionario.validarMoto()) {
			String placa = JOptionPane.showInputDialog("Ingrese la placa de la moto");
			miConcesionario.consultarMotoPorPlaca(placa);
		}

	}

	private void buscarAutoPlaca() {

		if (miConcesionario.validarAuto()) {
			String placa = JOptionPane.showInputDialog("Ingrese la placa de la Auto");
			miConcesionario.consultarAutoPorPlaca(placa);
		}

	}

	private void buscarCamionPlaca() {

		if (miConcesionario.validarCamion()) {
			String placa = JOptionPane.showInputDialog("Ingrese la placa de la Camion");
			miConcesionario.consultarCamionPorPlaca(placa);
		}

	}

	private void registrarMoto() {

		Moto miMoto = new Moto();
		miMoto.registrarDatos();

		miConcesionario.registrarMoto(miMoto);

	}

	private void registrarAuto() {

		Auto miAuto = new Auto();
		miAuto.registrarDatos();

		miConcesionario.registrarAuto(miAuto);

	}

	private void registrarCamion() {

		Camiones miCamion = new Camiones();
		miCamion.registrarDatos();

		miConcesionario.registrarCamion(miCamion);

	}

}
