import java.util.function.BooleanSupplier;

public class IpValidator {

	public Boolean ValidateIp4Address(String ipString) {
		if(ipString=="") {
			return false;
		}
		return true;
	}

}
