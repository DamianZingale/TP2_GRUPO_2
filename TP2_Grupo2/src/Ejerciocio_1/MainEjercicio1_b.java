package Ejerciocio_1;

import java.util.*;

public class MainEjercicio1_b {

	public static void main(String[] args) {

		TreeSet<Profesor> profesores = new TreeSet<Profesor>();
		Profesor P2 = new Profesor("Sr.Thompson", 25, "Profesor de Ciencias Sociales", 2);
		Profesor P3 = new Profesor("Sra.Thompson", 35, "Profesor de Ciencias Naturales", 5);
		Profesor P4 = new Profesor("Chespirito", 30, "Profesor de Física", 7);
		Profesor P5 = new Profesor("Alf", 27, "Profesor de Aritmética", 1);
		Profesor P1 = new Profesor("Kiko", 45, "Profesor de Matematicas", 12);

		profesores.add(P1);
		profesores.add(P2);
		profesores.add(P3);
		profesores.add(P4);
		profesores.add(P5);

		Iterator<Profesor> it = profesores.iterator();
		System.out.println("Listado de Profesores:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
