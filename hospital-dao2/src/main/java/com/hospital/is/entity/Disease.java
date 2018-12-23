package com.hospital.is.entity;

public class Disease {

	private String nature;

	private String description;

	private String state;

	private String diagDate;

	/**
	 * @return the nature
	 */
	public String getNature() {
		return nature;
	}

	/**
	 * @param nature the nature to set
	 */
	public void setNature(String nature) {
		this.nature = nature;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the diagDate
	 */
	public String getDiagDate() {
		return diagDate;
	}

	/**
	 * @param diagDate the diagDate to set
	 */
	public void setDiagDate(String diagDate) {
		this.diagDate = diagDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Disease [nature=" + nature + ", description=" + description + ", state=" + state + ", diagDate="
				+ diagDate + "]";
	}

}
