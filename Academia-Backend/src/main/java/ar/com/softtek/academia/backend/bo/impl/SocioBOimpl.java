package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;
import ar.com.academia.entities.excepciones.PersistenceException;
import ar.com.softtek.academia.backend.bo.SocioBO;

import ar.com.softtek.academia.backend.dao.impl.MockSocioDAO;
import ar.com.softtek.academia.backend.dao.impl.SocioDAOimpl;

public class SocioBOimpl implements SocioBO {

	private List<Socio> listSocio;
	private Socio socio;
	private SocioDAOimpl socioDAO1;
	
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

	public List<Socio> getAll() throws BusinessException {
		try {
			listSocio = socioDAO1.getAll();
			return listSocio;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}
		
	}

	public Socio getById(int id) throws BusinessException {
		try {
			socio= socioDAO1.getById(id);
			return socio;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}
		
	}

	public void save(Socio socio) throws BusinessException {
		try {
			socioDAO1.save(socio);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}

	}

	public void update(Socio socio) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			socioDAO1.update(socio);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}

	}

	public boolean delete(Socio socio) throws BusinessException {
		try {
			socioDAO1.delete(socio);
			return true;
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException();
		}
		
		
	}

	public boolean delete(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	public int count() throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

}
