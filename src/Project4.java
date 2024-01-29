import javax.swing.JFrame;

public class Project4 extends FileMenuHandler {
	public Project4(JFrame jf) {
		super(jf);
	}

	public static void main(String[] args) {
		WordGUI gui = new WordGUI();
		gui.initialize();
		gui.setTitle("MenuBar-Project 4");
	}
}
