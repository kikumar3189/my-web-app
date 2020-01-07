package com.kishor.spring.security.entities.util;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

	public Date convertToDatabaseColumn(LocalDate localDate) {
		return null == localDate ? null: Date.valueOf(localDate);
	}

	public LocalDate convertToEntityAttribute(Date date) {
		return null == date ? null : date.toLocalDate(); 
	}

}
