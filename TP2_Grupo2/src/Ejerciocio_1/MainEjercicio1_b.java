package Ejerciocio_1;

import java.util.*;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		 TreeSet <Profesor> profesores = new TreeSet<Profesor>();
		 Profesor Prof1 = new Profesor();
		 
		 profesores.add(Prof1);
		 
		 System.out.println("Listado de Profesores:");
		 for (Profesor prof : profesores) {
			 
			 System.out.println(prof.toString());
		 }
		 

	}

}
