package model.entities;

import java.time.LocalDate;

public class Collaboratore extends Lavoratore
{

	private String ruolo;

	public Collaboratore()
	{
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
