import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainRunner {

	public static void main(String[] args) {

		System.out.println("Menu:");
		System.out.println("Test 1");
		System.out.println("Test 2: with TestFile.txt");
		System.out.println("Test 3: with IntegerArray.txt");
		System.out.print("Enter test number: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				runTestCase1("Hardcoded Array");
				break;
			case 2:
				runTestCase2("data/TestFile.txt");
				break;
			case 3:
				runTestCase3("data/QuickSort.txt");
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: Invalid or no Input");
			MainRunner.main(null);
		}
	}

	public static void runTestCase1(String ignore) {
		
		int [] input = new int[] { 1, 2, 3, 4, 5, 6 };
		calculateComparisons(input);
	}
	
	public static void runTestCase2(String filepath){
		
		LoadFile lf = new LoadFile(filepath);
		int [] input = lf.loadFileInArray(lf.get_filename());
//		calculateInversionCounts(input);
	}
	
	public static void runTestCase3(String filepath){
		
		LoadFile lf = new LoadFile(filepath);
		int [] input = lf.loadFileInArray(lf.get_filename());
//		calculateInversionCounts(input);
	}
	
	public static void calculateComparisons(int [] input){
		
		QuickSortComparisons qc = new QuickSortComparisons();
		qc.sortAndCalculateComparisons(input, 2);
		System.out.println("# comparisons: " + qc.getComparison_count());
		System.out.print("Sorted Array: [ " );
		printArray(input);
	}
	
	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "\t");
		}
		System.out.println("]");
	}
}
