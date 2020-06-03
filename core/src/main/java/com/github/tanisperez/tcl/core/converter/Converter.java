package com.github.tanisperez.tcl.core.converter;

import java.util.List;

public interface Converter<S, T> {

	T convert(final S source);

	List<T> convert(final List<S> sources);

}
