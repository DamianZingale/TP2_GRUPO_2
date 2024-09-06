package Ejercicio3;

public class InstalacionDeportiva {
	
	private int TipoInstalacion;

	public InstalacionDeportiva(int tipoInstalacion) {
		super();
		TipoInstalacion = tipoInstalacion;
	}

	public int getTipoInstalacion() {
		return TipoInstalacion;
	}

	public void setTipoInstalacion(int tipoInstalacion) {
		TipoInstalacion = tipoInstalacion;
	}

	@Override
	public String toString() {
		return "TipoInstalacion:" + TipoInstalacion;
	}
	
}
