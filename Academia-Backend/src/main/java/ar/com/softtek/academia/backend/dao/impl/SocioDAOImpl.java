package ar.com.softtek.academia.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.dao.DataAccessException;
import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.PersistenceException;
import ar.com.softtek.academia.backend.dao.SocioDAO;

public class SocioDAOImpl extends GenericDAOImpl<Socio> implements SocioDAO {
	private Class<Socio> type = null;
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Class<Socio> getType() {
		return Socio.class;
	}

	public void setType(Class<Socio> type) {
		this.type = type;
	}

	public boolean deleteSocioByIdDao(int id) throws PersistenceException {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Socio> getAllSociosDao() throws PersistenceException {
		try {
			List<Socio> result =  (List<Socio>) this.sessionFactory.getCurrentSession().createCriteria(getType());
			return result;
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	public Socio getSocioByIdDao(int id) throws PersistenceException {
		try {
			Socio result = (Socio) this.sessionFactory.getCurrentSession().get(this.getType(), id);
			return result;
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	public void saveSocioDao(Socio entidad) throws PersistenceException {
		try {
			this.sessionFactory.getCurrentSession().save(entidad);

		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	public void updateSocioDao(Socio entidad) throws PersistenceException {
		try {
			this.sessionFactory.getCurrentSession().update(entidad);
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	public boolean deleteSocioDao(Socio entidad) throws PersistenceException {
		try {
			this.sessionFactory.getCurrentSession().delete(entidad);
			return true;
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	public int countSociosDao() throws PersistenceException {
		try {
			Session sesion = this.sessionFactory.getCurrentSession();
			Criteria criteria = sesion.createCriteria(this.getType());
			criteria.setProjection(Projections.rowCount());
			List result = criteria.list();
			return (Integer) result.get(0);
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	@Override
	public boolean delete(int id) throws PersistenceException {
		// TODO Auto-generated method stub
		return false;
	}

}