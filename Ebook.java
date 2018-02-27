package poo;

public class Ebook extends Midia {
	
	int paginas;

	public Ebook(String tipo, String autor, String data, String titulo, String url, int paginas) {
		super(tipo, autor, data, titulo, url);
		
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Ebook [ " + super.toString() + ", Páginas=" + paginas + " ]";
	}

	
	
	
	

}
