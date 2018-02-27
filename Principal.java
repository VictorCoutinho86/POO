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
		return "Autor=" + autor + ", Titulo=" + titulo + ", Url=" + url;
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
		return "Video [ " + super.toString() + ", Duração=" + duracao + "(seg), Curtidas=" + curtidas + ", Descricao=" + descricao
				+ ", " + publicadoA() + " ]";
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
		return "Ebook [ " + super.toString() + ", Páginas=" + paginas + " ]";
	}
}

// Classe que start o projeto
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