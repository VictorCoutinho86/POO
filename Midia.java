package poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Midia {
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

	@Override
	public String toString() {
		return "Autor=" + autor + ", Titulo=" + titulo + ", Url=" + url;
	}

}
