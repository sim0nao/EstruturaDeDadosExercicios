package ed;

import java.util.Arrays;


public class Vetor {
	private Aluno [] alunos = new Aluno [99];
	private int totalDeAlunos = 0;
	
	
	
	public boolean listaVazia() {
		for (int i=0; i< alunos.length; i++) {
			if(alunos[i] != null) {
				return false;
			}
		}
		
		return true;
	}
	
	public void adiciona (Aluno aluno) {
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
		
	}
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <=totalDeAlunos;
	}
	
	
	//adiciona no meio do Array movendo para a direita
	public void adiciona (int posicao, Aluno aluno) {
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("posição inválida");
		}
		
		
		for (int i = totalDeAlunos -1; i >=posicao; i-=1) {
			alunos[i+1] =alunos[i];
			}
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao < totalDeAlunos;
		
	}
	
	public Aluno pega (int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		return alunos[posicao];
	}

	public void remove (int posicao) {
		for (int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		totalDeAlunos --;
		
	}
	
	public int tamanho() {
		return totalDeAlunos;
	}
	
	public String toString() {
		return Arrays.deepToString(alunos);
		}
	
	public boolean contem (Aluno aluno) {
			for (int i=0; i< totalDeAlunos; i++) {
				if(aluno.equals(alunos[i])) {
				return true;
				}
			}
			return false;
		
	}
}
