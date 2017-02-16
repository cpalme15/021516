import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class DemoFrame extends JFrame implements Weekdays
{	private JTextArea ta1=null,ta2=null;
	private JButton btnCopy=null;
	
	public DemoFrame()
	{
		super("Title");
		ta1=new JTextArea(10,15);
		ta2=new JTextArea(10,15);
		ta1.setText("Hello\nEMU\nStudents");
		ta2.setEditable(false);
		ta1.setLineWrap(true);
		ta2.setLineWrap(true);
		ta1.setWrapStyleWord(true);
		ta2.setWrapStyleWord(true);
		ta1.setBackground(Color.green);
		btnCopy=new JButton("Copy >>>");
		Box b=Box.createHorizontalBox();
		b.add(new JScrollPane(ta1));
		b.add(btnCopy);
		b.add(new JScrollPane(ta2));
		this.add(b);
		/*three ways btn.addactionlister(this)
		 * btn.addactionlistner(x)
		 * btn.addactionlister(new Actionlisterner(
		 * {public actionlistener(e){}}); use when only a
		 * button with one function to avoid implementing
		 * and making an inner class. annoymous inner class
		 * 
		 */
		btnCopy.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
		{
			
			ta2.setText(ta1.getSelectedText());
			System.out.println(WEDNESDAY+" is done");
		}
		}
		);
		
	}
}
