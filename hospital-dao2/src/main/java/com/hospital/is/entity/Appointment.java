package com.hospital.is.entity;

import java.util.Map;

public class Appointment {

	private String dateTimeAppointment;

	private String typeAppointment;

	private Doctor doctor;

//	private Patient patient;

	private Map<Integer, Prescription> prescriptionMap;

	/**
	 * @return the dateTimeAppointment
	 */
	public String getDateTimeAppointment() {
		return dateTimeAppointment;
	}

	/**
	 * @param dateTimeAppointment
	 *            the dateTimeAppointment to set
	 */
	public void setDateTimeAppointment(String dateTimeAppointment) {
		this.dateTimeAppointment = dateTimeAppointment;
		// get date time

	}

	/**
	 * @return the typeAppointment
	 */
	public String getTypeAppointment() {
		return typeAppointment;
	}

	/**
	 * @param typeAppointment
	 *            the typeAppointment to set
	 */
	public void setTypeAppointment(String typeAppointment) {
		this.typeAppointment = typeAppointment;
	}

	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the prescriptionList
	 */
	public Map<Integer, Prescription> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionList
	 *            the prescriptionList to set
	 */
	public void setPrescriptionMap(Map<Integer, Prescription> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

//	/**
//	 * @return the patient
//	 */
//	public Patient getPatient() {
//		return patient;
//	}
//
//	/**
//	 * @param patient
//	 *            the patient to set
//	 */
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}

}
