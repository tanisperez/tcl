package com.github.tanisperez.tcl.core.converter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.github.tanisperez.tcl.core.collection.CollectionUtils;

public abstract class AbstractBiConverter<L, R> implements BiConverter<L, R> {

	@Override
	public L toLeft(final R right) {
		if (right != null) {
			return convertRightAttributes(right);
		}
		return null;
	}

	@Override
	public List<L> toLeft(final List<R> rights) {
		if (!CollectionUtils.isEmpty(rights)) {
			return rights.stream()
				.map(right -> convertRightAttributes(right))
				.filter(left -> left != null)
				.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	@Override
	public R toRight(final L left) {
		if (left != null) {
			return convertLeftAttributes(left);
		}
		return null;
	}

	@Override
	public List<R> toRight(final List<L> lefts) {
		if (!CollectionUtils.isEmpty(lefts)) {
			return lefts.stream()
				.map(left -> convertLeftAttributes(left))
				.filter(right -> right != null)
				.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	protected abstract L convertRightAttributes(final R right);

	protected abstract R convertLeftAttributes(final L left);

}
