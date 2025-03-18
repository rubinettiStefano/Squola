package model.entities;

import java.time.LocalDate;

public abstract class Persona extends BaseEntity
{
	protected String nome,cognome;
	protected LocalDate dob;//date of birh, data di nascita

	public Persona(){}

	public Persona(Long id, String nome, String cognome, LocalDate dob)
	{
		super(id);
		this.nome = nome;
		this.cognome = cognome;
		this.dob = dob;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public LocalDate getDob()
	{
		return dob;
	}

	public void setDob(LocalDate dob)
	{
		this.dob = dob;
	}
}
