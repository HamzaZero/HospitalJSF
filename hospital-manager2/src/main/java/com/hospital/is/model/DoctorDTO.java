package com.hospital.is.model;

public class DoctorDTO extends PersonDTO {
	
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
	
	@Override
	public String toString() {
		return "Doctor " + super.toString() + " [registrationNumber=" + registrationNumber + ", specialite=" + specialite + "]";
	}

	
}
