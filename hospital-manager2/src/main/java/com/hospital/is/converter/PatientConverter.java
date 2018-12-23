package com.hospital.is.converter;

import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;

public class PatientConverter extends GeneralConverter<Patient, PatientDTO> {

	MedicalFolderConverter medicalFolderConverter = new MedicalFolderConverter();
	
	@Override
	public PatientDTO toDTO(Patient entity) {
		
		PatientDTO dto = new PatientDTO();
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setAddress(entity.getAddress());
		dto.setPhone(entity.getPhone());
		dto.setBirthDate(entity.getBirthDate());
		dto.setMedicalFolder(medicalFolderConverter.toDTO(entity.getMedicalFolder()));
		
		return dto;
	}

	@Override
	public Patient toEntity(PatientDTO dto) {

		Patient entity = new Patient();
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setAddress(dto.getAddress());
		entity.setPhone(dto.getPhone());
		entity.setBirthDate(dto.getBirthDate());
		entity.setMedicalFolder(medicalFolderConverter.toEntity(dto.getMedicalFolder()));
		
		return entity;
	}
	
	

}
