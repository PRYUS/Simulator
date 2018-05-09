import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class DiskSched_GUI {

	private JFrame frmDiskScheduling;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/** Launching */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiskSched_GUI window = new DiskSched_GUI();
					window.frmDiskScheduling.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public DiskSched_GUI() {
		initialize();
	}

	
	private void initialize() {
		frmDiskScheduling = new JFrame();
		frmDiskScheduling.setForeground(new Color(255, 0, 51));
		frmDiskScheduling.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Prathyush\\Desktop\\disk.jpg"));
		frmDiskScheduling.setTitle("Disk Scheduling");
		frmDiskScheduling.getContentPane().setBackground(new Color(51, 153, 255));
		frmDiskScheduling.setBounds(100, 100, 504, 385);
		frmDiskScheduling.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(123, 25, 340, 20);
		textField.setBackground(Color.WHITE);
		frmDiskScheduling.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 58, 46, 20);
		textField_1.setBackground(Color.WHITE);
		frmDiskScheduling.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblINPUT = new JLabel("Disk Locations");
		lblINPUT.setBounds(29, 28, 58, 14);
		lblINPUT.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblINPUT.setForeground(Color.BLACK);
		frmDiskScheduling.getContentPane().add(lblINPUT);
		
		JLabel lblHEAD = new JLabel("HEAD");
		lblHEAD.setBounds(29, 59, 66, 14);
		lblHEAD.setForeground(Color.BLACK);
		lblHEAD.setBackground(new Color(128, 128, 0));
		lblHEAD.setFont(new Font("Arial Black", Font.BOLD, 14));
		frmDiskScheduling.getContentPane().add(lblHEAD);
		
		JButton btnFIFO = new JButton("FIFO");
		btnFIFO.setBounds(24, 185, 89, 42);
		btnFIFO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random ra=new Random();
				String x="";
				int n=ra.nextInt(10)+5;
				int A[]=new int[n];
				for(int i=0;i<n;i++) 
				{	A[i]=ra.nextInt(200);
					x=x+" "+A[i];
				}
				int head=ra.nextInt(200);
				DFCFS OBJ1=new DFCFS();
				int ans=OBJ1.main(A, n, head);
				textField.setText(x);
				textField_1.setText(head+"");
				textField_2.setText(ans+"");
				Graph OBJ11=new Graph(A,n);
				OBJ11.test(A,n);

			}
		});
		btnFIFO.setBackground(new Color(95, 158, 160));
		frmDiskScheduling.getContentPane().add(btnFIFO);
		
		JButton btnSSTF = new JButton("SSTF");
		btnSSTF.setBounds(196, 185, 89, 42);
		btnSSTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random ra=new Random();
				String x="";
				int n=ra.nextInt(10)+5;
				int A[]=new int[n];
				for(int i=0;i<n;i++) 
				{	A[i]=ra.nextInt(200);
					x=x+" "+A[i];
				}
				int head=ra.nextInt(200);
				SSTF OBJ2= new SSTF();
				int ans=OBJ2.main(A, n, head);
				textField.setText(x);
				textField_1.setText(head+"");
				textField_2.setText(ans+"");
				Graph OBJ22=new Graph(A,n);
				OBJ22.test(A,n);
			}
		});
		btnSSTF.setBackground(new Color(95, 158, 160));
		frmDiskScheduling.getContentPane().add(btnSSTF);
		
		JButton btnSCAN = new JButton("SCAN");
		btnSCAN.setBounds(102, 214, 89, 42);
		btnSCAN.setBackground(new Color(95, 158, 160));
		btnSCAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random ra=new Random();
				String x="";
				int n=ra.nextInt(10)+5;
				int A[]=new int[n];
				for(int i=0;i<n;i++) 
				{	A[i]=ra.nextInt(200);
					x=x+" "+A[i];
				}
				int head=ra.nextInt(200);
				SCAN OBJ3 = new SCAN();
				int ans=OBJ3.main(A,n,head);
				textField.setText(x);
				textField_1.setText(head+"");
				textField_2.setText(ans+"");
				Graph OBJ33=new Graph(A,n);
				OBJ33.test(A,n);
			}
		});
		frmDiskScheduling.getContentPane().add(btnSCAN);
		
		JButton btnCSCAN = new JButton("CSCAN");
		btnCSCAN.setBounds(285, 214, 89, 42);
		btnCSCAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random ra=new Random();
				String x="";
				int n=ra.nextInt(10)+5;
				int A[]=new int[n];
				for(int i=0;i<n;i++) 
				{	A[i]=ra.nextInt(200);
					x=x+" "+A[i];
				}
				int head=ra.nextInt(200);
				CSCAN OBJ4 = new CSCAN();
				int ans=OBJ4.main(A,n,head);
				textField.setText(x);
				textField_1.setText(head+"");
				textField_2.setText(ans+"");
				Graph OBJ44=new Graph(A,n);
				OBJ44.test(A,n);
			}
		});
		btnCSCAN.setBackground(new Color(95, 158, 160));
		frmDiskScheduling.getContentPane().add(btnCSCAN);
		
		JButton btnCLOOK = new JButton("CLOOK");
		btnCLOOK.setBounds(374, 185, 89, 42);
		btnCLOOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random ra=new Random();
				String x="";
				int n=ra.nextInt(10)+5;
				int A[]=new int[n];
				for(int i=0;i<n;i++) 
				{	A[i]=ra.nextInt(200);
					x=x+" "+A[i];
				}
				int head=ra.nextInt(200);
				CLOOK OBJ55 = new CLOOK();
				int ans=OBJ55.main(A,n,head);
				
				textField.setText(x);
				textField_1.setText(head+"");
				textField_2.setText(ans+"");
				Graph OBJ5=new Graph(A,n);
				OBJ5.test(A,n);
			}
		});
		btnCLOOK.setBackground(new Color(95, 158, 160));
		frmDiskScheduling.getContentPane().add(btnCLOOK);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(329, 283, 66, 20);
		frmDiskScheduling.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMovements = new JLabel("NUMBER OF HEAD MOVEMENTS");
		lblMovements.setBackground(Color.BLACK);
		lblMovements.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblMovements.setForeground(Color.BLACK);
		lblMovements.setBounds(25, 272, 294, 42);
		frmDiskScheduling.getContentPane().add(lblMovements);
		JLabel label = new JLabel("");
		label.setFont(new Font("Arial Black", Font.ITALIC, 12));
		label.setBounds(29, 309, 271, 20);
		frmDiskScheduling.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(34, 231, 66, 14);
		frmDiskScheduling.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(219, 231, 58, 14);
		frmDiskScheduling.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(123, 253, 58, 26);
		frmDiskScheduling.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(307, 265, 58, 14);
		frmDiskScheduling.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(389, 223, 66, 26);
		frmDiskScheduling.getContentPane().add(label_5);
		
		JButton btnCompare = new JButton("COMPARE");
		btnCompare.setBackground(new Color(205, 133, 63));
		btnCompare.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random ra=new Random();
				String x="";
				int n=ra.nextInt(10)+5;
				int A[]=new int[n];
				for(int i=0;i<n;i++) 
				{	A[i]=ra.nextInt(200);
					x=x+" "+A[i];
				}
				int head=ra.nextInt(200);
				textField.setText(x);
				textField_1.setText(head+"");
				DFCFS OBJ1=new DFCFS();
				SSTF OBJ2= new SSTF();
				CLOOK OBJ5 = new CLOOK();
				CSCAN OBJ4 = new CSCAN();
				SCAN OBJ3 = new SCAN();
				int aa[]=new int[6];
				aa[3]=OBJ3.main(A,n,head);
				aa[4]=OBJ4.main(A,n,head);
				aa[5]=OBJ5.main(A,n,head);
				aa[2]=OBJ2.main(A, n, head);
				aa[1]=OBJ1.main(A, n, head);
				label_1.setText(aa[1]+"");
				label_2.setText(aa[2]+"");
				label_3.setText(aa[3]+"");
				label_4.setText(aa[4]+"");
				label_5.setText(aa[5]+"");
				int ans=aa[1];
				String ref[]=new String[6];
				ref[1]="FCFS"; ref[2]="SSTF"; ref[3]="SCAN"; ref[4]="CSCAN"; ref[5]="CLOOK";
				String fin="";
				for(int i=2;i<=5;i++)
				{
					if(ans>aa[i])
					{
						ans=aa[i];
						fin=ref[i];
					}
				}
				label.setText("Most efficient algorithm is: "+fin);
				}
		});
		btnCompare.setBounds(167, 111, 133, 42);
		frmDiskScheduling.getContentPane().add(btnCompare);
		
	
		
		
		
		
	}
}
