package br.example.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.example.dao.OrderDetailDao;

public final class DaoFactory {

	private DaoFactory() { }

	///////////////////////////////////////////////////////////////////
	// ENTITY MANAGER FACTORY
	///////////////////////////////////////////////////////////////////

	private static final String PERSISTENCE_UNIT_NAME = "myunitpersistencename";

	private static EntityManagerFactory entityManagerFactoryInstance;

	public static EntityManagerFactory entityManagerFactorInstance() {
		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}

		return entityManagerFactoryInstance;
	}

	///////////////////////////////////////////////////////////////////
	// ORDER DETAIL -> This is an example of how to create an instance...
	///////////////////////////////////////////////////////////////////

	private static OrderDetailDao orderDetailDaoInstance;

	public static OrderDetailDao orderDetailInstance() {
		if (orderDetailDaoInstance == null) {
			orderDetailDaoInstance = new OrderDetailDao();
		}

		return orderDetailDaoInstance;
	}

}