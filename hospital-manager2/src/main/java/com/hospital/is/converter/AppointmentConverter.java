package com.hospital.is.converter;

import com.hospital.is.entity.Appointment;
import com.hospital.is.model.AppointmentDTO;

public class AppointmentConverter extends GeneralConverter<Appointment, AppointmentDTO> {
	private DoctorConverter  doctorConverter = new  DoctorConverter();
	private PrescriptionConverter prescriptionConverter = new PrescriptionConverter();
	
	@Override
	public AppointmentDTO toDTO(Appointment entity) {
		AppointmentDTO dto = new AppointmentDTO();
		dto.setDateTimeAppointment(entity.getDateTimeAppointment());
		dto.setDoctor(doctorConverter.toDTO(entity.getDoctor()));
//		dto.setPatient(patientConverter.toDTO(entity.getPatient()));
		dto.setTypeAppointment(entity.getTypeAppointment());
		dto.setPrescriptionMap(prescriptionConverter.toDTOMap(entity.getPrescriptionMap()));
		
		
		return dto;
	}

	@Override
	public Appointment toEntity(AppointmentDTO dto) {
		Appointment entity = new Appointment();
		entity.setDateTimeAppointment(dto.getDateTimeAppointment());
		entity.setTypeAppointment(dto.getTypeAppointment());
		entity.setDoctor(doctorConverter.toEntity(dto.getDoctor()));
//		entity.setPatient(patientConverter.toEntity(dto.getPatient()));
		entity.setPrescriptionMap(prescriptionConverter.toEntityMap(dto.getPrescriptionMap()));
		
		return entity;
	}
	
	
	
}
