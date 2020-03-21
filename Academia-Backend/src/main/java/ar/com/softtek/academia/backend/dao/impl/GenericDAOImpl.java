package ar.com.softtek.academia.backend.dao.impl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.dao.DataAccessException;
import ar.com.academia.entities.excepciones.PersistenceException;
import ar.com.softtek.academia.backend.dao.GenericDAO;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	protected SessionFactory sessionFactory;

	private Class<T> type = null;

	public Class<T> getType() {
		return type;
	}

	public void setType(Class<T> type) {
		this.type = type;
	}

	public List<T> getAll() throws PersistenceException {

		try {
			List<T> result = (List<T>) this.sessionFactory.getCurrentSession().createCriteria(getType());

			return result;
		} catch (DataAccessException e) {
			throw new PersistenceException();

		}

	}

	public T getById(int id) throws PersistenceException {
		try {
			T result = (T) this.sessionFactory.getCurrentSession().get(this.getType(), id);

			return result;
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}

	}

	public void save(T entidad) throws PersistenceException {

		try {
			this.sessionFactory.getCurrentSession().save(entidad);

		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	public void update(T entidad) throws PersistenceException {
		try {
			this.sessionFactory.getCurrentSession().update(entidad);
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}

	}

	public boolean delete(T entidad) throws PersistenceException {
		try {
			this.sessionFactory.getCurrentSession().delete(entidad);
			return true;
		} catch (DataAccessException e) {
			throw new PersistenceException();
		}
	}

	public int count() throws PersistenceException {
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

}
