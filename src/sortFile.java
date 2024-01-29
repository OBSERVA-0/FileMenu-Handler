public class sortFile extends WordLine {
	public WordLine first = new WordLine();
	public WordLine last = new WordLine();
	public int length = 0;

	public void append(String a) {
		WordLine newNode = new WordLine(a);
		if (first.data == null) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		length++;
		// creates object from class WordListNode and and append method to add text to
		// it.
	}

	public void sortList() {
		WordLine current = first, index = null;
		String previous;
		if (first == null)
			return;
		else {
			while (current != null) {
				index = current.next;
				while (index != null) {
					if (current.data.compareToIgnoreCase(index.data) > 0) { // sorts files in text by comparing first
						// result to next result and
						// checking for values and comaprisons as to which is higher and performs switch
						// statement accordingly
						previous = current.data;
						current.data = index.data;
						index.data = previous;
					}
					index = index.next;
				}
				current = current.next;
			}
		}

	}

	public WordLine getfirst() {
		return first; // gets first
	}
}
