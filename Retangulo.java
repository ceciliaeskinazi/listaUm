package quartaFeira;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double novaBase , double novaAltura) {
		this.base = novaBase;
		this.altura = novaAltura;
	}
	public double getBase() {
		return base;	
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double novaBase) {
		this.base = novaBase;
	}
	
	public void setBase(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public double calcularArea() {
		return altura * base;
	}
	
	public double calcularPerimetro() {
		return (base*2) + (altura*2);
	}
}
