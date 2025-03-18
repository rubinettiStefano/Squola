package model.entities;

import java.time.LocalDate;

public class Docente extends Lavoratore
{
	private String materia;

	public Docente()
	{
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
