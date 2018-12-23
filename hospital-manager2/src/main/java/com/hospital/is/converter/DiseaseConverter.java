package com.hospital.is.converter;

import com.hospital.is.entity.Disease;
import com.hospital.is.model.DiseaseDTO;

public class DiseaseConverter extends GeneralConverter<Disease, DiseaseDTO>{

	@Override
	public DiseaseDTO toDTO(Disease entity) {
		DiseaseDTO dto = new DiseaseDTO();
		dto.setNature(entity.getNature());
		dto.setDescription(entity.getDescription());
		dto.setState(entity.getState());
		dto.setDiagDate(entity.getDiagDate());
		
		return dto;
	}

	@Override
	public Disease toEntity(DiseaseDTO dto) {
		Disease entity = new Disease();
		entity.setNature(dto.getNature());
		entity.setDescription(dto.getDescription());
		entity.setState(dto.getState());
		entity.setDiagDate(dto.getDiagDate());
		
		return entity;
	}
	

}
