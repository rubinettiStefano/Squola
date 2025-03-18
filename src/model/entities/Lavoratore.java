package model.entities;

import java.time.LocalDate;

public abstract class Lavoratore extends Persona
{
	protected double stipendioMensile;

	public Lavoratore()
	{
	}

	public Lavoratore(Long id, String nome, String cognome, LocalDate dob, double stipendioMensile)
	{
		super(id, nome, cognome, dob);
		this.stipendioMensile = stipendioMensile;
	}
}
