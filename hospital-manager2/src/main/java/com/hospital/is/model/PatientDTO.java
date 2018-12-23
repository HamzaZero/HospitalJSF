package com.hospital.is.model;

public class PatientDTO extends PersonDTO implements Comparable<PatientDTO> {

	private MedicalFolderDTO medicalFolder;

	/**
	 * @return the medicalFolder
	 */
	public MedicalFolderDTO getMedicalFolder() {
		return medicalFolder;
	}

	/**
	 * @param medicalFolder the medicalFolder to set
	 */
	public void setMedicalFolder(MedicalFolderDTO medicalFolder) {
		this.medicalFolder = medicalFolder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient " + super.toString() + " [medicalFolder=" + medicalFolder + "]";
	}

	public int compareTo(PatientDTO o) {
		// TODO Auto-generated method stub
//		if (this.getFirstName().subSequence(0, 1).equals(o.getFirstName().substring(0, 1))) {
//			return 0;
//		} else {
//			return -1;
//		}
		return 0;
	}


}
