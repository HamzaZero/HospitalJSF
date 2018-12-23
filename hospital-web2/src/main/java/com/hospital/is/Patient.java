package com.hospital.is;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

@ManagedBean(name="patient")
@SessionScoped
public class Patient {
	
	PatientService patientService = new PatientServiceImpl();
	
	public Patient() {
		
	}
	
	
	public void methode(String firstName,String lastName)
	{
		
		firstName=this.firstName;
		lastName=this.lastName;
		
		System.out.println("Nom :"+firstName+ ", Prenom : "+lastName );
	}
	
	public void getall()
	{
		
		System.out.println(patientService.getAll());
	}

	/**
	 * Le prénom de la personne
	 */
	private String firstName;

	/**
	 * Le nom de la personne
	 */
	private String lastName;

	/**
//	 * L'adresse de la personne
	 */
	private String address;

	/**
	 * Le numéro de téléphone de la personne
	 */
	private String phone;

	/**
	 * La date de naissance de la personne
	 */
	private String birthDate;

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public final String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public final void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the birthDate
	 */
	public final String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public final void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone
				+ ", birthDate=" + birthDate + "]";
	}

}
