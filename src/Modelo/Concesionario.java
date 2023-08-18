package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import Modelo.Camiones;
import Modelo.Moto;
import Vista.Interfaz;
import Modelo.Auto;

public class Concesionario {

	HashMap<String, Moto> motoMap;
	HashMap<String, Auto> autoMap;
	HashMap<String, Camiones> camionMap;
	HashMap<String, Moto> motosVendidasMap;
	HashMap<String, Auto> autosVendidosMap;
	HashMap<String, Camiones> camionesVendidosMap;

	public Concesionario() {
		motoMap = new HashMap<String, Moto>();
		autoMap = new HashMap<String, Auto>();
		camionMap = new HashMap<String, Camiones>();
		motosVendidasMap = new HashMap<String, Moto>();
		autosVendidosMap = new HashMap<String, Auto>();
		camionesVendidosMap = new HashMap<String, Camiones>();
	}

	public boolean validadDatos() {
		if (!motoMap.isEmpty() || !autoMap.isEmpty() || !camionMap.isEmpty() || !motosVendidasMap.isEmpty()
				|| !autosVendidosMap.isEmpty() || !camionesVendidosMap.isEmpty()) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Tiene que llenar datos");
			return false;
		}
	}

	public boolean validarMoto() {
		if (!motoMap.isEmpty()) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Tiene que llenar datos en Moto");
			return false;
		}
	}

	public boolean validarAuto() {
		if (!autoMap.isEmpty()) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Tiene que llenar datos en Auto");
			return false;
		}
	}

	public boolean validarCamion() {
		if (!camionMap.isEmpty()) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Tiene que llenar datos en Camion");
			return false;
		}
	}

	public void registrarMoto(Moto miMoto) {
		if (!motoMap.containsKey(miMoto.getPlaca())) {
			if (miMoto.isEstado()) {
				motoMap.put(miMoto.getPlaca(), miMoto);
				JOptionPane.showMessageDialog(null,
						"Se ha registrado la moto " + miMoto.getReferencia() + " Satisfactoriamente");
			} else {
				motosVendidasMap.put(miMoto.getPlaca(), miMoto);
				JOptionPane.showMessageDialog(null,
						"Se ha registrado la moto " + miMoto.getReferencia() + " NO DISPONIBLE Satisfactoriamente");
			}
		} else {
			JOptionPane.showMessageDialog(null, "No fue posible registrar la moto, la placa ya existe en la lista");
		}
	}

	public void registrarAuto(Auto MiAuto) {
		if (!autoMap.containsKey(MiAuto.getPlaca())) {
			if (MiAuto.isEstado()) {
				autoMap.put(MiAuto.getPlaca(), MiAuto);
				JOptionPane.showMessageDialog(null,
						"Se ha registrado el auto " + MiAuto.getReferencia() + " Satisfactoriamente");
			} else {
				autosVendidosMap.put(MiAuto.getPlaca(), MiAuto);
				JOptionPane.showMessageDialog(null,
						"Se ha registrado el auto " + MiAuto.getReferencia() + " NO DISPONIBLES satisfactoriamente");
			}
		} else {
			JOptionPane.showMessageDialog(null, "No fue posible registrar el auto, la placa ya existe en la lista");
		}
	}

	public void registrarCamion(Camiones miCamion) {
		if (!camionMap.containsKey(miCamion.getPlaca())) {
			if (miCamion.isEstado()) {

				camionMap.put(miCamion.getPlaca(), miCamion);
				JOptionPane.showMessageDialog(null,
						"Se ha registrado el camion " + miCamion.getReferencia() + " Satisfactoriamente");
			} else {
				camionesVendidosMap.put(miCamion.getPlaca(), miCamion);
				JOptionPane.showMessageDialog(null,
						"Se ha registrado el camion " + miCamion.getReferencia() + " NO DISPONIBLE Satisfactoriamente");
			}
		} else {
			JOptionPane.showMessageDialog(null, "No fue posible registrar el camion, la placa ya existe en la lista");
		}
	}

	public void consultarMotoPorPlaca(String placa) {

		Moto miMoto = null;

		if (motoMap.containsKey(placa)) {
			miMoto = motoMap.get(placa);
			miMoto.imprimirDatos(miMoto.getPlaca(), miMoto.getMarca(), miMoto.getReferencia(), miMoto.getModelo(),
					miMoto.getNum_ruedas(), miMoto.getPrecio(), miMoto.isEstado(), miMoto.getCilindraje(),
					miMoto.getTam_tanque());
		} else {
			JOptionPane.showMessageDialog(null, "La moto no se encuentra en la base de datos");
		}

	}

	public void consultarAutoPorPlaca(String placa) {

		Auto miAuto = null;

		if (autoMap.containsKey(placa)) {
			miAuto = autoMap.get(placa);
			miAuto.imprimirDatos(miAuto.getPlaca(), miAuto.getMarca(), miAuto.getReferencia(), miAuto.getModelo(),
					miAuto.getNum_ruedas(), miAuto.getPrecio(), miAuto.isEstado(), miAuto.getNum_puertas(),
					miAuto.isIs_gasolina());

		} else {
			JOptionPane.showMessageDialog(null, "El Auto no se encuentra en la base de datos");
		}

	}

	public void consultarCamionPorPlaca(String placa) {

		Camiones miCamion = null;

		if (camionMap.containsKey(placa)) {
			miCamion = camionMap.get(placa);
			miCamion.imprimirDatos(miCamion.getPlaca(), miCamion.getMarca(), miCamion.getReferencia(),
					miCamion.getModelo(), miCamion.getNum_ruedas(), miCamion.getPrecio(), miCamion.isEstado(),
					miCamion.getCap_carga());

		} else {
			JOptionPane.showMessageDialog(null, "El Camion no se encuentra en la base de datos");

		}

	}

	public void consultarMotoPorMarca(String marca) {

		for (Moto miMoto : motoMap.values()) {
			if (miMoto.getMarca().toString().equalsIgnoreCase(marca)) {
				miMoto.imprimirDatos(miMoto.getPlaca(), miMoto.getMarca(), miMoto.getReferencia(), miMoto.getModelo(),
						miMoto.getNum_ruedas(), miMoto.getPrecio(), miMoto.isEstado(), miMoto.getCilindraje(),
						miMoto.getTam_tanque());
			} else {
				JOptionPane.showMessageDialog(null, "La moto no se encuentra en la base de datos");
			}
		}
	}

	public void consultarAutoPorMarca(String marca) {

		for (Auto miAuto : autoMap.values()) {
			if (miAuto.getMarca().toString().equalsIgnoreCase(marca)) {
				miAuto.imprimirDatos(miAuto.getPlaca(), miAuto.getMarca(), miAuto.getReferencia(), miAuto.getModelo(),
						miAuto.getNum_ruedas(), miAuto.getPrecio(), miAuto.isEstado(), miAuto.getNum_puertas(),
						miAuto.isIs_gasolina());
			} else {
				JOptionPane.showMessageDialog(null, "El auto no se encuentra en la base de datos");
			}
		}

	}

	public void consultarCamionPorMarca(String marca) {

		for (Camiones miCamion : camionMap.values()) {
			if (miCamion.getMarca().toString().equalsIgnoreCase(marca)) {
				miCamion.imprimirDatos(miCamion.getPlaca(), miCamion.getMarca(), miCamion.getReferencia(),
						miCamion.getModelo(), miCamion.getNum_ruedas(), miCamion.getPrecio(), miCamion.isEstado(),
						miCamion.getCap_carga());
			} else {
				JOptionPane.showMessageDialog(null, "El camion no se encuentra en la base de datos");

			}
		}

	}

	public void consultarMotoPorReferencia(String referencia) {

		for (Moto miMoto : motoMap.values()) {
			if (miMoto.getReferencia().toString().equalsIgnoreCase(referencia)) {
				miMoto.imprimirDatos(miMoto.getPlaca(), miMoto.getMarca(), miMoto.getReferencia(), miMoto.getModelo(),
						miMoto.getNum_ruedas(), miMoto.getPrecio(), miMoto.isEstado(), miMoto.getCilindraje(),
						miMoto.getTam_tanque());
			} else {
				JOptionPane.showMessageDialog(null, "La moto no se encuentra en la base de datos");
			}
		}
	}

	public void consultarAutoPorReferencia(String referencia) {

		for (Auto miAuto : autoMap.values()) {
			if (miAuto.getMarca().toString().equalsIgnoreCase(referencia)) {
				miAuto.imprimirDatos(miAuto.getPlaca(), miAuto.getMarca(), miAuto.getReferencia(), miAuto.getModelo(),
						miAuto.getNum_ruedas(), miAuto.getPrecio(), miAuto.isEstado(), miAuto.getNum_puertas(),
						miAuto.isIs_gasolina());
			} else {
				JOptionPane.showMessageDialog(null, "El auto no se encuentra en la base de datos");

			}
		}

	}

	public void consultarCamionPorReferencia(String referencia) {

		for (Camiones miCamion : camionMap.values()) {
			if (miCamion.getReferencia().toString().equalsIgnoreCase(referencia)) {
				miCamion.imprimirDatos(miCamion.getPlaca(), miCamion.getMarca(), miCamion.getReferencia(),
						miCamion.getModelo(), miCamion.getNum_ruedas(), miCamion.getPrecio(), miCamion.isEstado(),
						miCamion.getCap_carga());
			} else {
				JOptionPane.showMessageDialog(null, "El camion no se encuentra en la base de datos");

			}
		}

	}

	public void consultarCamionPorModelo(String modelo) {

		for (Camiones miCamion : camionMap.values()) {
			if (miCamion.getModelo().toString().equalsIgnoreCase(modelo)) {
				miCamion.imprimirDatos(miCamion.getPlaca(), miCamion.getMarca(), miCamion.getReferencia(),
						miCamion.getModelo(), miCamion.getNum_ruedas(), miCamion.getPrecio(), miCamion.isEstado(),
						miCamion.getCap_carga());
			} else {
				JOptionPane.showMessageDialog(null, "El camion no se encuentra en la base de datos");

			}
		}

	}

	public void consultarAutoPorModelo(String modelo) {

		for (Auto miAuto : autoMap.values()) {
			if (miAuto.getModelo().toString().equalsIgnoreCase(modelo)) {
				miAuto.imprimirDatos(miAuto.getPlaca(), miAuto.getMarca(), miAuto.getReferencia(), miAuto.getModelo(),
						miAuto.getNum_ruedas(), miAuto.getPrecio(), miAuto.isEstado(), miAuto.getNum_puertas(),
						miAuto.isIs_gasolina());
			} else {
				JOptionPane.showMessageDialog(null, "El auto no se encuentra en la base de datos");

			}
		}

	}

	public void consultarMotoPorModelo(String modelo) {

		for (Moto miMoto : motoMap.values()) {
			if (miMoto.getModelo().toString().equalsIgnoreCase(modelo)) {
				miMoto.imprimirDatos(miMoto.getPlaca(), miMoto.getMarca(), miMoto.getReferencia(), miMoto.getModelo(),
						miMoto.getNum_ruedas(), miMoto.getPrecio(), miMoto.isEstado(), miMoto.getCilindraje(),
						miMoto.getTam_tanque());
			} else {
				JOptionPane.showMessageDialog(null, "La moto no se encuentra en la base de datos");

			}
		}

	}

	public void mostrarVehiculosDisponibles() {

		String motos = "";
		String autos = "";
		String camiones = "";
		String motosVendidos = "";
		String autosVendidos = "";
		String camionesVendidos = "";
		int cont = 0;

		for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {
			String motoPlaca = entry.getKey();
			Moto miMoto = entry.getValue();
			motos += "Moto " + cont + "\n";
			motos += motoPlaca + " referencia: " + miMoto.getReferencia() + "\n";
			cont++;

		}

		for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {
			cont = 0;
			String autoPlaca = entry.getKey();
			Auto miAuto = entry.getValue();
			autos += "Auto " + cont + "\n";
			autos += autoPlaca + " referencia: " + miAuto.getReferencia() + "\n";
			cont++;

		}

		for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {
			cont = 0;
			String camionPlaca = entry.getKey();
			Camiones miCamion = entry.getValue();
			camiones += "Auto " + cont + "\n";
			camiones += camionPlaca + " referencia: " + miCamion.getReferencia() + "\n";
			cont++;
		}

		for (Map.Entry<String, Moto> entry : motosVendidasMap.entrySet()) {
			cont = 0;
			String motoPlaca = entry.getKey();
			Moto miMoto = entry.getValue();
			motos += "Moto " + cont + "\n";
			motos += motoPlaca + " referencia: " + miMoto.getReferencia() + "\n";
			cont++;

		}

		for (Map.Entry<String, Auto> entry : autosVendidosMap.entrySet()) {
			cont = 0;
			String autoPlaca = entry.getKey();
			Auto miAuto = entry.getValue();
			autos += "Auto " + cont + "\n";
			autos += autoPlaca + " referencia: " + miAuto.getReferencia() + "\n";
			cont++;

		}

		for (Map.Entry<String, Camiones> entry : camionesVendidosMap.entrySet()) {
			cont = 0;
			String camionPlaca = entry.getKey();
			Camiones miCamion = entry.getValue();
			camiones += "Auto " + cont + "\n";
			camiones += camionPlaca + " referencia: " + miCamion.getReferencia() + "\n";
			cont++;
		}

		JOptionPane.showMessageDialog(null, "VEHICULOS TOTALES DISPONIBLES " + "\n" + motos + autos + camiones);
		JOptionPane.showMessageDialog(null,
				"VEHICULOS TOTALES VENDIDOS " + "\n" + motosVendidos + autosVendidos + camionesVendidos);

	}

	public void venderVehiculo() {

		boolean hayVehiculosDis = false;
		String vender = JOptionPane.showInputDialog(null, "Ingrese la placa del vehiculo que desea comprar");

		if (!motoMap.isEmpty()) {
			for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {
				Moto miMoto = entry.getValue();
				if (miMoto.getPlaca().toString().toLowerCase().equalsIgnoreCase(vender)) {
					miMoto.setEstado(false);
					JOptionPane.showMessageDialog(null, "La moto " + miMoto.getReferencia() + " con placa "
							+ miMoto.getPlaca() + " se ha vendido correctamente");
					return;
				}

			}
		} else if (!autoMap.isEmpty()) {
			for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {
				Auto miAuto = entry.getValue();
				if (miAuto.getPlaca().toString().toLowerCase().equalsIgnoreCase(vender)) {
					miAuto.setEstado(false);
					JOptionPane.showMessageDialog(null, "El auto " + miAuto.getReferencia() + " con placa "
							+ miAuto.getPlaca() + " se ha vendido correctamente");
					return;
				}

			}

		} else if (!camionMap.isEmpty()) {
			for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {
				Camiones miCamion = entry.getValue();
				if (miCamion.getPlaca().toString().toLowerCase().equalsIgnoreCase(vender)) {
					miCamion.setEstado(false);
					JOptionPane.showMessageDialog(null, "El auto " + miCamion.getReferencia() + " con placa "
							+ miCamion.getPlaca() + " se ha vendido correctamente");
					return;
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Lo siento, el vehiculo no se encuentra disponible");
		}
	}

	public void vehiculosVendidos() {

		String motos = "";
		String autos = "";
		String camiones = "";
		int contGeneral = 0;
		int cont = 1;

		do {

			for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {
				String motoPlaca = entry.getKey();
				Moto miMoto = entry.getValue();

				if (miMoto.isState(!miMoto.isEstado())) {
					motos += "Moto " + cont + "\n";
					motos += motoPlaca + " referencia: " + miMoto.getReferencia() + "VENDIDO" + "\n";
					cont++;
					contGeneral++;
				}
			}

			for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {
				cont = 1;
				String autoPlaca = entry.getKey();
				Auto miAuto = entry.getValue();

				if (miAuto.isState(!miAuto.isEstado())) {
					autos += "Auto " + cont + "\n";
					autos += autoPlaca + " referencia: " + miAuto.getReferencia() + "VENDIDO" + "\n";
					cont++;
					contGeneral++;
				}
			}

			for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {
				cont = 1;
				String camionPlaca = entry.getKey();
				Camiones miCamion = entry.getValue();

				if (miCamion.isState(!miCamion.isEstado())) {
					camiones += "Auto " + cont + "\n";
					camiones += camionPlaca + " referencia: " + miCamion.getReferencia() + "VENDIDO" + "\n";
					cont++;
					contGeneral++;
				}
			}

		} while (contGeneral != 0);

		JOptionPane.showMessageDialog(null, "VEHICULOS TOTALES DISPONIBLES " + "\n" + motos + autos + camiones);

	}

	public void motosEnStock() {

		int cantMotos = 0;

		for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {

			cantMotos++;
		}

		JOptionPane.showMessageDialog(null, "La cantidad de motos que hay en stock es: " + cantMotos);
	}

	public void autosEnStock() {

		int cantAutos = 0;

		for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {

			cantAutos++;
		}

		JOptionPane.showMessageDialog(null, "La cantidad de autos que hay en stock es: " + cantAutos);
	}

	public void CamionesEnStock() {

		int cantCamiones = 0;

		for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {

			cantCamiones++;

		}

		JOptionPane.showMessageDialog(null, "La cantidad de camiones que hay en stock es: " + cantCamiones);
	}

	public void actualizarMoto() {

		String motoPlacaActualizar = JOptionPane.showInputDialog("Ingrese la placa de la moto que desea actualizar");

		for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {
			Moto miMoto = entry.getValue();

			if (miMoto.getPlaca().toLowerCase().equalsIgnoreCase(motoPlacaActualizar)) {
				motoMap.remove(miMoto.getPlaca());
				Moto newMoto = new Moto();
				newMoto.registrarDatos();
				registrarMoto(newMoto);
			} else {
				JOptionPane.showMessageDialog(null, "La moto con placa " + motoPlacaActualizar + " no se encuentra");
			}
		}
	}

	public void actualizarAuto() {

		String autoPlacaActualizar = JOptionPane.showInputDialog("Ingrese la placa del auto que desea actualizar");

		for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {
			Auto miAuto = entry.getValue();

			if (miAuto.getPlaca().toLowerCase().equalsIgnoreCase(autoPlacaActualizar)) {
				autoMap.remove(miAuto.getPlaca());
				Auto newAuto = new Auto();
				newAuto.registrarDatos();
				registrarAuto(miAuto);
			} else {
				JOptionPane.showMessageDialog(null, "La moto con placa " + autoPlacaActualizar + " no se encuentra");
			}
		}
	}

	public void actualizarCamion() {

		String camionPlacaActualizar = JOptionPane.showInputDialog("Ingrese la placa del camion que desea actualizar");

		for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {
			Camiones miCamion = entry.getValue();

			if (miCamion.getPlaca().toLowerCase().equalsIgnoreCase(camionPlacaActualizar)) {
				camionMap.remove(miCamion.getPlaca());
				Camiones newCamion = new Camiones();
				newCamion.registrarDatos();
				registrarCamion(newCamion);
			} else {
				JOptionPane.showMessageDialog(null, "La moto con placa " + camionPlacaActualizar + " no se encuentra");
			}
		}
	}

	public void totalVentas() {

		double totalVenta = 0;

		for (Map.Entry<String, Moto> entry : motosVendidasMap.entrySet()) {
			Moto miMoto = entry.getValue();

			totalVenta += miMoto.getPrecio();
		}

		JOptionPane.showMessageDialog(null, "El precio total de las ventas realizadas es de: " + totalVenta);

	}

	public void eliminarMoto() {

		String motoPlacaEliminar = JOptionPane.showInputDialog("Ingrese la placa de su moto que desea eliminar");

		for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {
			Moto miMoto = entry.getValue();

			if (miMoto.getPlaca().toLowerCase().equalsIgnoreCase(motoPlacaEliminar)) {
				motoMap.remove(miMoto.getPlaca());
				JOptionPane.showMessageDialog(null, "La moto se ha eliminado con exito");
			} else {
				JOptionPane.showMessageDialog(null, "La moto con placa " + motoPlacaEliminar + " no se encuentra");
			}
		}
	}

	public void eliminarAuto() {

		String autoPlacaEliminar = JOptionPane.showInputDialog("Ingrese la placa del auto que desea eliminar");

		for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {
			Auto miAuto = entry.getValue();

			if (miAuto.getPlaca().toLowerCase().equalsIgnoreCase(autoPlacaEliminar)) {
				autoMap.remove(miAuto.getPlaca());
				JOptionPane.showMessageDialog(null, "El auto se ha eliminado con exito");
			} else {
				JOptionPane.showMessageDialog(null, "El auto con placa " + autoPlacaEliminar + " no se encuentra");
			}
		}
	}

	public void eliminarCamion() {

		String camionPlacaEliminar = JOptionPane.showInputDialog("Ingrese la placa del camion que desea eliminar");

		for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {
			Camiones miCamion = entry.getValue();

			if (miCamion.getPlaca().toLowerCase().equalsIgnoreCase(camionPlacaEliminar)) {
				camionMap.remove(miCamion.getPlaca());
				JOptionPane.showMessageDialog(null, "El camion se ha eliminado con exito");
			} else {
				JOptionPane.showMessageDialog(null, "El camion con placa " + camionPlacaEliminar + " no se encuentra");
			}
		}
	}

	public void vahiculosVendidos() {

		int cantVehiculosVendidos = 0;

		for (Map.Entry<String, Camiones> entry : camionesVendidosMap.entrySet()) {

			cantVehiculosVendidos++;

		}

		for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {

			cantVehiculosVendidos++;

		}

		for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {

			cantVehiculosVendidos++;

		}

		JOptionPane.showMessageDialog(null, "La cantidad de vehiculos vendidos son: " + cantVehiculosVendidos);

	}

//	public void actualizarMoto() {
//		
//	
//		

//		
//		
//		
//	}

}
