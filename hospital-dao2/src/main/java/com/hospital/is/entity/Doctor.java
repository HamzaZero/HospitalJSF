package com.hospital.is.entity;

public class Doctor extends Person {
	
	private Integer registrationNumber;
	
	private String specialite;

	/**
	 * @return the registrationNumber
	 */
	public Integer getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	
}
