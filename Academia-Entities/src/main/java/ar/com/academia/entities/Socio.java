package ar.com.academia.entities;

import java.util.List;

public class Socio {

	private int id;
	private int numeroSocio;
	private String nombreYapellido;
	private String sexo;
	private String estadoCivil;
	private String nombreConyuge;
	private int cantidadHijos;
	private String dni;
	private String telefono;
	private String direccion;
	private List<Turno> turnos;	

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public String getNombreYapellido() {
		return nombreYapellido;
	}

	public void setNombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNombreConyuge() {
		return nombreConyuge;
	}

	public void setNombreConyuge(String nombreConyuge) {
		this.nombreConyuge = nombreConyuge;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}