package Ejercicio3;

public abstract class Polideportivo implements Edificio, InstalacionDeportiva {

	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;

	/// Contructor vacio
	public Polideportivo() {
	}

	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    @Override
    public int getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

}
