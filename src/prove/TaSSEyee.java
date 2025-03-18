package prove;

import model.entities.Collaboratore;
import model.entities.Docente;
import model.entities.Lavoratore;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaSSEyee
{
	public static void main(String[] args)
	{
		ArrayList<Lavoratore> lavoratori = new ArrayList<>();

		Docente d = new Docente(1135L,"Stefano","Rubinetti", LocalDate.of(1995,8,27),7000,"computer");
		Collaboratore c = new Collaboratore(2151L,"Claudio","Costantino",LocalDate.of(1999,3,16),7000,"Preside");

		lavoratori.add(d);
		lavoratori.add(c);

		//stampare quanto la scuola spende in totale
		//stampare per ogni lavoratore nome,cognome e stipendioNetto

		double spesaTotale = 0;

		for(Lavoratore l : lavoratori)
		{
			spesaTotale+=l.calcolaStipendioAnnualeLordo();

			System.out.println(l.getNome()+" "+l.getCognome()+" prende netti "+l.calcolaStipendioAnnualeNetto()+" euro all'anno");
		}

		System.out.println("La scuola spende per gli stipendi "+spesaTotale);
	}
}
