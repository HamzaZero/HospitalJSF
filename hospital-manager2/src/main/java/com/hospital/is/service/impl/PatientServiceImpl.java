package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.converter.PatientConverter;
import com.hospital.is.dao.impl.PatientDAOImpl;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;

/**
 * @author user001
 *
 */
public class PatientServiceImpl extends ServiceImpl<PatientDTO> implements PatientService {

	private PatientConverter patientConverter = new PatientConverter();

	private PatientDAOImpl patientDAOImpl = new PatientDAOImpl();

	@Override
	public PatientDTO create(PatientDTO patient) {

		Patient p = patientDAOImpl.create(patientConverter.toEntity(patient));

		PatientDTO patientDTO = patientConverter.toDTO(p);

		return patientDTO;
	}

	@Override
	public Map<Integer, PatientDTO> getAll() {

		Map<Integer, Patient> map = patientDAOImpl.getAll();

		Map<Integer, PatientDTO> result = new HashMap<>();

		result.putAll(patientConverter.toDTOMap(map));

		return result;
	}

	@Override
	public PatientDTO getById(Integer id) {

		Patient patient = patientDAOImpl.getById(id);

		PatientDTO patientDTO = patientConverter.toDTO(patient);

		return patientDTO;
	}

	@Override
	public PatientDTO update(PatientDTO patient, Integer id) {

		Patient p = patientDAOImpl.update(patientConverter.toEntity(patient), id);

		PatientDTO patientDTO = patientConverter.toDTO(p);

		return patientDTO;
	}

	@Override
	public boolean delete(Integer id) {

		if (patientDAOImpl.delete(id))
			return true;
		else 
			return false;
		
	}

}
