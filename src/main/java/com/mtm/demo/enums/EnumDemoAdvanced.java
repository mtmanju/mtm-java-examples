package com.mtm.demo.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.StringUtils;

public enum EnumDemoAdvanced {
	REST("Rest"), SOAP("Soap"), ALL("All");

	private final String value;

	EnumDemoAdvanced(String value) {
		this.value = value;
	}

	@JsonValue
	public String toJson() {
		return value;
	}

	@JsonCreator
	public static EnumDemoAdvanced fromValue(String value) {
		return getEnumFromString(EnumDemoAdvanced.class, value);
	}

	@SuppressWarnings("unchecked")
	public static <T extends Enum<T>> T getEnumFromString(Class<T> enumClass, String value) {
		if (null == enumClass) {
			throw new IllegalArgumentException("EnumClass value can't be null.");
		}

		for (Enum<?> enumValue : enumClass.getEnumConstants()) {
			if (enumValue.toString().equalsIgnoreCase(value)) {
				return (T) enumValue;
			}
		}

		StringBuilder errorMessage = new StringBuilder();
		boolean bFirstTime = true;
		for (Enum<?> enumValue : enumClass.getEnumConstants()) {
			errorMessage.append(bFirstTime ? StringUtils.EMPTY : ", ").append(enumValue);
			bFirstTime = false;
		}
		throw new IllegalArgumentException(value + " is invalid value. Supported values are " + errorMessage);
	}

}