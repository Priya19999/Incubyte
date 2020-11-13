package tddforassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Stringcalculator2Test {

	@Test
	public final void whenEmptyStringIsUsedThenReturnValue0() {
		Assert.assertEquals(0,Stringcalcalculator.add(""));
	}

}
