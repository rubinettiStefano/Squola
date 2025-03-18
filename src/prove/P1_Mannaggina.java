package prove;

import model.entities.BaseEntity;
import model.entities.Docente;
import model.entities.Lavoratore;
import model.entities.Persona;

public class P1_Mannaggina
{
	public static void main(String[] args)
	{
		Docente d = new Docente();

		Lavoratore l =d;
		Persona p = d;
		BaseEntity b=d;
	}
}
