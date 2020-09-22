package src.ed.pilha;
import ed.Vetor;

public class Main {
	public static void main (String args[]) {
	Pilha pilha = new Pilha ();
	
	pilha.insere("Lorena");
	pilha.insere("Maria");
	System.out.println(pilha);
	
	String r1= pilha.remove();
	System.out.println(r1);
	
	
	
	}
}
