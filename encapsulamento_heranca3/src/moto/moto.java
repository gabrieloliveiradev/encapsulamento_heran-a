package moto;

import model.model;

public class moto extends model {
	private String cor;
	private String modelo;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//M�todo
	
		public void imprimirMoto() {
			System.out.println("Compra do carro feita!");
			System.out.println("Marca: " + getBrand());
			System.out.println("Cor: " + this.cor);
			System.out.println("Modelo: " + this.modelo);
		}
}
