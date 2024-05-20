public class Gatp {
	private String nome;
	private String raca;
	private int idade;
	
	public Gato (String novoNome, String novoRaca, int novoIdade) {
		this.nome = novoNome;
		this.raca = novoRaca;
		this.idade = novoIdade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setRaca(String novoRaca) {
		this.raca = novoRaca;
	}
	
	public void setIdade(int novoIdade) {
		this.idade = novoIdade;
	}
	
	public void emitirSom() {
		return "Miau!";
	}
}
