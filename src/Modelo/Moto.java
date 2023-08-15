package Modelo;

import javax.swing.JOptionPane;

public class Moto extends Vehiculo {

	private int cilindraje;
	private double tam_tanque;

	public Moto() {

	}

	public Moto(String placa, String marca, String referencia, String modelo, int num_ruedas, double precio,
			int cilindraje, double tam_tanque, boolean estado) {
		super(placa, marca, referencia, modelo, num_ruedas, precio, estado);
		this.cilindraje = cilindraje;
		this.tam_tanque = tam_tanque;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public double getTam_tanque() {
		return tam_tanque;
	}

	public void setTam_tanque(double tam_tanque) {
		this.tam_tanque = tam_tanque;
	}

	@Override
	public void registrarDatos() {
		super.registrarDatos();

		try {
			cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje de su moto"));
			tam_tanque = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño del tanque de su moto"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error: Ingresaste un dato erroreo (No es un numero)");
		}

	}
	
	@Override
	public boolean isState(boolean estado) {
		return estado;
	}

	public void imprimirDatos(String placa, String marca, String referencia, String modelo, int num_ruedas,
			double precio, boolean estado, int cilindraje2, double tam_tanque2) {

		String str = "Placa: " + placa + "\n";
		str += "Marca: " + marca + "\n";
		str += "Referencia: " + referencia + "\n";
		str += "Modelo: " + modelo + "\n";
		str += "Numero de ruedas: " + num_ruedas + "\n";
		str += "Precio: " + precio + "\n";
		str += "Estado: " + estado + "\n";
		str += "Cilindraje: " + cilindraje2 + "\n";
		str += "Tamaño del Tanque: " + tam_tanque2 + "\n";

		JOptionPane.showMessageDialog(null, str);

	}
}
