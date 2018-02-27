package poo;
/*
 * Autor = Victor Coutinho de Melo
 * Matricula = 17113050078
 * Pólo = São Gonçalo
 * 
 *  Programa criado para resolução da AD1 da disciplina de Programação Orientada a Objetos 2018.1
 *  
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// Classe Midia
class Midia {
	String tipo;
	String autor;
	LocalDate data;
	String titulo;
	String url;

	
	
	public Midia() {
		
	}

	public Midia(String tipo, String autor, String data, String titulo, String url) {
		super();

		// A Entrada é realizada com strings e o construtor faz conversão para LocalDate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		this.tipo = tipo;
		this.autor = autor;
		this.data = LocalDate.parse(data, formatter);
		this.titulo = titulo;
		this.url = url;
	}

	public String toString() {
		return "\nAutor=" + autor + "\nTitulo=" + titulo + "\nUrl=" + url;
	}

}

// Classe Video
class Video extends Midia {
	int duracao;
	int curtidas;
	String descricao;

	public Video(String tipo, String autor, String data, String titulo, String url, int duracao, int curtidas,
			String descricao) {
		super(tipo, autor, data, titulo, url);
		this.duracao = duracao;
		this.curtidas = curtidas;
		this.descricao = descricao;
	}

	public String publicadoA() {
		LocalDate hoje = LocalDate.now();
		Period publicado = Period.between(this.data, hoje);
		String anos, meses, dias;

		// verificação dos anos
		if (publicado.getYears() > 1) {
			anos = "" + publicado.getYears() + " anos";
		} else {
			if (publicado.getYears() == 1) {
				anos = "" + publicado.getYears() + " ano";
			} else {
				anos = "";
			}
		}
		// verificação de meses
		if (publicado.getMonths() > 1) {
			meses = "" + publicado.getMonths() + " meses ";
		} else {
			if (publicado.getMonths() == 1) {
				meses = "" + publicado.getMonths() + " mês ";
			} else {
				meses = "";
			}
		}
		// verificação de dias
		if (publicado.getDays() > 1) {
			dias = "" + publicado.getDays() + " dias";
		} else {
			if (publicado.getDays() == 1) {
				dias = "" + publicado.getDays() + " dia";
			} else {
				dias = "";
			}
		}
		return "Publicado a " + anos + (anos != ""?", ":"") + meses + (meses != "" || dias != ""?"e ":"") + dias;
	}
	
	public String toString() {
		return "Tipo=Video" + super.toString() + "\nDuração=" + duracao + "(seg)\nCurtidas=" + curtidas + "\nDescricao=" + descricao
				+ "\n" + publicadoA() + "\n";
	}
}

// Classe Ebook
class Ebook extends Midia {
	
	int paginas;

	public Ebook(String tipo, String autor, String data, String titulo, String url, int paginas) {
		super(tipo, autor, data, titulo, url);
		
		this.paginas = paginas;
	}

	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Tipo=Ebook" + super.toString() + "\nPáginas=" + paginas + "\nData="+ this.data.format(formatter) + "\n";
	}
}

// Classe que start o projeto
public class Principal {

	public static void main(String[] args) {
		
		Midia midia[] = new Midia[3];
		
		midia[0] = new Video("Video", "Carlos Bazilio", "22/08/2017", "Por que ainda estudar Java?"
				+ "", 
				"https://www.youtube.com/watch?v=bdpSqjTZJcg", 998, 11, 
				"Razões para ainda se estudar a linguagem Java");
		
		midia[1] = new Ebook("Ebook", "Carlos Bazilio", 
				"23/09/2017", "Programando na Cozinha", "https://carlosbazilio.gitbooks.io/programando-na-cozinha/content/pt-br/", 57);
		
		midia[2] = new Ebook("Ebook", "Marijn Haverbeke", "06/03/2017", 
				"Eloquent JavaScript", "http://eloquentjavascript.net/3rd_edition/", 472);
		
		for (Midia mid : midia) {
			System.out.println(mid.toString());
		}
	}

}