package com.hospital.is.converter;

import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.model.MedicalFolderDTO;

public class MedicalFolderConverter extends GeneralConverter<MedicalFolder, MedicalFolderDTO> {
	
	DiseaseConverter diseaseCoverter = new DiseaseConverter();
	AppointmentConverter appointmentConverter = new AppointmentConverter();

	@Override
	public MedicalFolderDTO toDTO(MedicalFolder entity) {
		MedicalFolderDTO dto = new MedicalFolderDTO();
		dto.setDiseaseMap(diseaseCoverter.toDTOMap(entity.getDiseaseMap()));
		dto.setAppointmentList(appointmentConverter.toDTOMap(entity.getAppointmentMap()));
		return dto;
	}

	@Override
	public MedicalFolder toEntity(MedicalFolderDTO dto) {
		MedicalFolder entity = new MedicalFolder();
		entity.setDiseaseMap(diseaseCoverter.toEntityMap(dto.getDiseaseMap()));
		entity.setAppointmentMap(appointmentConverter.toEntityMap(dto.getAppointmentMap()));
		return entity;
	}

}
