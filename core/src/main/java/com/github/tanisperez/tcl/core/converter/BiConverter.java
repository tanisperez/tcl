package com.github.tanisperez.tcl.core.converter;

import java.util.List;

public interface BiConverter<L, R> {

	L toLeft(final R right);

	List<L> toLeft(final List<R> rights);

	R toRight(final L left);

	List<R> toRight(final List<L> lefts);

}
