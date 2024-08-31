package Ejercicio2;

public class ProductoFresco extends Producto {

	private String fechaDeEnvasado;
	private String paisDeOrigen;
	
	public ProductoFresco() {};
	
	public ProductoFresco(String fechaDeCaducidad, int numeroDeLote, String fechaDeEnvasado, String paisDeOrigen) {
		super(fechaDeCaducidad,numeroDeLote);
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.paisDeOrigen = paisDeOrigen;
	}

	public String getFechaDeEnvasado() {
		return fechaDeEnvasado;
	}

	public void setFechaDeEnvasado(String fechaDeEnvasado) {
		this.fechaDeEnvasado = fechaDeEnvasado;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	@Override
	public String toString() {
		return "ProductoFresco " + "\n Fecha de caducidad:" + getFechaDeCaducidad() +
		"\n Numero de lote: " + getNumeroDeLote() + "\n Fecha de envasado: " + fechaDeEnvasado + "\n Pais de origen: " + paisDeOrigen;
	}
	
}
