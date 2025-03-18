package model.entities;

import java.time.LocalDate;

public class Collaboratore extends Lavoratore
{

	private String ruolo;

	public Collaboratore()
	{
	}

	@Override
	protected double calcoloTasse()
	{
		//rimanenti su cui pagare tasse
		double rimanenti = calcolaStipendioAnnualeLordo();

		//pago le tasse sul primo scaglione
		//dopodichè tolgo tutto il primo scaglione
		//se vado in negativo significa che il mio reddito è inferiore a 15k
		//quindi non pago tasse di altri scaglioni e mi fermo
		double tassePrimoScaglione = rimanenti > 15000 ? 15000 * 0.23 : rimanenti * 0.23;
		rimanenti -= 15000;
		if (rimanenti < 0)
			return tassePrimoScaglione;

		double tasseSecondoScaglione = rimanenti > 13000 ? 13000 * 0.25 : rimanenti * 0.25;
		rimanenti -= 13000;
		if (rimanenti < 0)
			return tassePrimoScaglione + tasseSecondoScaglione;

		double tasseTerzoScaglione = rimanenti > 22000 ? 22000 * 0.35 : rimanenti * 0.35;
		rimanenti -= 22000;
		if (rimanenti < 0)
			return tassePrimoScaglione + tasseSecondoScaglione + tasseTerzoScaglione;


		return tassePrimoScaglione + tasseSecondoScaglione + tasseTerzoScaglione + 0.43 * rimanenti;


	}

	public Collaboratore(Long id, String nome, String cognome, LocalDate dob, double stipendioMensile, String ruolo)
	{
		super(id, nome, cognome, dob, stipendioMensile);
		this.ruolo = ruolo;
	}

	public String getRuolo()
	{
		return ruolo;
	}

	public void setRuolo(String ruolo)
	{
		this.ruolo = ruolo;
	}
}
