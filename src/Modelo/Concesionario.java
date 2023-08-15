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
			motoMap.put(miMoto.getPlaca(), miMoto);
			JOptionPane.showMessageDialog(null,
					"Se ha registrado la moto " + miMoto.getReferencia() + " Satisfactoriamente");
		} else {
			JOptionPane.showMessageDialog(null, "No fue posible registrar la moto, la placa ya existe en la lista");
		}
	}

	public void registrarAuto(Auto MiAuto) {
		if (!autoMap.containsKey(MiAuto.getPlaca())) {
			autoMap.put(MiAuto.getPlaca(), MiAuto);
			JOptionPane.showMessageDialog(null,
					"Se ha registrado el auto " + MiAuto.getReferencia() + " Satisfactoriamente");
		} else {
			JOptionPane.showMessageDialog(null, "No fue posible registrar el auto, la placa ya existe en la lista");
		}
	}

	public void registrarCamion(Camiones miCamion) {
		if (!camionMap.containsKey(miCamion.getPlaca())) {
			camionMap.put(miCamion.getPlaca(), miCamion);
			JOptionPane.showMessageDialog(null,
					"Se ha registrado el camion " + miCamion.getReferencia() + " Satisfactoriamente");
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
			if (miMoto.getMarca().equals(marca)) {
				miMoto = motoMap.get(marca);
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
			if (miAuto.getMarca().equals(marca)) {
				miAuto = autoMap.get(marca);
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
			if (miCamion.getMarca().equals(marca)) {
				miCamion = camionMap.get(marca);
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
			if (miMoto.getReferencia().equals(referencia)) {
				miMoto = motoMap.get(referencia);
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
			if (miAuto.getMarca().equals(referencia)) {
				miAuto = autoMap.get(referencia);
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
			if (miCamion.getReferencia().equals(referencia)) {
				miCamion = camionMap.get(referencia);
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
			if (miCamion.getModelo().equals(modelo)) {
				miCamion = camionMap.get(modelo);
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
			if (miAuto.getModelo().equals(modelo)) {
				miAuto = autoMap.get(modelo);
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
			if (miMoto.getModelo().equals(modelo)) {
				miMoto = motoMap.get(modelo);
				miMoto.imprimirDatos(miMoto.getPlaca(), miMoto.getMarca(), miMoto.getReferencia(), miMoto.getModelo(),
						miMoto.getNum_ruedas(), miMoto.getPrecio(), miMoto.isEstado(), miMoto.getCilindraje(),
						miMoto.getTam_tanque());
			} else {
				JOptionPane.showMessageDialog(null, "La moto no se encuentra en la base de datos");

			}
		}

	}

	public int mostrarVehiculosDisponibles() {

		String motos = "";
		String autos = "";
		String camiones = "";
		int contGeneral = 0;
		int cont = 1;

		for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {
			String motoPlaca = entry.getKey();
			Moto miMoto = entry.getValue();

			if (miMoto.isState(miMoto.isEstado())) {
				motos += "Moto " + cont + "\n";
				motos += motoPlaca + " referencia: " + miMoto.getReferencia() + "\n";
				cont++;
				contGeneral++;
			}
		}

		for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {
			cont = 1;
			String autoPlaca = entry.getKey();
			Auto miAuto = entry.getValue();

			if (miAuto.isState(miAuto.isEstado())) {
				autos += "Auto " + cont + "\n";
				autos += autoPlaca + " referencia: " + miAuto.getReferencia() + "\n";
				cont++;
				contGeneral++;
			}
		}

		for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {
			cont = 1;
			String camionPlaca = entry.getKey();
			Camiones miCamion = entry.getValue();

			if (miCamion.isState(miCamion.isEstado())) {
				camiones += "Auto " + cont + "\n";
				camiones += camionPlaca + " referencia: " + miCamion.getReferencia() + "\n";
				cont++;
				contGeneral++;
			}
		}

		JOptionPane.showMessageDialog(null, "VEHICULOS TOTALES DISPONIBLES " + "\n" + motos + autos + camiones);
		return contGeneral;

	}

	public void venderVehiculo() {

		boolean hayVehiculosDis = false;
		String vender = "";

		do {

			for (Map.Entry<String, Moto> entry : motoMap.entrySet()) {
				Moto miMoto = entry.getValue();
				if (miMoto.isState(miMoto.isEstado())) {
					hayVehiculosDis = true;
					if (miMoto.getPlaca().toString().toLowerCase().equalsIgnoreCase(vender)) {
						JOptionPane.showMessageDialog(null, "ENTRO");
						miMoto.setEstado(false);
						JOptionPane.showMessageDialog(null, "La moto " + miMoto.getReferencia() + " con placa "
								+ miMoto.getPlaca() + " se ha vendido correctamente");
						return;
					}
				}
			}

			for (Map.Entry<String, Auto> entry : autoMap.entrySet()) {
				Auto miAuto = entry.getValue();
				if (miAuto.isState(miAuto.isEstado())) {
					hayVehiculosDis = true;
					if (miAuto.getPlaca().toString().toLowerCase().equalsIgnoreCase(vender)) {
						miAuto.setEstado(false);
						JOptionPane.showMessageDialog(null, "El auto " + miAuto.getReferencia() + " con placa "
								+ miAuto.getPlaca() + " se ha vendido correctamente");
						return;
					}
				}
			}

			for (Map.Entry<String, Camiones> entry : camionMap.entrySet()) {
				Camiones miCamion = entry.getValue();

				if (miCamion.isState(miCamion.isEstado())) {
					hayVehiculosDis = true;
					if (miCamion.getPlaca().toString().toLowerCase().equalsIgnoreCase(vender)) {
						miCamion.setEstado(false);
						JOptionPane.showMessageDialog(null, "El auto " + miCamion.getReferencia() + " con placa "
								+ miCamion.getPlaca() + " se ha vendido correctamente");
						return;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Disculpa, no pero el vehiculo no esta disponible");
				}
			}

			vender = JOptionPane.showInputDialog(null, "Ingrese la placa del vehiculo que desea comprar");

		} while (hayVehiculosDis);

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


	}

}
