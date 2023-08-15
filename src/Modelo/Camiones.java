package Modelo;

import javax.swing.JOptionPane;

public class Camiones extends Vehiculo {

	private double cap_carga;

	public Camiones() {

	}

	public Camiones(String placa, String marca, String referencia, String modelo, int num_ruedas, double precio,
			boolean estado, double cap_carga) {
		super(placa, marca, referencia, modelo, num_ruedas, precio, estado);
		this.cap_carga = cap_carga;
	}

	public double getCap_carga() {
		return cap_carga;
	}

	public void setCap_carga(double cap_carga) {
		this.cap_carga = cap_carga;
	}

	@Override
	public void registrarDatos() {
		super.registrarDatos();

		try {
			cap_carga = Double
					.parseDouble(JOptionPane.showInputDialog("Ingrese el la capacidad de carga de su camion"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error: Ingresaste un dato erroreo (No es un numero)");
		}
	}

	public void imprimirDatos(String placa, String marca, String referencia, String modelo, int num_ruedas,
			double precio, boolean estado, double cap_carga2) {

		String str = "Placa: " + placa + "\n";
		str += "Marca: " + marca + "\n";
		str += "Referencia: " + referencia + "\n";
		str += "Modelo: " + modelo + "\n";
		str += "Numero de ruedas: " + num_ruedas + "\n";
		str += "Precio: " + precio + "\n";
		str += "Estado: " + estado + "\n";
		str += "Capacidad de carga: " + cap_carga2 + "\n";

		JOptionPane.showMessageDialog(null, str);

	}

}
