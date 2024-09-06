package Ejercicio3;

public abstract class Polideportivo implements Edificio, InstalacionDeportiva{
	
	 private String Nombre;
	 private int TipoDeInstalacion;
	
	 ///Contructor vacio
	 public Polideportivo() {}
	 
	 
	 public int getTipoDeInstalacion() {
		
		return TipoDeInstalacion;
	}

}
