package com.sai.om.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="country_table")
public class CountryDTO  implements Serializable{
	
public CountryDTO() {
	System.out.println(this.getClass().getSimpleName()+"created");
}	
@Id
@GenericGenerator(name="ref",strategy="increment")
@GeneratedValue(generator="ref")
@Column(name="country_Id")
private int countryId;
@Column(name="country_Name")
private String countryName;
@Column(name="counrty_Sports")
private String countrySports;
@Column(name="country_Capital")
private String countryCapital;

public int getCountryId() {
	return countryId;
}
public void setCountryId(int countryId) {
	this.countryId = countryId;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getCountrySports() {
	return countrySports;
}
public void setCountrySports(String countrySports) {
	this.countrySports = countrySports;
}
public String getCountryCapital() {
	return countryCapital;
}
public void setCountryCapital(String countryCapital) {
	this.countryCapital = countryCapital;
}



}
