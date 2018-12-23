package com.hospital.is.converter;

import com.hospital.is.entity.Prescription;
import com.hospital.is.model.PrescriptionDTO;

public class PrescriptionConverter extends GeneralConverter<Prescription, PrescriptionDTO> {
	
	MedicationConverter medicationConverter = new MedicationConverter();

	@Override
	public PrescriptionDTO toDTO(Prescription entity) {
		
		PrescriptionDTO dto = new PrescriptionDTO();
		dto.setMedicationMap(medicationConverter.toDTOMap(entity.getMedicationMap()));
		dto.setDescriptionOfUse(entity.getDescriptionOfUse());
		
		return dto;
	}

	@Override
	public Prescription toEntity(PrescriptionDTO dto) {

		Prescription entity = new Prescription();
		entity.setMedicationMap(medicationConverter.toEntityMap(dto.getMedicationMap()));
		entity.setDescriptionOfUse(dto.getDescriptionOfUse());
		
		return entity;
	}

}
