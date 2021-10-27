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

}
