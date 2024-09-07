package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio3 {
	public static void main(String[] args) {

		
		Polideportivo P1 = new Polideportivo("Polideportivo Barrial", 12500.50, 1);
		Polideportivo P2 = new Polideportivo("Polideportivo Barrial", 2980.85, 1);
		
		ArrayList<Edificio> instalaciones = new ArrayList<Edificio>();
	

		instalaciones.add(P1);
		instalaciones.add(P2);

		Iterator<Edificio> iterator = instalaciones.iterator();
        while (iterator.hasNext()) {
            Edificio edificio = iterator.next();

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Polideportivo: " + polideportivo.getNombre() + ", Superficie: " + polideportivo.getSuperficieEdificio());
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioOficinas = (EdificioDeOficinas) edificio;
                System.out.println("Edificio de oficinas: Superficie: " + edificioOficinas.getSuperficieEdificio() + ", Número de oficinas: " + edificioOficinas.getNumeroDeOficinas());
            }
        }

	}

}