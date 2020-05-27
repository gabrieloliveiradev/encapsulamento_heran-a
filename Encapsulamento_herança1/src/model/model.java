package model;

public class model {
	private String color;
	private String type;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//Métodos
	public void type() {
		System.out.println("O tipo da aeronave é: " + this.type);
		
	}
	
	public void color() {
		System.out.println("A Aeronave é da cor: " + this.color);
		
	}
}
