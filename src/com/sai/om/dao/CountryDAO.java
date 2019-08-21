package com.sai.om.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sai.om.HibernateUtil4;
import com.sai.om.dto.CountryDTO;

public class CountryDAO {
	
	public CountryDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public void saveCountry(CountryDTO countryDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(countryDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public void updateCountry(CountryDTO countryDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		CountryDTO dto1=session.get(CountryDTO.class, 1);
		dto1.setCountrySports("cricket");
		session.update(dto1);
		transaction.commit();
		session.close();
		factory.close();
	}
	public void deleteCountry(CountryDTO countryDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(countryDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public CountryDTO getCountry(CountryDTO countryDTO)
	{
		SessionFactory factory=HibernateUtil4.getFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		CountryDTO dto2=session.get(CountryDTO.class,2);
		transaction.commit();
		session.close();
		factory.close();
		return dto2;
	}
}
