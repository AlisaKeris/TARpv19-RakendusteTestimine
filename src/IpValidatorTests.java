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
	void ShouldReturnFalse_GivebEmptyStringParameter() {
		IpValidator validator = new IpValidator();
		assertTrue(validator.ValidateIp4Address(""));
	}

}
