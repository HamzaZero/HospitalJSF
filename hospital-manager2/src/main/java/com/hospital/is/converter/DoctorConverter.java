package com.hospital.is.converter;

import com.hospital.is.entity.Doctor;
import com.hospital.is.model.DoctorDTO;

public class DoctorConverter extends GeneralConverter<Doctor, DoctorDTO> {

	@Override
	public DoctorDTO toDTO(Doctor entity) {
		
		DoctorDTO dto = new DoctorDTO();
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setAddress(entity.getAddress());
		dto.setPhone(entity.getPhone());
		dto.setBirthDate(entity.getBirthDate());
		dto.setRegistrationNumber(entity.getRegistrationNumber());
		dto.setSpecialite(entity.getSpecialite());
		return dto;
	}

	@Override
	public Doctor toEntity(DoctorDTO dto) {
		Doctor entity = new Doctor();
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setAddress(dto.getAddress());
		entity.setPhone(dto.getPhone());
		entity.setBirthDate(dto.getBirthDate());
		entity.setRegistrationNumber(dto.getRegistrationNumber());
		entity.setSpecialite(dto.getSpecialite());
		return entity;
	}
	
//	public Map<Integer,DoctorDTO> convertToDTOMap(Map<Integer,Doctor> map)
//	{
//		Map<Integer,DoctorDTO> dtoMap = new HashMap<Integer,DoctorDTO>();
//		
//		for(Entry<Integer, Doctor> entry : map.entrySet()) {
//			dtoMap.put(entry.getKey(), convertToDTO(entry.getValue()));
//		}
//		
//		return dtoMap;
//	}
//	
//	public Map<Integer,Doctor> convertToEntityMap(Map<Integer,DoctorDTO> map)
//	{
//		Map<Integer,Doctor> entityMap = new HashMap<Integer,Doctor>();
//		
//		for(Entry<Integer, DoctorDTO> entry : map.entrySet()) {
//			entityMap.put(entry.getKey(), convertToEntity(entry.getValue()));
//		}
//		
//		return entityMap;
//	}

}
