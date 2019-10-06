package ar.com.softtek.academia.web.action;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.ServiceException;
import ar.com.academia.services.SocioService;

public class SocioAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Socio socio;

	private SocioService socioservice;

	public SocioAction() {

	}

	public SocioService getSocioservice() {
		return socioservice;
	}

	public void setSocioservice(SocioService socioservice) {
		this.socioservice = socioservice;
	}

	public String execute() {
		return "SUCCESS";
	}

	public String addSocio() throws ServiceException {
		socioservice.add(socio);

		return "SUCCESS";
	}

	public String delete() throws ServiceException {
		socioservice.RemoveById(socio.getNumeroSocio());

		return "SUCCESS";
	}

	public String listSocio() throws ServiceException {
		socioservice.getAll();

		return "SUCCESS";
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
