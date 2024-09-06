package Ejercicio2;

public class ProductoRefrigerado extends Producto {
	
	private int codigoDelOrganismo;
	
	//constructor sin parametros
	public ProductoRefrigerado() {}
	
	//constructor con parametros
    public ProductoRefrigerado(String fechaDeCaducidad, int numeroDeLote, int codigoDelOrganismo) {
        super(fechaDeCaducidad, numeroDeLote);
        this.codigoDelOrganismo = codigoDelOrganismo;
    }
    //GETTERS & SETTERS
    public int getCodigoDelOrganismo() {
        return codigoDelOrganismo;
    }

    public void setCodigoDelOrganismo(int codigoDelOrganismo) {
        this.codigoDelOrganismo = codigoDelOrganismo;
    }
    
    //METODO TOSTRING()
    @Override
    public String toString() {
        return "Producto Refrigerado:" + 
        		"\n Fecha de caducidad: " + getFechaDeCaducidad() + 
        		"\n Numero de lote: " + getNumeroDeLote() +
                "\n Codigo del organismo: " + codigoDelOrganismo;
    }
}
