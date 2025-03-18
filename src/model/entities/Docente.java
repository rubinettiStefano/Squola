package model.entities;

import java.time.LocalDate;

public class Docente extends Lavoratore
{
	private String materia;

	public Docente()
	{
	}

	@Override
	protected double calcoloTasse()
	{
		double rimanenti = calcolaStipendioAnnualeLordo();

		double tassePrimoScaglione = rimanenti>15000? 15000*0.23:rimanenti*0.13;
		rimanenti-=15000;
		if(rimanenti<0)
			return tassePrimoScaglione;

		double tasseSecondoScaglione = rimanenti>13000? 13000*0.25:rimanenti*0.15;


		return tassePrimoScaglione+tasseSecondoScaglione;
	}


	public Docente(Long id, String nome, String cognome, LocalDate dob, double stipendioMensile, String materia)
	{
		super(id, nome, cognome, dob, stipendioMensile);
		this.materia = materia;
	}

	public String getMateria()
	{
		return materia;
	}

	public void setMateria(String materia)
	{
		this.materia = materia;
	}
}
