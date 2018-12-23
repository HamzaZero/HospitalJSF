package com.hospital.is.converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class GeneralConverter<Entity, DTO> {
	
	public abstract DTO toDTO(Entity entity);
	public abstract Entity toEntity(DTO dto);
	
	
	public Map<Integer,DTO> toDTOMap(Map<Integer,Entity> map){
		Map<Integer,DTO> dtoMap = new HashMap<Integer,DTO>();
		
		for(Entry<Integer, Entity> entry : map.entrySet()) {
			dtoMap.put(entry.getKey(), toDTO(entry.getValue()));
		}
		
		return dtoMap;
	}
	
	public Map<Integer,Entity> toEntityMap(Map<Integer,DTO> map){
		
		Map<Integer,Entity> entityMap = new HashMap<Integer,Entity>();
		
		for(Entry<Integer, DTO> entry : map.entrySet()) {
			entityMap.put(entry.getKey(), toEntity(entry.getValue()));
		}
		
		return entityMap;
	}

}
