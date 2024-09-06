package Ejercicio2;

public class Producto {
    private String fechaDeCaducidad;
    private int numeroDeLote;
    
    public Producto() {};

    public Producto(String fechaDeCaducidad, int numeroDeLote) {
		
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
	}
    
	public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }
    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    public int getNumeroDeLote() {
        return numeroDeLote;
    }
    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
}
