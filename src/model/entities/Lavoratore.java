package model.entities;

import java.time.LocalDate;

public abstract class Lavoratore extends Persona
{
	protected double stipendioMensileLordo;

	public Lavoratore()
	{
	}

	public Lavoratore(Long id, String nome, String cognome, LocalDate dob, double stipendioMensile)
	{
		super(id, nome, cognome, dob);
		this.stipendioMensileLordo = stipendioMensile;
	}

	public double calcolaStipendioAnnualeLordo()
	{
		return stipendioMensileLordo*14;
	}

	public double calcolaStipendioAnnualeNetto()
	{
		return calcolaStipendioAnnualeLordo()-calcoloTasse();
	}

	protected abstract double calcoloTasse();


	public double getStipendioMensileLordo()
	{
		return stipendioMensileLordo;
	}

	public void setStipendioMensileLordo(double stipendioMensileLordo)
	{
		this.stipendioMensileLordo = stipendioMensileLordo;
	}
}
