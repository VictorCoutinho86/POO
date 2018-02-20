package poo;

import java.time.LocalDate;
import java.time.Period;

public class Video extends Midia {
	String url;
	int duracao;
	int curtidas;
	String descricao;

	public Video(String tipo, String autor, LocalDate data, String titulo, 
			String descricao, int duracao, String url, int curtidas) {
		super();
		this.tipo = tipo;
		this.autor = autor;
		this.data = data;
		this.titulo = titulo;
		this.descricao = descricao;
		this.url = url;
		this.curtidas = curtidas;
		this.descricao = descricao;
	}

	public String publicadoA() {
		LocalDate hoje = LocalDate.now();
		Period publicado = Period.between(hoje, this.data);
		String anos, meses, dias;

		// verificação dos anos
		if (publicado.getYears() > 1) {
			anos = "" + publicado.getYears() + " anos ";
		} else {
			if (publicado.getYears() == 1) {
				anos = "" + publicado.getYears() + " ano ";
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
		return "publicado a" + anos + meses + dias;
	}
}
