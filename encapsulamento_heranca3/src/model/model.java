package model;

public class model {
	private String brand;
	private boolean used;
	private int velox=0;

	
	public int getVelox() {
		return velox;
	}
	public void setVelox(int velox) {
		this.velox = velox;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	
	//Metodos
	
	public void comprar() {
		
		System.out.println("Marca: " + this.brand);
		System.out.println("Usado: "+ this.used);
	}
	

	
	public void acelerar() {
		
		for(this.velox=0;this.velox < 120 ; this.velox++) {
			this.velox = this.velox + 1;
			System.out.println("Acelerando: "+ this.velox + "Km/h");
		}
	}
	
	public void freiar() {
		
		int freiar=0;
		
		if(this.velox != 0) {
			
			for(freiar = 1;freiar > 0; this.velox--) {
				freiar = this.velox;
				System.out.println("freiando á: "+ freiar + "Km/h");
			}
				
		}else {
			System.out.println("O veiculo não está se movendo");
		}
	}
	
	public void curva() {
		if(this.velox > 0) {
			System.out.println("curvando");
		}else {
			System.out.println("veiculo parado");
		}
	}
	
	public void capotamento() {
		this.curva();
	
			if(this.velox >= 70) {
				System.out.println("veiculo capotado");
				
			}else if(this.velox > 0 && this.velox < 70 ) {
				System.out.println("curva feita");
			}else {
				System.out.println("veiculo parado");
			}
		
	}
}
