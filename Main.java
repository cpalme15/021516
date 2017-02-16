import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		/*
		 * horizontal and vertical scroll bars
		 * JScrollPane
		 * boxlayout 
		 * annoymous inner class
		 */
		DemoFrame df=new DemoFrame();
		df.setSize(500,300);
		df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		df.setResizable(false);
		df.setVisible(true);

	}

}
