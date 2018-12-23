package com.hospital.is.entity;


import java.util.Map;

public class MedicalFolder {

	private Map<Integer, Disease> diseaseMap;
	
	private Map<Integer, Appointment> appointmentMap;


	/**
	 * @return the diseaseMap
	 */
	public Map<Integer, Disease> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseMap the diseaseMap to set
	 */
	public void setDiseaseMap(Map<Integer, Disease> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}
	

	/**
	 * @return the appointmentMap
	 */
	public Map<Integer, Appointment> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentMap the appointmentMap to set
	 */
	public void setAppointmentMap(Map<Integer, Appointment> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicalFolder [diseaseList=" + diseaseMap + "]";
	}
	
	
}
