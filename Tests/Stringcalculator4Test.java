package tddforassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Stringcalculator4Test {

	@Test
	
	public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
		Stringcalculator4.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public final void whenNonNumberIsUsedThenExceptionIsThrown() {
		Stringcalculator4.add("1,X");
	}
	
	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, Stringcalculator4.add(""));
	}
	
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(55, Stringcalculator4.add("55"));
	}

	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(8+9, Stringcalculator4.add("8,9"));
	}
	
	@Test
	public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
		Assert.assertEquals(37+76+15+18+46+88, Stringcalculator4.add("37,76,15,18,46,88"));
	}

}
