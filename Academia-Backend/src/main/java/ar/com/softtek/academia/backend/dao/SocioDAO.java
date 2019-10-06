package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.PersistenceException;

public interface SocioDAO {

	List<Socio> getAll() throws PersistenceException;

	Socio getById(int id) throws PersistenceException;

	void save(Socio socio) throws PersistenceException;

	void update(Socio socio) throws PersistenceException;

	boolean delete(Socio socio) throws PersistenceException;

	boolean delete(int id) throws PersistenceException;

	public int count() throws PersistenceException;

}