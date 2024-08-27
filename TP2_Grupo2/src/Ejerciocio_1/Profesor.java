package Ejerciocio_1;

import java.util.Objects;

public class Profesor extends Empleado {

	private String cargo;
	private int antiguedadDocente;
	
	//constructor sin parametros
	
	public Profesor() {
		
		super();
		cargo = "En espera que alguen se jubile";
		antiguedadDocente = 0;
	}
	
	//constructor con parametros
	public Profesor(String cargo, int antiguedad,String name, int age ) {
		
		super(name, age);
		
		this.cargo = cargo;
		antiguedadDocente = antiguedad;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(antiguedadDocente, cargo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return antiguedadDocente == other.antiguedadDocente && Objects.equals(cargo, other.cargo);
	}

	@Override
	public String toString() {
		return "Profesor [cargo: " + cargo + ", antiguedadDocente: " + antiguedadDocente + "]";
	}

	
	
}
