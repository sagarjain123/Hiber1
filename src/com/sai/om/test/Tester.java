package com.sai.om.test;

import com.sai.om.dao.CountryDAO;
import com.sai.om.dto.CountryDTO;

public class Tester {
	
	public static void main(String[] args) {
		
		CountryDTO dto=new CountryDTO();
		dto.setCountryId(2);
		dto.setCountryName("indias");
		dto.setCountrySports("hockeys");
		dto.setCountryCapital("newdelhis");
		
		CountryDAO dao=new CountryDAO();
		//dao.saveCountry(dto);
		//dao.updateCountry(dto);
		dao.deleteCountry(dto);
//		CountryDTO dto3=dao.getCountry(dto);
//		System.out.println(dto3.getCountryCapital());
		System.out.println("data save");
	}

}
