public class PracticeProblem {

	public static void main(String args[]) {
		String[] unsorted = {"a", "b", "D", "c", "help", "me", "you", "fool"};
		bubbleSortString(unsorted);
	}
	public static void bubbleSortString(String[] strings) {
		boolean swapped = false;
		for (int i = 0;i<strings.length-1;i++) {
			for (int j = 1;j<strings.length-i;j++) {
				if ((strings[j].toLowerCase()).compareTo((strings[j-1].toLowerCase())) < 0) {
					String temp = strings[j];
					strings[j]=strings[j-1];
					strings[j-1]=temp;
					swapped = true;
				}

			}
			if (!swapped) {
				break;
			}
		}
		System.out.println(strings);
	}

}
