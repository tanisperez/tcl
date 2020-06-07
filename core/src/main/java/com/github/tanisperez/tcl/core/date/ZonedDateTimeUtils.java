package com.github.tanisperez.tcl.core.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * A {@code ZonedDateTime} utils class using the UTC TimeZone.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.2
 * @since 0.0.2
 */
public final class ZonedDateTimeUtils {

	/** UTC Zone Id */
	private static final ZoneId UTC_ZONE_ID = ZoneId.of("UTC");

	private ZonedDateTimeUtils() {
		// DO nothing.
	}

	/**
	 * Return the current DateTime using the UTC TimeZone.
	 *
	 * @return The current {@code ZonedDateTime} in UTC.
	 */
	public static ZonedDateTime now() {
		return ZonedDateTime.now(UTC_ZONE_ID);
	}

}
