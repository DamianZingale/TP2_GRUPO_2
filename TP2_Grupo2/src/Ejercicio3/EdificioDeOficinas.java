package Ejercicio3;

public class EdificioDeOficinas implements Edificio{
	
	private int numeroDeOficinas;
    private double superficie;

    public EdificioDeOficinas(int numeroDeOficinas, double superficie) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.superficie = superficie;
    }

    @Override
    double getSuperficieEdificio() {
        return superficie;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    @Override
    public String toString() {
        return "Edificio de Oficinas [Número de Oficinas=" + numeroDeOficinas +
               ", Superficie=" + superficie + " m²]";
    }

}
