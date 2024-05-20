public class Cliente {
	private String nome;
	private String cpf;
	private Data dataNascimento;
	
	public Cliente (String novoNome, Data novoDataNascimento); {
		this.nome = novoNome;
		this.Data = novoDataNascimento;
		}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Data getDataNascimento() {
		return dataNascimento;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setDataNascimento(Data novoDataNascimento) {
		this.dataNascimento = novoDataNascimento;
	}
	
}
