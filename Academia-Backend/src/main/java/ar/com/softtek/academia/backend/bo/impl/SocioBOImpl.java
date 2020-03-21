package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;
import ar.com.academia.entities.excepciones.PersistenceException;
import ar.com.softtek.academia.backend.bo.SocioBO;
import ar.com.softtek.academia.backend.dao.impl.MockSocioDAO;
import ar.com.softtek.academia.backend.dao.impl.SocioDAOImpl;

public class SocioBOImpl implements SocioBO {

	private List<Socio> listSocios;
	private Socio socio;
	private SocioDAOImpl socioDAO1;
	
	private MockSocioDAO socioDAO;

	public MockSocioDAO getSocioDAO() {
		return socioDAO;
	}

	public void setSocioDAO(MockSocioDAO socioDAO) {
		this.socioDAO = socioDAO;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public List<Socio> getAllSocios() throws BusinessException {
		try {
			listSocios = socioDAO1.getAll();
			return listSocios;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}
		
	}

	public Socio getSocioById(int id) throws BusinessException {
		try {
			socio= socioDAO1.getSocioById(id);
			return socio;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}
		
	}

	public void saveSocio(Socio socio) throws BusinessException {
		try {
			socioDAO1.saveSocio(socio);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}

	}

	public void updateSocio(Socio socio) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			socioDAO1.updateSocio(socio);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}

	}

	public boolean deleteSocio(Socio socio) throws BusinessException {
		try {
			socioDAO1.delete(socio);
			return true;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}
		
		
	}

	public boolean deleteSocioById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	public int countSocios() throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

}
