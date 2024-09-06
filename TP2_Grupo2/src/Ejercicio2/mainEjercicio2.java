package Ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		Producto prod1 = new ProductoCongelado("20-10-2025", 101,2);
		Producto prod2 = new ProductoFresco("20-09-2024",102,"01-09-2024", "Argentina");
		Producto prod3 = new ProductoRefrigerado ("01-10-2024", 103, 003);
		
		
		System.out.println(prod1.toString());
		System.out.println("-------------------------------------");
		System.out.println(prod2.toString());
		System.out.println("-------------------------------------");
		System.out.println(prod3.toString());
	}

}
