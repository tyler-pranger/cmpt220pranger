
public class Lab4Part6 {

	private static double[] myLists;
	static double[] myList = {1.0, 2.3, 4.6, 6.0, 2.0, 8.4, 7.7, 9.0, 12.0, 34.5};

	public static void main(String[] args) {
		System.out.println(myList);
	}

	public static double[] getMyLists() {
		for (int i = 0; i < myList.length; i++) {
			myList[i] = i;
		}

		return myLists;
	}

	public static void setMyLists(double[] myLists) {
		myList[0] = 1.0;
		myList[1] = 2.3;
		myList[2] = 4.6;
		myList[3] = 6.0;
		myList[4] = 2.0;
		myList[5] = 8.4;
		myList[6] = 7.7;
		myList[7] = 9.0;
		myList[8] = 12.0;
		myList[9] = 34.5;
		Lab4Part6.myLists = myLists;
	}

}
