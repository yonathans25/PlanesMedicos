package ar.com.academia.services;

import java.util.List;

import javax.jws.WebService;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;
import ar.com.academia.entities.excepciones.ServiceException;
import ar.com.softtek.academia.backend.bo.impl.SocioBOImpl;

@WebService(endpointInterface = "package ar.com.academia.services.SocioService", serviceName = "SocioService")
public class SocioServiceImpl implements SocioService {

	private SocioBOImpl socioBO;
	private List<Socio> listSocio;
	private Socio socio;

	public SocioBOImpl getSocioBO() {
		return socioBO;
	}

	public void setSocioBO(SocioBOImpl socioBO) {
		this.socioBO = socioBO;
	}

	public List<Socio> getListSocio() {
		return listSocio;
	}

	public void setListSocio(List<Socio> listSocio) {
		this.listSocio = listSocio;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public void add(Socio socio) throws ServiceException {
		try {
			socioBO.save(socio);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServiceException();
		}

	}

	public List<Socio> getAll() throws ServiceException {
		try {
			listSocio = socioBO.getAll();
			return listSocio;
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServiceException();
		}

	}

	public Socio getById(int id) throws ServiceException {
		try {
			socio = socioBO.getById(id);
			return socio;

		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServiceException();
		}

	}

	public List<Socio> getBySexo(String sexo) throws ServiceException {

		return null;
	}

	public Boolean RemoveById(int id) throws ServiceException {
		try {
			socioBO.delete(id);
			return true;
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServiceException();

		}

	}

}
