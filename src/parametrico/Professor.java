package parametrico;

public class Professor {
	public String nome, titulacao;
	
	public Professor(String nome, String titulacao) {
		this.nome = nome;
		this.titulacao = titulacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}
