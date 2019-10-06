package ar.com.academia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.ServiceException;


@WebService(name = "SocioService")
@XmlSeeAlso({ SocioServiceImpl.class })
public interface SocioService {
	@WebMethod(operationName = "agregar")
	@WebResult(name = "resultAgregar")
	public void add(@WebParam(name = "socioSocio") Socio socio) throws ServiceException;

	@WebMethod(operationName = "getall")
	@WebResult(name = "returnsocios")
	public List<Socio> getAll() throws ServiceException;

	@WebMethod(operationName = "obtenerporid")
	@WebResult(name = "socioporid")
	public Socio getById(@WebParam(name = "idsocio") int id) throws ServiceException;

	@WebMethod(operationName = "obtenerporsexo")
	@WebResult(name = "socioporsexo")
	public List<Socio> getBySexo(@WebParam(name = "sexosocio") String sexo) throws ServiceException;

	@WebMethod(operationName = "borrarsocio")
	@WebResult(name = "borradodesocio")
	public Boolean RemoveById(@WebParam(name = "idsocio") int id) throws ServiceException;

}
