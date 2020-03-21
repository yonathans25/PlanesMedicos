package ar.com.softtek.academia.backend.dao;

import java.util.List;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.PersistenceException;

public interface SocioDAO {

	List<Socio> getAllSociosDao() throws PersistenceException;

	Socio getSocioByIdDao(int id) throws PersistenceException;

	void saveSocioDao(Socio socio) throws PersistenceException;

	void updateSocioDao(Socio socio) throws PersistenceException;

	boolean deleteSocioDao(Socio socio) throws PersistenceException;

	boolean deleteSocioByIdDao(int id) throws PersistenceException;

	public int countSociosDao() throws PersistenceException;

}