package com.primaryKeys.util;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class AnkaraConverter implements AttributeConverter<String, String> {


    @Override
    public String convertToDatabaseColumn(String s) {
        return s + "Ankara";
    }

    @Override
    public String convertToEntityAttribute(String s) {
        return s + "deconvertetd";
    }
}
