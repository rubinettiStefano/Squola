package model.entities;

import java.time.LocalDate;

public class Studente extends Persona
{
	private int anno;
	private Character sezione;//A,B,C

	public Studente()
	{
	}

	public Studente(Long id, String nome, String cognome, LocalDate dob, int anno, Character sezione)
	{
		super(id, nome, cognome, dob);
		this.anno = anno;
		this.sezione = sezione;
	}


	public int getAnno()
	{
		return anno;
	}

	public void setAnno(int anno)
	{
		this.anno = anno;
	}

	public Character getSezione()
	{
		return sezione;
	}

	public void setSezione(Character sezione)
	{
		this.sezione = sezione;
	}
}
