package Ejercicio2;

public class ProductoCongelado extends Producto {
	
	
	
	private String fechaDeCaducidad;
	private int numeroDeLote;
	private int temperaturaRecomendada;
	
	
	//CONSTRUCTORES CON Y SIN PARAMETROS:
	public ProductoCongelado() {
		super();
	}


	public ProductoCongelado(String fechaDeCaducidad, int numeroDeLote, int temperaturaRecomendada) {
		super();
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	
	
	
	

}
