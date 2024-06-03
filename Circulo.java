public class Circulo {
	private double raio;
	
	public Circulo(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double calcularArea() {
		return (raio * raio) * 3.14;
	}
	
	public double calcularPerimetro() {
		return (2*3.14) * raio;
	}
}
