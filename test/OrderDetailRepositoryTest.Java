package br.example.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import br.example.dao.OrderDetailDao;
import br.example.models.OrderDetailEntity;
import br.example.util.DaoFactory;

public class OrderDetailRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(OrderDetailRepositoryTest.class);

	private OrderDetailDao orderDetailDao = DaoFactory.orderDetailInstance();

	@Test
	public void testFindAll() {
		List<OrderDetailEntity> orderDetails = this.orderDetailDao.findAll();

		LOGGER.info(orderDetails);
	}

}