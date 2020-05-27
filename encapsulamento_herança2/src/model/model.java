package model;

public class model {
	private String name;
	private String brand;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome do eletrodoméstica: " + this.name);
		System.out.println("Marca do eletrodoméstico: " + this.brand);
	}
}
