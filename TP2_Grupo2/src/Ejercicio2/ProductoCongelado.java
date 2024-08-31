package Ejercicio2;

public class ProductoCongelado extends Producto {
	
	
	private int temperaturaRecomendada;
	
	
	//CONSTRUCTORES CON Y SIN PARAMETROS:
	public ProductoCongelado() {
		super();
	}


	public ProductoCongelado(String fechaDeCaducidad, int numeroDeLote, int temperaturaRecomendada) {
		super(fechaDeCaducidad,numeroDeLote);
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	
	
	
	

}
