package ar.com.softtek.academia.backend.bo;

import java.util.List;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;


//agregando un comentarioS
public interface SocioBO {

	List<Socio> getAllSocios() throws BusinessException;

	Socio getSocioById(int id) throws BusinessException;

	void saveSocio(Socio socio) throws BusinessException;

	void updateSocio(Socio socio) throws BusinessException;

	boolean deleteSocio(Socio socio) throws BusinessException;

	boolean deleteSocioById(int id) throws BusinessException;

	public int countSocios() throws BusinessException;
}
