package com.hospital.is;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Appointment;
import com.hospital.is.entity.Disease;
import com.hospital.is.entity.Doctor;
import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.entity.Medication;
import com.hospital.is.entity.Patient;
import com.hospital.is.entity.Prescription;

public class StaticDatabase {

	private static Map<Integer, Disease> diseaseMap = new HashMap<Integer, Disease>();
	private static Map<Integer, Appointment> appointmentMap = new HashMap<Integer, Appointment>();
	private static Map<Integer, Prescription> presciptionMap = new HashMap<Integer, Prescription>();
	private static Map<Integer, Medication> medicationMap = new HashMap<Integer, Medication>();
	private static Map<Integer, MedicalFolder> medicalFolderMap = new HashMap<Integer, MedicalFolder>();
	private static Map<Integer, Patient> patientMap = new HashMap<>();
	private static Map<Integer, Doctor> doctorMap = new HashMap<>();

	static {
		Patient patient = new Patient();

		patient.setMedicalFolder(getMedicalFolderMap().get(1));
		patient.setFirstName("Sara");
		patient.setLastName("ERQUIOUAQ");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");

		Patient patient2 = new Patient();

		patient2.setMedicalFolder(getMedicalFolderMap().get(1));
		patient2.setFirstName("Ikhlas");
		patient2.setLastName("KHEY");
		patient2.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient2.setBirthDate("01/01/1970");
		patient2.setPhone("+212 6 66 77 88 99");

		patientMap.put(1, patient);
		patientMap.put(2, patient2);
	}

	public static Map<Integer, Object> getGenericMap(String key) {

		switch (key) {
//		case "Patient":
//			return getPatientMap();
//		case "Disease":
//			return getDiseaseMap();
//		case "Appointment":
//			return getAppointmentMap();
//		case "MedicalFolder":
//			return getMedicalFolderMap();

		default:
			break;
		}

		return null;
	}

	public static Map<Integer, Patient> getPatientMap() {

		return patientMap;
	}

	/**
	 * @return the diseaseList
	 */
	public static Map<Integer, Disease> getDiseaseMap() {

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseMap.put(1, disease);

		return diseaseMap;
	}

	/**
	 * 
	 * @return the appointementList
	 */
	public static Map<Integer, Appointment> getAppointmentMap() {

		Appointment appointment = new Appointment();
		appointment.setDateTimeAppointment("21/02/2016");
		appointment.setDoctor(getDoctorList().get(1));
		appointment.setTypeAppointment("Consultation");
		appointment.setPrescriptionMap(getPrescriptionMap());

		appointmentMap.put(1, appointment);

		return appointmentMap;
	}

	/**
	 * @return the prescriptionList
	 */
	private static Map<Integer, Prescription> getPrescriptionMap() {

		Prescription prescription = new Prescription();
		prescription.setDescriptionOfUse("Using daily !");
		prescription.setMedicationMap(getMedicationMap());

		presciptionMap.put(1, prescription);

		return presciptionMap;
	}

	/**
	 * @return the medicalList
	 */
	private static Map<Integer, Medication> getMedicationMap() {

		Medication medication = new Medication();
		medication.setMedicationName("Medication1");
		medication.setQuantity(30);
		medication.setInstrutionOfUse("Instruction");
		medication.setDurationOfUse("1 month");

		medicationMap.put(1, medication);

		return medicationMap;
	}

	/**
	 * @return the medicalFolderList
	 */
	public static Map<Integer, MedicalFolder> getMedicalFolderMap() {

		MedicalFolder medicalFolder = new MedicalFolder();

		medicalFolder.setDiseaseMap(getDiseaseMap());
		medicalFolder.setAppointmentMap(getAppointmentMap());

		medicalFolderMap.put(1, medicalFolder);

		return medicalFolderMap;
	}

	/**
	 * @return the patientList
	 */

	/**
	 * @return the patientList
	 */
	public static Map<Integer, Doctor> getDoctorList() {

		Doctor doctor = new Doctor();

		doctor.setFirstName("Ahmed");
		doctor.setLastName("BENANI");
		doctor.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		doctor.setBirthDate("01/01/1974");
		doctor.setPhone("+212 6 66 77 88 77");

		doctorMap.put(1, doctor);

		return doctorMap;
	}

}
