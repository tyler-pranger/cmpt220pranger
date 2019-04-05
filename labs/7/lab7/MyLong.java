package lab7;

public class MyLong {
	
	private long value;
	
	MyLong(long value) {
		this.value = value;
	}
	
	long getValue() {
		return value;
	}
	
	boolean isEven() {
		return value % 2 == 0;
	}
	
	boolean isOdd(){
		return value%2 != 0;
	}
	boolean isPrime() {
		for (int k = 2; k < value; k++) {
			if(value%k==0) {
				return false;
			}
			return true;
			}
		return true;
		}
	
	static boolean isEven(MyLong value) {
		return value.value % 2 == 0;
		
	}
	boolean equals(long value) {
		return this.value==value;
	}
	}

