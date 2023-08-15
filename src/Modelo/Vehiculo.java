package Modelo;

import java.awt.font.NumericShaper;

import javax.swing.JOptionPane;

public abstract class Vehiculo {

	private String placa;
	private String marca;
	private String referencia;
	private String modelo;
	private int num_ruedas;
	private double precio;
	private boolean estado;

	public Vehiculo() {

	}

	public Vehiculo(String placa, String marca, String referencia, String modelo, int num_ruedas, double precio,
			boolean estado) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.referencia = referencia;
		this.modelo = modelo;
		this.num_ruedas = num_ruedas;
		this.precio = precio;
		this.estado = estado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNum_ruedas() {
		return num_ruedas;
	}

	public void setNum_ruedas(int num_ruedas) {
		this.num_ruedas = num_ruedas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void registrarDatos() {

		placa = JOptionPane.showInputDialog("ingrese el numero de placa");
		marca = JOptionPane.showInputDialog("ingrese la marca del vehiculo");
		referencia = JOptionPane.showInputDialog("ingrese la referencia del vehiculo");
		modelo = JOptionPane.showInputDialog("ingrese el modelo");
		num_ruedas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de ruedas"));
		precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio"));
		estado = Boolean.parseBoolean(JOptionPane.showInputDialog("¿El vehiculo esta disponible? true/false"));
	}
	
	public boolean isState(boolean estado) {
		return estado;
	}

}
