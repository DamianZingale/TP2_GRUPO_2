package Ejerciocio_1;

import java.util.Objects;

;

public class Empleado implements Comparable <Empleado> {
	private int _id;
	private String _name;
	private int _age;
	private static int cont = 1000;
	

	public Empleado() {
		_id = 99;
		_name = "undefined";
		_age = -1;
	}

	public Empleado(String name, int age) {
		_id= devuelveProximoId();
		this._name = name;
		this._age = age;
	}
	
	public static int devuelveProximoId() {
		return cont++;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	public int get_id() {
		return _id;
	}
	
	//METHOD PUBLIC
	@Override
	public String toString() {
		return "Empleado " + _id + "\n name: " + _name  + "\n age: " + _age + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(_age, _id, _name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return _age == other._age && _id == other._id && Objects.equals(_name, other._name);
	}
	
	@Override
	public int compareTo(Empleado o) {
		if(this._id == o.get_id())return 0;  //ORDENADO POR ID
		if(this._id > o.get_id()) return 1;
		return -1;
	}
	
	}
