package Ejerciocio_1;

import java.util.Objects;

public class Profesor extends Empleado {

	private String cargo;
	private int antiguedadDocente;
	
	//constructor sin parametros
	
	protected Profesor() {
		
		super();
		cargo = "En espera que alguen se jubile";
		antiguedadDocente = 0;
	}
	
	//constructor con parametros
	protected Profesor(String name, int age, String cargo, int antiguedad) {
		
		super(name, age);
		
		this.cargo = cargo;
		antiguedadDocente = antiguedad;
		
	}
	//GETTERS & SETTERS
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//HASHCODE
	@Override
	public int hashCode() {
		return Objects.hash(antiguedadDocente, cargo);
	}

	//EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		 return this.get_name().equals(other.get_name()) && 
		           this.get_age() == other.get_age() &&
		           this.cargo.equals(other.cargo) && 
		           this.antiguedadDocente == other.antiguedadDocente;
	}

	//METODO TOSTRING()
	@Override
	public String toString() {
		return "\n Id: " + get_id() + "\n Nombre: " + get_name() + "\n Edad: " + get_age() + "\n Cargo: " + cargo + "\n Antiguedad: " + antiguedadDocente;
	}

	
	
}
