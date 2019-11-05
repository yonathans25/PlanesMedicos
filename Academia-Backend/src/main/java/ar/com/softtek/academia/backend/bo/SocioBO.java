package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;


//agregando un comentarioS
public interface SocioBO {

	List<Socio> getAll() throws BusinessException;

	Socio getById(int id) throws BusinessException;

	void save(Socio socio) throws BusinessException;

	void update(Socio socio) throws BusinessException;

	boolean delete(Socio socio) throws BusinessException;

	boolean delete(int id) throws BusinessException;

	public int count() throws BusinessException;
}
