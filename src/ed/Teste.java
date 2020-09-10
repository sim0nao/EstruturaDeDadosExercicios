package ed;

public class Teste {
	public static void main (String args[]) {
	 Aluno a1= new Aluno ("João");
	 Aluno a2= new Aluno ("José");
	 Aluno a3= new Aluno ("Lorena");
	 
	 Vetor lista = new Vetor();
	 
		/*
		 * lista.adiciona(a3); System.out.println(lista.tamanho()); lista.adiciona(a1);
		 * System.out.println(lista.tamanho()); lista.adiciona(a2);
		 * System.out.println(lista.tamanho());
		 * 
		 * System.out.println(lista);
		 * 
		  Aluno a4= new Aluno("Lia"); lista.adiciona(1, a4); System.out.println(lista);
		 * 
		 * lista.remove(1); System.out.println(lista);
		 */
	
	lista.adiciona(a3); 
	
	 
	 boolean vazio = lista.listaVazia();
	 System.out.println(vazio);
	 System.out.println(lista);

}}
