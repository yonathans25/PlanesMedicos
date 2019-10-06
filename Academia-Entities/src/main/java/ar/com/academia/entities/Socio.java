package ar.com.academia.entities;

import java.util.Collection;


public class Socio {

	private int numeroSocio, 
	            cantidadHijos;
	private Plan plan;
	private String nombreApellido, 
	               sexo, 
	               estadoCivil, 
	               nombreConyuge, 
	               dni, 
	               telefono, 
	               direccion;
	private Collection<Turno> turno;

	public Socio() {

	}

	public Socio(int numeroSocio, int cantidadHijos, Plan plan, String nombreApellido, String sexo, String estadoCivil,
			String nombreConyuge, String dni, String telefono, String direccion, Collection<Turno> turno) {

		this.numeroSocio = numeroSocio;
		this.cantidadHijos = cantidadHijos;
		this.plan = plan;
		this.nombreApellido = nombreApellido;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nombreConyuge = nombreConyuge;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.turno = turno;
	}
	
	

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
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

	public Collection<Turno> getTurno() {
		return turno;
	}

	public void setTurno(Collection<Turno> turno) {
		this.turno = turno;
	}

}