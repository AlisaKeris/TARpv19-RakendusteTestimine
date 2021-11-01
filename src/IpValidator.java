
import java.util.Arrays;

public class IpValidator {

	public Boolean ValidateIp4Address(String ipString) {
		if(hasThreeDots(ipString) && firstNumberInRange1_254(ipString) && 
				hasFourNumbers(ipString)) {
			return true;
		}
		
		return false;
	}

	private boolean hasFourNumbers(String ipString) {
		return getNumbers(ipString).length == 4;
	}

	private boolean firstNumberInRange1_254(String ipString) {
		return getNumbers(ipString)[0]>0 && getNumbers(ipString)[0]<255;
	}

	private boolean hasThreeDots(String ipString) {
		
		return ipString.chars().filter(c->c=='.').count()==3;
	}

	public int[] getNumbers(String string) {
		return Arrays.stream(string.split("\\.")).mapToInt(Integer::parseInt).toArray();
	}

}
