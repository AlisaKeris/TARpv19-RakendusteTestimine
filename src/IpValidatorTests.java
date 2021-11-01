import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IpValidatorTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ShouldReturnFalse_GivenEmptyStringParameter() {
		IpValidator validator = new IpValidator();
		assertTrue(validator.ValidateIp4Address(""));
	}
	@Test
	void ShouldBe_True_GivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		assertTrue(validator.ValidateIp4Address("1.2.3.1"));
	}
	@Test
	void ShouldReturnFourNumbersGivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected,validator.getNumbers("1.2.3.4"));
	}
	@Test
	void ShouldBe_False_GivenIpstartingwithzero() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIp4Address("0.2.3.4"));
	}
	@Test
	void ShouldBe_False_GivenStringWithThreeNumbersAndDots() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIp4Address("1.2.3."));
	}
	@Test
	void ShouldBe_False_GivenStringWithFourNumbersNotInRange0_255(){
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIp4Address("1.2.3.257"));
		assertFalse(validator.ValidateIp4Address("1.2.300.4"));
		assertFalse(validator.ValidateIp4Address("1.256.3.4"));
		assertFalse(validator.ValidateIp4Address("312.2.3.4"));
	}

}
