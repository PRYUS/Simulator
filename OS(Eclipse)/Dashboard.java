import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Dashboard {

	JFrame frame;

	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dashboard() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.getContentPane().setForeground(new Color(205, 92, 92));
		frame.getContentPane().setFont(new Font("Arial Black", Font.ITALIC, 11));
		frame.setBounds(200, 100, 800, 500);
		frame.getContentPane().setLayout(null);
		
		JButton btnStop = new JButton("PageFault_Algos");
		btnStop.setIcon(new ImageIcon("C:\\Users\\Prathyush\\Desktop\\page1.png"));
		btnStop.setBounds(33, 251, 244, 193);
		btnStop.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnStop.setForeground(Color.BLACK);
		btnStop.setBackground(new Color(255, 0, 0));
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageGUI OBJ2=new PageGUI();
				OBJ2.main();
			}
		});
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(655, 0, 122, 33);
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entry o=new Entry();
				String args[]=new String[2];
				o.main(args);
			}
		});
		btnExit.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(btnExit);
		
		
		
		JButton btnClick = new JButton("Scheduling Algorithms");
		btnClick.setIcon(new ImageIcon("C:\\Users\\Prathyush\\Desktop\\scheduling.jpg"));
		btnClick.setBounds(371, 251, 232, 193);
		btnClick.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnClick.setForeground(Color.BLACK);
		btnClick.setBackground(new Color(255, 0, 0));
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SchedulingGUI OBJ1=new SchedulingGUI();
				OBJ1.main();				
			}
		});
		frame.getContentPane().add(btnClick);
		
		JButton btnDiskScheduling = new JButton("Disk Scheduling");
		btnDiskScheduling.setIcon(new ImageIcon("C:\\Users\\Prathyush\\Desktop\\disk.jpg"));
		btnDiskScheduling.setBounds(33, 28, 244, 190);
		btnDiskScheduling.setForeground(new Color(0, 0, 0));
		btnDiskScheduling.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnDiskScheduling.setBackground(new Color(255, 0, 0));
		btnDiskScheduling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiskSched_GUI OBJ4=new DiskSched_GUI();
				OBJ4.main();
			}
		});
		frame.getContentPane().add(btnDiskScheduling);
		

		
		JButton btnNewButton = new JButton("Dining Philopher");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Prathyush\\Desktop\\dining1.jpg"));
		
		btnNewButton.setBounds(371, 28, 232, 190);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DP_GUI OBJ3=new DP_GUI("Dining Philosopher");
				OBJ3.main();
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnStop);
		
		TextField textField = new TextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setEditable(false);
		textField.setFont(new Font("Arial Black", Font.BOLD, 19));
		textField.setText("    Dining Philosopher's");
		textField.setBounds(371, 0, 232, 27);
		frame.getContentPane().add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBackground(Color.BLACK);
		textField_1.setEditable(false);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Dialog", Font.BOLD, 19));
		textField_1.setText("       Disk Scheduling");
		textField_1.setBounds(33, 0, 244, 27);
		frame.getContentPane().add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setBackground(Color.BLACK);
		textField_2.setFont(new Font("Dialog", Font.BOLD, 19));
		textField_2.setText("              Page Fault ");
		textField_2.setBounds(33, 224, 244, 27);
		frame.getContentPane().add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBackground(Color.BLACK);
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Dialog", Font.BOLD, 19));
		textField_3.setEditable(false);
		textField_3.setText(" Scheduling Algorithms");
		textField_3.setBounds(371, 224, 232, 27);
		frame.getContentPane().add(textField_3);
		
		
	}
}
