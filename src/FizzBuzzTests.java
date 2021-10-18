import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

public class FizzBuzzTests {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sholdReturnBuzzForOneHundred() {
		assertEquals("Buzz", FizzBuzz.getNumbers(100));
	}
	@Test
	public void check_0is0() {
		assertEquals(FizzBuzz.getNumbers(0), ("0"));
	}
	@Test
	public void check_1is1() {
		assertEquals(FizzBuzz.getNumbers(1), ("1"));
	}
	@Test
	public void check_3isFizz() {
		assertEquals(FizzBuzz.getNumbers(3), ("Fizz"));
	}
	@Test
	public void check_5isBuzz() {
		assertEquals(FizzBuzz.getNumbers(5), ("Buzz"));
	}
	@Test
	public void check_multipleOf3isFizz() {
		assertEquals(FizzBuzz.getNumbers(6), ("Fizz"));
	}
	@Test
	public void checkmultipleOf5IsBuzz() {
		assertEquals(FizzBuzz.getNumbers(10), ("Buzz"));
	}
	@Test
	public void checkmultipleOf5And3IsBuzz() {
		assertEquals(FizzBuzz.getNumbers(15), ("FizzBuzz"));
	}
	
}
