package com.hospital.is.converter;

import com.hospital.is.entity.Medication;
import com.hospital.is.model.MedicationDTO;

public class MedicationConverter extends GeneralConverter<Medication, MedicationDTO> {

	@Override
	public MedicationDTO toDTO(Medication entity) {
		
		MedicationDTO dto = new MedicationDTO();
		dto.setMedicationName(entity.getMedicationName());
		dto.setQuantity(entity.getQuantity());
		dto.setDurationOfUse(entity.getDurationOfUse());
		dto.setInstrutionOfUse(entity.getInstrutionOfUse());
		
		return dto;
	}

	@Override
	public Medication toEntity(MedicationDTO dto) {
		
		Medication entity = new Medication();
		entity.setMedicationName(dto.getDurationOfUse());
		entity.setQuantity(dto.getQuantity());
		entity.setDurationOfUse(dto.getDurationOfUse());
		entity.setInstrutionOfUse(dto.getInstrutionOfUse());
		
		return entity;
	}
	
	

}
