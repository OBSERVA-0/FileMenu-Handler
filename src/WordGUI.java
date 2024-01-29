
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class WordGUI extends JFrame {
	public void initialize() {
		setSize(400, 400);
		setLocation(50, 50);
		setLayout(new GridLayout(1, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		JMenu menufile = new JMenu("File");
		JMenu menulist = new JMenu("List");
		FileMenuHandler fmh = new FileMenuHandler(this);
		menubar.add(menufile);
		menubar.add(menulist);

		JMenuItem itemopen = new JMenuItem("Open");
		JSeparator sep1 = new JSeparator();
		JMenuItem itemquit = new JMenuItem("Quit");
		menufile.add(itemopen);
		menufile.add(sep1);
		menufile.add(itemquit);
		itemopen.addActionListener(fmh);
		itemquit.addActionListener(fmh);

		JMenuItem ListA = new JMenuItem("A");
		ListA.addActionListener(fmh);

		JSeparator sep2 = new JSeparator();

		JMenuItem ListE = new JMenuItem("E");
		ListE.addActionListener(fmh);

		JSeparator sep3 = new JSeparator();
		JMenuItem ListI = new JMenuItem("I");
		ListI.addActionListener(fmh);

		JSeparator sep4 = new JSeparator();
		JMenuItem ListO = new JMenuItem("O");
		ListO.addActionListener(fmh);

		JSeparator sep5 = new JSeparator();
		JMenuItem ListU = new JMenuItem("U");
		ListU.addActionListener(fmh);

		menulist.add(ListA);
		menulist.add(sep2);
		menulist.add(ListE);
		menulist.add(sep3);
		menulist.add(ListI);
		menulist.add(sep4);
		menulist.add(ListO);
		menulist.add(sep5);
		menulist.add(ListU);

		setVisible(true);
	}
	// created menubar with MenuList items and ActionListener

}
