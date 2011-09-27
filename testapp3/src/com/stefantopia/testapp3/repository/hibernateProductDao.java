package com.stefantopia.testapp3.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.stefantopia.testapp3.models.Product;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class hibernateProductDao  extends HibernateDaoSupport implements ProductDao {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    public List<Product> getProductList()
	{
		logger.info("Getting products! From Hibernate");
		List<Product> productList = null;
		Session session = getSessionFactory().getCurrentSession();
        productList = session.createQuery(
                "from Product ORDER BY id").list();
        return productList;

	}

    public void saveProduct(Product prod)
	{
		logger.info("Saving product: " + prod.getDescription());
		
	}


}
