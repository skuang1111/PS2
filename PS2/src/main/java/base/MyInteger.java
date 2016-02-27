package base;

class MyInteger {
	int iValue;
	
	// Constructor
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	// Get Method
	public int getIValue() {
		return iValue;
	}
	
	// Method 1
	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int n) {
		if (n % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	// Method 2
	public boolean isEven() {
		return isEven(iValue);
	}
	
	public boolean isOdd() {
		return isOdd(iValue);
	}
	
	public boolean isPrime() {
		return isPrime(iValue);
	}
	
	// Method 3
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	// Method 4
	public boolean equals(int n) {
		return (iValue == n);
	}
	
	public boolean equals(MyInteger myInt) {
		return equals(myInt.getIValue());
	}
}
