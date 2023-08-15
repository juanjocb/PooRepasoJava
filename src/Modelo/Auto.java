package Modelo;

import javax.swing.JOptionPane;

public class Auto extends Vehiculo {

	private int num_puertas;
	private boolean is_gasolina;

	public Auto() {

	}

	public Auto(String placa, String marca, String referencia, String modelo, int num_ruedas, double precio, boolean estado,
			int num_puertas, boolean is_gasolina) {
		super(placa, marca, referencia, modelo, num_ruedas, precio, estado);
		this.num_puertas = num_puertas;
		this.is_gasolina = is_gasolina;
	}

	public int getNum_puertas() {
		return num_puertas;
	}

	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}

	public boolean isIs_gasolina() {
		return is_gasolina;
	}

	public void setIs_gasolina(boolean is_gasolina) {
		this.is_gasolina = is_gasolina;
	}

	@Override
	public void registrarDatos() {
		super.registrarDatos();

		try {
			num_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas de su auto"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error: Ingresaste un dato erroreo (No es un numero)");
		}
		is_gasolina = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Su camion es a gasolina? si/no"));
	}

	public void imprimirDatos(String placa, String marca, String referencia, String modelo, int num_ruedas,
			double precio, boolean estado, int num_puertas2, boolean is_gasolina2) {
		
		String str = "Placa: " + placa + "\n";
		str += "Marca: " + marca + "\n";
		str += "Referencia: " + referencia + "\n";
		str += "Modelo: " + modelo + "\n";
		str += "Numero de ruedas: " + num_ruedas + "\n";
		str += "Precio: " + precio + "\n";
		str += "Estado: " + estado + "\n";
		str += "Numero de Puertas: " + num_puertas2 + "\n";
		str += "Es a gasolina: " + is_gasolina2 + "\n";
		
		JOptionPane.showMessageDialog(null, str);
		
	}

}
