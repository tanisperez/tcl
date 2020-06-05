package com.github.tanisperez.tcl.core.converter;

final class IntToStringBiConverter extends AbstractBiConverter<Integer, String> {

	@Override
	protected Integer convertRightAttributes(final String right) {
		return Integer.valueOf(right);
	}

	@Override
	protected String convertLeftAttributes(final Integer left) {
		return String.valueOf(left);
	}

}
