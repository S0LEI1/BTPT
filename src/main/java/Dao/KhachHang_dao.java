package Dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.cfg.beanvalidation.HibernateTraversableResolver;

import Connect.MyEMFactory;
import Enitty.DuAn;
import jakarta.persistence.EntityManager;


public class KhachHang_dao {
	private EntityManager ef;
	public KhachHang_dao() {
		ef = MyEMFactory.getInstance().getEntityManagerFactory().createEntityManager();
	}
	public boolean add(DuAn an) {
		jakarta.persistence.EntityTransaction tr = ef.getTransaction();
		try {
			tr.begin();
			ef.persist(an);
			tr.commit();
			
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}

}
