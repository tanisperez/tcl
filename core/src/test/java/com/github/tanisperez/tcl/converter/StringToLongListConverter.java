package com.github.tanisperez.tcl.converter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.github.tanisperez.tcl.core.converter.AbstractConverter;
import com.github.tanisperez.tcl.core.number.NumberUtils;
import com.github.tanisperez.tcl.core.string.StringUtils;

class StringToLongListConverter extends AbstractConverter<String, List<Long>> {

	@Override
	protected List<Long> convertAttributes(final String source) {
		if (!StringUtils.isBlank(source)) {
			final List<String> tokens = StringUtils.split(source, ",");
			return tokens.stream()
				.filter(NumberUtils::isNumber)
				.map(Long::valueOf)
				.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

}
