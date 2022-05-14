package com.scm.ojt.veterinarypharmacy.persistance.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scm.ojt.veterinarypharmacy.entity.Authority;
import com.scm.ojt.veterinarypharmacy.persistance.dao.AuthorityDao;

@Transactional
@Repository
public class AuthorityDaoImpl implements AuthorityDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveAuthority(Authority authority) {
		this.sessionFactory.getCurrentSession().save(authority);
	}

	/*
	 * @Override public Authority getAuthorityByName(String name) {
	 * 
	 * @SuppressWarnings("rawtypes") Query query =
	 * this.sessionFactory.getCurrentSession()
	 * .createQuery("SELECT a FROM Authority a WHERE a.name = :name");
	 * query.setParameter("name", name); return (Authority) query.uniqueResult(); }
	 */
}