import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileMenuHandler implements ActionListener {
	JFrame jframe;

	public FileMenuHandler(JFrame jf) {
		jframe = jf;
	}

	sortFile sort = new sortFile();
	String line;
	String chosenFile;
	JTextArea myTextArea = new JTextArea();
	JScrollPane scroll = new JScrollPane(myTextArea);
	JTextArea myfileArea = new JTextArea();
	JScrollPane scroll1 = new JScrollPane(myfileArea);
	// creates textArea

	ArrayList<String> original = new ArrayList<>();

	TreeMap<String, ArrayList<Integer>> mapA = new TreeMap<>();
	TreeMap<String, ArrayList<Integer>> mapE = new TreeMap<>();
	TreeMap<String, ArrayList<Integer>> mapI = new TreeMap<>();
	TreeMap<String, ArrayList<Integer>> mapO = new TreeMap<>();
	TreeMap<String, ArrayList<Integer>> mapU = new TreeMap<>();
	// TreeMap for each vowel to put word and lineNumber into map

	ArrayList<Integer> list = new ArrayList<>();

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Open")) {
			openFile();
			myfileArea.setText("");
			StringBuilder sb = new StringBuilder();
			for (String str : original) {
				sb.append(str);
			}
			myfileArea.append(sb.toString());
		} // reads in file

		else if (menuName.equals("Quit")) {
			System.exit(0);
		} else if (menuName.equals("A")) {

			Set<?> set = mapA.entrySet();
			Iterator<?> iterator = set.iterator();
			Map.Entry<String, ArrayList<Integer>> me;
			String myText = "";
			while (iterator.hasNext()) {
				me = (Entry<String, ArrayList<Integer>>) iterator.next();
				myText += me.getKey() + ": " + me.getValue() + "\n";
			}
			// uses iterator to read through map and prints contents to textArea beginning
			// with A || a

			myTextArea.setText(myText);

		} else if (menuName.equals("E")) {
			Set<?> set = mapE.entrySet();
			Iterator<?> iterator = set.iterator();
			Map.Entry<String, ArrayList<Integer>> me;
			String myText = "";
			while (iterator.hasNext()) {
				me = (Entry<String, ArrayList<Integer>>) iterator.next();
				myText += me.getKey() + ": " + me.getValue() + "\n";
			} // uses iterator to read through map and prints contents to textArea beginning
				// with E || e

			myTextArea.setText(myText);

		} else if (menuName.equals("I")) {
			Set<?> set = mapI.entrySet();
			Iterator<?> iterator = set.iterator();
			Map.Entry<String, ArrayList<Integer>> me;
			String myText = "";
			while (iterator.hasNext()) {
				me = (Entry<String, ArrayList<Integer>>) iterator.next();
				myText += me.getKey() + ": " + me.getValue() + "\n";
			} // uses iterator to read through map and prints contents to textArea beginning
				// with I || i

			myTextArea.setText(myText);

		} else if (menuName.equals("O")) {
			Set<?> set = mapO.entrySet();
			Iterator<?> iterator = set.iterator();
			Map.Entry<String, ArrayList<Integer>> me;
			String myText = "";
			while (iterator.hasNext()) {
				me = (Entry<String, ArrayList<Integer>>) iterator.next();
				myText += me.getKey() + ": " + me.getValue() + "\n";
			} // uses iterator to read through map and prints contents to textArea beginning
				// with O || o

			myTextArea.setText(myText);

		} else if (menuName.equals("U")) {
			Set<?> set = mapU.entrySet();
			Iterator<?> iterator = set.iterator();
			Map.Entry<String, ArrayList<Integer>> me;
			String myText = "";
			while (iterator.hasNext()) {
				me = (Entry<String, ArrayList<Integer>>) iterator.next();
				myText += me.getKey() + ": " + me.getValue() + "\n";
			} // uses iterator to read through map and prints contents to textArea beginning
				// with U || u

			myTextArea.setText(myText);
		}
		// prints to text area based on users input choice from menu bar
	}

	public void openFile() {
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		readSource(chooser.getSelectedFile().getAbsolutePath()); // helps chooses file
	}

	@SuppressWarnings("unchecked")
	public void readSource(String chosenFile) {
		TextFileInput inFile = new TextFileInput(chosenFile);
		Container myContentPane = jframe.getContentPane();
		myContentPane.add(scroll1);
		myContentPane.add(scroll);

		line = inFile.readLine();
		int i = 0;
		while (line != null) {
			i++;
			try {
				original.add(i + " " + line + "\n");
				StringTokenizer tokens = new StringTokenizer(line, ",. (): \'’”‘“\"");
				while (tokens.hasMoreTokens()) {
					String s = tokens.nextToken();
					if (s.charAt(0) == 'a' || s.charAt(0) == 'A') {
						// if the word is already in the TreeMap
						if (mapA.containsKey(s)) {
							mapA.get(s).add(i);
						}
						// adding the word to the TreeMap
						else {
							list = new ArrayList<Integer>();
							list.add(i);
							mapA.put(s, list);
						}

					} else if (s.charAt(0) == 'e' || s.charAt(0) == 'E') {
						// if the word is already in the TreeMap
						if (mapE.containsKey(s)) {
							mapE.get(s).add(i);
						}
						// adding the word to the TreeMap
						else {
							list = new ArrayList<Integer>();
							list.add(i);
							mapE.put(s, list);
						}

					} else if (s.charAt(0) == 'i' || s.charAt(0) == 'I') {
						// if the word is already in the TreeMap
						if (mapI.containsKey(s)) {
							mapI.get(s).add(i);
						}
						// adding the word to the TreeMap
						else {
							list = new ArrayList<Integer>();
							list.add(i);
							mapI.put(s, list);
						}
					} else if (s.charAt(0) == 'o' || s.charAt(0) == 'O') {
						// if the word is already in the TreeMap
						if (mapO.containsKey(s)) {
							mapO.get(s).add(i);
						}
						// adding the word to the TreeMap
						else {
							list = new ArrayList<Integer>();
							list.add(i);
							mapO.put(s, list);
						}
					} else if (s.charAt(0) == 'u' || s.charAt(0) == 'U') {
						// if the word is already in the TreeMap
						if (mapU.containsKey(s)) {
							mapU.get(s).add(i);
						}
						// adding the word to the TreeMap
						else {
							list = new ArrayList<Integer>();
							list.add(i);
							mapU.put(s, list);
						}
					}
				}

				line = inFile.readLine();

			}

			catch (InvalidWordLineException e) {
				JOptionPane.showMessageDialog(null, "invalid line number");
			}

		}

		jframe.setVisible(true);
		jframe.pack();

		// ITERATOR
		Set<?> set = mapA.entrySet();
		Iterator<?> iterator = set.iterator();
		Map.Entry<String, ArrayList<Integer>> me;
		while (iterator.hasNext()) {
			me = (Entry<String, ArrayList<Integer>>) iterator.next();
		}

	}
}
