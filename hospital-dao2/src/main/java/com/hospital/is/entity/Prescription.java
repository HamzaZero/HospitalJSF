package com.hospital.is.entity;

import java.util.Map;

public class Prescription {

	private Map<Integer, Medication> medicationMap;
	
	private String descriptionOfUse;


	/**
	 * @return the medicationMap
	 */
	public Map<Integer, Medication> getMedicationMap() {
		return medicationMap;
	}

	/**
	 * @param medicationMap the medicationMap to set
	 */
	public void setMedicationMap(Map<Integer, Medication> medicationMap) {
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
	
	
}
