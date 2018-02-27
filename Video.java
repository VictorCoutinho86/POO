package poo;

import java.time.LocalDate;
import java.time.Period;

public class Video extends Midia {
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


	@Override
	public String toString() {
		return "Video [ " + super.toString() + ", Duração=" + duracao + "(seg), Curtidas=" + curtidas + ", Descricao=" + descricao
				+ ", " + publicadoA() + " ]";
	}
	
	
}
