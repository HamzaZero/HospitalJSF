package com.hospital.is.model;

import java.util.Map;

public class PrescriptionDTO {

	private Map<Integer, MedicationDTO> medicationMap;
	
	private String descriptionOfUse;


	/**
	 * @return the medicationMap
	 */
	public Map<Integer, MedicationDTO> getMedicationMap() {
		return medicationMap;
	}

	/**
	 * @param medicationMap the medicationMap to set
	 */
	public void setMedicationMap(Map<Integer, MedicationDTO> medicationMap) {
		this.medicationMap = medicationMap;
	}

	/**
	 * @return the descriptionOfUse
	 */
	public String getDescriptionOfUse() {
		return descriptionOfUse;
	}

	/**
	 * @param descriptionOfUse the descriptionOfUse to set
	 */
	public void setDescriptionOfUse(String descriptionOfUse) {
		this.descriptionOfUse = descriptionOfUse;
	}
	
	@Override
	public String toString() {
		return "Prescription [medicationMap=" + medicationMap + ", descriptionOfUse=" + descriptionOfUse + "]";
	}
	
	
}
