package Ejerciocio_1;

import java.util.*;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor P1 = new Profesor("Ariel",45,"Profesor de Matematicas",12);
		Profesor P2 = new Profesor("Jose",25,"Profesor de Matematicas",2);
		Profesor P3 = new Profesor("Pedro",35,"Profesor de Matematicas",5);
		Profesor P4 = new Profesor("Juan",30,"Profesor de Matematicas",7);
		Profesor P5 = new Profesor("Alex",27,"Profesor de Matematicas",1);
		
		ArrayList<Profesor> p = new ArrayList<Profesor>();
		p.add(P1);
		p.add(P2);
		p.add(P3);
		p.add(P4);
		p.add(P5);
		
		
		ListIterator<Profesor> it = p.listIterator();
		while(it.hasNext()) {
		Profesor x = it.next();
		System.out.println(x.toString());
		it.remove();
		}
	}

}

