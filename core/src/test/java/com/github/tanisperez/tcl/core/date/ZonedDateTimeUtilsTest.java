package com.github.tanisperez.tcl.core.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@code ZonedDateTimeUtils}
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.2
 * @since 0.0.2
 */
public class ZonedDateTimeUtilsTest {

	@Test
	@DisplayName("now()")
	public void testNow() {
		final ZoneId utcZoneId = ZoneId.of("UTC");

		final ZonedDateTime now = ZonedDateTimeUtils.now();
		final ZonedDateTime expectedNow = ZonedDateTime.now(utcZoneId);

		final long secondsDiff = ChronoUnit.SECONDS.between(expectedNow, now);
		Assertions.assertTrue(secondsDiff < 3); // 3 seconds to have some margin in old PCs
	}

}
