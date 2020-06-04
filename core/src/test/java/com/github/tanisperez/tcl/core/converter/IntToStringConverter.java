package com.github.tanisperez.tcl.core.converter;

final class IntToStringConverter extends AbstractConverter<Integer, String> {

	@Override
	protected String convertAttributes(final Integer source) {
		return String.valueOf(source.intValue());
	}

}
