package main;

import carro.carro;
import moto.moto;

public class main {

	public static void main(String[] args) {
		carro carro1 = new carro();
		moto moto1 = new moto();
		
		moto1.setBrand("Suzuki");
		moto1.setCor("Verde");
		moto1.setVelox(70);
		moto1.setModelo("Kawazaki Ninja");
		moto1.setUsed(false);
		moto1.acelerar();
		moto1.capotamento();
		moto1.curva();
		moto1.imprimirMoto();
		
		carro1.setBrand("Ford");
		carro1.setCor("Vermelho");
		carro1.setVelox(100);
		carro1.setModelo("Focus");
		carro1.setUsed(true);
		carro1.acelerar();
		carro1.capotamento();
		carro1.curva();
		carro1.imprimirCarro();

	}

}
