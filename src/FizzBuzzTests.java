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
	
}
