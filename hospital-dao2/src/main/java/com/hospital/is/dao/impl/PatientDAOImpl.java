package com.hospital.is.dao.impl;

import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.PatientDAO;
import com.hospital.is.entity.Patient;

/**
 * @author user001
 *
 */
public class PatientDAOImpl extends DAOImpl<Patient> implements PatientDAO {

	static int i = 3;

	@Override
	public Patient create(Patient patient) {

		getAll().put(i, patient);
		i++;

		return getAll().get(i - 1);
	}

	@Override
	public Map<Integer, Patient> getAll() {

		return StaticDatabase.getPatientMap();

	}

	@Override
	public Patient getById(Integer id) {

		if (getAll().containsKey(id))
			return getAll().get(id);

		return null;

	}

	@Override
	public Patient update(Patient patient, Integer id) {

		if (getAll().containsKey(id))
			return getAll().replace(id, patient);

		return null;

	}

	@Override
	public boolean delete(Integer id) {
		
		if (getById(id) != null)
		{
			getAll().remove(id);
			return true;
		}
			
		else
			return false;

	}

}
