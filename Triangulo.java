package Calculo;

import java.util.Scanner;

public class Triangulo {
	private int base1;
	private int base2;
	private int base3;
	private int perimetro;
	
	public Triangulo(String b1, String b2, String b3) {
		this.setBase1(Integer.parseInt(b1));
		this.setBase2(Integer.parseInt(b2));
		this.setBase3(Integer.parseInt(b3));
		
	}
	
	public void hacerPerimetro() {
		int p = this.getBase1() * this.getBase2() * this.getBase3();
		this.setPerimetro(p);
	}
	
	public int getBase1() {
		return base1;
	}
	
	public void setBase1(int base1) {
		this.base1 = base1;
	}
	
	public int getBase2() {
		return base2;
	}
	
	public void setBase2(int base2) {
		this.base2 = base2;
	}
	
	public int getBase3() {
		return base3;
	}
	
	public void setBase3(int base3) {
		this.base3 = base3;
	}
	
	public int getPerimetro() {
		return perimetro;
	}
	
	public void setPerimetro(int perimetro) {
		this.perimetro=perimetro;
	}


public static void main(String[]arg) {
	try (Scanner entrada = new Scanner (System.in)) {
		float base;
		float altura;
		float area;
		
		System.out.println ("Dame la base del triangulo");
		base = entrada.nextFloat();
		System.out.println ("Dame la altura del triangulo");
		
		area = (base * altura)/2;
		
		System.out.println ("El area del triangulo es:"+" "+area);
	}
	
}
	
}


