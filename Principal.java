package poo;
/*
 * Autor = Victor Coutinho de Melo
 * Matricula = 17113050078
 * Pólo = São Gonçalo
 * 
 *  Programa criado para resolução da AD1 da disciplina de Programação Orientada a Objetos 2018.1
 *  
 */
public class Principal {

	public static void main(String[] args) {
		
		Video video = new Video("Video", "Carlos Bazilio", "22/08/2017", "Por que ainda estudar Java", 
				"https://www.youtube.com/watch?v=bdpSqjTZJcg", 998, 11, 
				"Razões para ainda se estudar a linguagem Java");
		
		Ebook book1 = new Ebook("Ebook", "Carlos Bazilio", 
				"23/09/2017", "Programando na Cozinha", "https://carlosbazilio.gitbooks.io/programando-na-cozinha/content/pt-br/", 57);
		
		Ebook book2 = new Ebook("Ebook", "Marijn Haverbeke", "06/03/2017", 
				"Eloquent JavaScript", "http://eloquentjavascript.net/3rd_edition/", 472);
		
		Midia midia[] = new Midia[3];
		
		midia[0] = video;
		midia[1] = book1;
		midia[2] = book2;
		
		for (Midia mid : midia) {
			System.out.println(mid.toString());
		}
	}

}