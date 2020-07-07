package Classes;


public class Entidade {
	private String nome;
	private String endereco;
	private String telefone;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String toString() {
		return "Entidade [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	public double verificaSimilaridade(Entidade entidadeUm, Entidade entidadeDois) {
		return 0;
	}
}
