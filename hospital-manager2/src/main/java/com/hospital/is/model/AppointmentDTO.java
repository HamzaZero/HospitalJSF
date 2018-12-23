package com.hospital.is.model;

import java.util.Map;

public class AppointmentDTO {

	private String dateTimeAppointment;

	private String typeAppointment;

	private DoctorDTO doctor;

//	private PatientDTO patient;

	private Map<Integer, PrescriptionDTO> prescriptionMap;

	/**
	 * @return the dateTimeAppointment
	 */
	public String getDateTimeAppointment() {
		return dateTimeAppointment;
	}

	/**
	 * @param dateTimeAppointment the dateTimeAppointment to set
	 */
	public void setDateTimeAppointment(String dateTimeAppointment) {
		this.dateTimeAppointment = dateTimeAppointment;
	}

	/**
	 * @return the typeAppointment
	 */
	public String getTypeAppointment() {
		return typeAppointment;
	}

	/**
	 * @param typeAppointment the typeAppointment to set
	 */
	public void setTypeAppointment(String typeAppointment) {
		this.typeAppointment = typeAppointment;
	}

	/**
	 * @return the doctor
	 */
	public DoctorDTO getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(DoctorDTO doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the prescriptionMap
	 */
	public Map<Integer, PrescriptionDTO> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionList the prescriptionList to set
	 */
	public void setPrescriptionMap(Map<Integer, PrescriptionDTO> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

//	/**
//	 * @return the patient
//	 */
//	public PatientDTO getPatient() {
//		return patient;
//	}
//
//	/**
//	 * @param patient the patient to set
//	 */
//	public void setPatient(PatientDTO patient) {
//		this.patient = patient;
//	}
	
	@Override
	public String toString() {
		return "Appointement [dateTimeAppointment=" + dateTimeAppointment + ", typeAppointment=" + typeAppointment 
				+ ", doctor=" + doctor + ", prescriptionMap=" + prescriptionMap +"]";
	}

}
