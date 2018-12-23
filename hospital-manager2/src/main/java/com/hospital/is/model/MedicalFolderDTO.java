package com.hospital.is.model;


import java.util.Map;

public class MedicalFolderDTO {

	private Map<Integer, DiseaseDTO> diseaseMap;
	
	private Map<Integer, AppointmentDTO> appointmentMap;


	/**
	 * @return the diseaseList
	 */
	public Map<Integer, DiseaseDTO> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseMap the diseaseMap to set
	 */
	public void setDiseaseMap(Map<Integer, DiseaseDTO> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}
	
	

	/**
	 * @return the appointmentMap
	 */
	public Map<Integer, AppointmentDTO> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentList the appointmentList to set
	 */
	public void setAppointmentList(Map<Integer, AppointmentDTO> appointmentList) {
		this.appointmentMap = appointmentList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicalFolder [diseaseList=" + diseaseMap + ", appointmentMap=" + appointmentMap + "]";
	}
	
	
}
