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
	
	///GET Y SET


	public int getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}


	public void setTemperaturaRecomendada(int temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	//TOSTRING();


	@Override
	public String toString() {
		return "Producto Congelado:" +"\n Fecha de caducidad: " + getFechaDeCaducidad() + 
				"\n Numero de lote: " + getNumeroDeLote() +
				"\n temperaturaRecomendada: " + temperaturaRecomendada + " °C";
	}
	
	
	
	
	

}
