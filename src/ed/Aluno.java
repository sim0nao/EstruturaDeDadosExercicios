package ed;

public class Aluno {
	private String nome;
	
	public Aluno (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().contentEquals(this.nome);
	}

	@Override
	public String toString() {
		return nome;
	}
	
}
