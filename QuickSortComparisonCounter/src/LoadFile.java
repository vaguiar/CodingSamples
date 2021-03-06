import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadFile {

	private String filename;

	LoadFile(String filename) {
		this.filename = filename;
	}

	// Getter method
	public String get_filename() {
		return this.filename;
	}

	public int[] loadFileInArray(String filename) {

		try {
			ArrayList<Integer> input_list = new ArrayList<Integer>();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;

			while ((line = br.readLine()) != null) {
				input_list.add(Integer.parseInt(line));
			}
			br.close();

			int[] input = new int[input_list.size()];
			int i = 0;
			for (Integer it : input_list) {
				input[i] = it;
				i++;
			}

			return input;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Incase of exception return empty array 
		// http://stackoverflow.com/questions/1274792/is-returning-null-bad-design
		return new int[]{};
	}
}
