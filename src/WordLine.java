import java.util.ArrayList;

public class WordLine {
	public String data;
	public ArrayList<Integer> numbers;
	public WordLine next;

	public WordLine(String w) {
		data = w;
		next = null;
	}

	public WordLine() {
		data = null;
		next = null;
	}
}
