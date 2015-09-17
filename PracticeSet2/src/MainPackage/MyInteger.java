//Michael Shand

package MainPackage;

public class MyInteger {

	public static void main(String[] args) {

	}

	// int data field
	private int value;

	// MyInteger constructor
	// creates int value
	public MyInteger(int value) {
		this.value = value;

	}

	// isEven, isOdd, isPrime methods
	// even
	public boolean isEven() {
		if ((this.value % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	// odd
	public boolean isOdd() {
		if (isEven() == true) {
			return false;
		} else {
			return true;
		}
	}

	// prime
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if ((value % i) == 0) {
				return false;
			}
		}
		return true;
	}

	// isEven(int), isOdd(int), isPrime(int) methods
	// even
	public static boolean isEven(int number) {
		if ((number % 2) == 0) {
			return true;
		} else
			return false;
	}

	// odd
	public static boolean isOdd(int number) {
		if (isEven(number) == false) {
			return true;
		} else
			return false;
	}

	// prime
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	// isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger) methods
	// even
	public static boolean isEven(MyInteger number) {
		if ((number.value % 2) == 0) {
			return true;
		} else
			return false;
	}

	// odd
	public static boolean isOdd(MyInteger number) {
		if ((number.value % 2) == 0) {
			return false;
		} else
			return true;
	}

	// prime
	public static boolean isPrime(MyInteger number) {
		for (int i = 2; i < number.value; i++) {
			if (number.value % i == 0)
				return false;
		}
		return true;
	}

	// equals methods
	// equal(int)
	public boolean equal(int number) {
		if (value == number) {
			return true;
		} else
			return false;
	}

	// equal(MyInteger)
	public boolean equal(MyInteger number) {
		if (value == number.value) {
			return true;
		} else
			return false;
	}

	// parshInt method
	// char -> integers
	public static int parseInt(char[] numbers) {
		String numberString = new String(numbers);
		int charToNumber = Integer.parseInt(numberString);
		return charToNumber;
	}

	// string -> integers
	public static int parseInt(String numbers) {
		int stringNumber = Integer.parseInt(numbers.toString());
		return stringNumber;
	}

	// getters and setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}