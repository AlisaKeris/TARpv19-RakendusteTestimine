
public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++){
			System.out.println(getNumbers(i));
		}
	}

	public static String getNumbers(int i) {
		if(i == 0) return "0";
		if(i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
		if(i % 3 == 0) return "Fizz";
		if(i % 5 == 0) return "Buzz";
		return String.valueOf(i);
	}
}
