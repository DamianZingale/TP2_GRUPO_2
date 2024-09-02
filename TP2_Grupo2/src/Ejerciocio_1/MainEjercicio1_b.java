package Ejerciocio_1;

import java.util.*;

public class MainEjercicio1_b {

	public static void main(String[] args) {

		TreeSet<Profesor> profesores = new TreeSet<Profesor>();
		Profesor P2 = new Profesor("Sr.Thompson", 25, "Profesor de Ciencias Sociales", 2);
		Profesor P3 = new Profesor("Sra.Thompson", 35, "Profesor de Ciencias Naturales", 5);
		Profesor P4 = new Profesor("Chespirito", 30, "Profesor de FÃ­sica", 7);
		Profesor P5 = new Profesor("Alf", 27, "Profesor de AritmÃ©tica", 1);
		Profesor P1 = new Profesor("Kiko", 45, "Profesor de Matematicas", 12);
		
		// Punto 7: Comparar dos objetos de tipo Profesor con la misma información
	    Profesor P6 = new Profesor("Ana", 30, "Profesor de Matematicas", 10); 
	    Profesor P7 = new Profesor("Ana", 30, "Profesor de Matematicas", 10); 
	    
		profesores.add(P1);
		profesores.add(P2);
		profesores.add(P3);
		profesores.add(P4);
		profesores.add(P5);
		
		// Agrego los 2 profesores al TreeSet
	    profesores.add(P6);
	    profesores.add(P7);
		
		Iterator<Profesor> it = profesores.iterator();
		System.out.println("Listado de Profesores:");
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
		
		// Comparar los dos últimos profesores
	        if (P7.equals(P6)) {
	            System.out.println("\nEs el mismo profesor.");
	        } else {
	            System.out.println("\nNo es el mismo profesor.");
	        }	
	}

}
