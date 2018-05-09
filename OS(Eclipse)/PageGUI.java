import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JTextArea;
public class PageGUI {

	private JFrame frmPageReplacement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnLRU;
	private JButton btnSecondchance;
	private JButton btnOptimal;
	private JTextField textField_5;
	private JButton btnCompare;
	private JTextField textField_7;
	private JLabel lblLengthOfInput;
	

	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageGUI window = new PageGUI();
					window.frmPageReplacement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PageGUI() {
		initialize();
	}

	private void initialize() 
	{
		frmPageReplacement = new JFrame();
		frmPageReplacement.setTitle("PAGE REPLACEMENT");
		frmPageReplacement.getContentPane().setBackground(new Color(255, 0, 102));
		frmPageReplacement.setBounds(100, 100, 479, 389);
		
		JButton btnStart = new JButton("FIFO\r\n");
		btnStart.setBounds(6, 160, 114, 34);
		btnStart.setBackground(new Color(240, 128, 128));
		btnStart.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnStart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 
			{	Random ra=new Random();
				int n=ra.nextInt(8)+12;
				int F=ra.nextInt(4)+3;
				int A[]=new int[n];
				int[][] Table = new int[100][];
				for(int i=0;i<100;i++)
				{
					Table[i]=new int[100];
				}
				
				String x="";
				textField_3.setText("");
				for(int i=0;i<n;i++)
				{   
					A[i]=ra.nextInt(9)+1;
					x=x+" "+A[i];
					System.out.print(A[i]+" ");
				}
				fif OBJ1 = new fif();
				int ans1=OBJ1.fifo(n,F,A,Table);
				
				textField.setText("");
				textField_5.setText("");
				textField_7.setText("");
				textField_3.setText("");

				textField_3.setText(x);
				textField.setText(ans1+"");		
				textField_5.setText(F+"");
				textField_7.setText(n+"");
				String t6="";
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<F;j++)
					{
						if(Table[i][j]!=-1 && Table[i][j]!=0)
							t6=t6+" "+Table[i][j];
					}
					t6=t6+"\n";
				}
				SwingControlDemo oo=new SwingControlDemo();
				oo.main(t6);
			}
		});
		frmPageReplacement.getContentPane().setLayout(null);
		frmPageReplacement.getContentPane().add(btnStart);
		
		textField = new JTextField();
		textField.setBounds(148, 166, 84, 20);
		textField.setBackground(new Color(245, 222, 179));
		frmPageReplacement.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 202, 84, 20);
		textField_1.setBackground(new Color(245, 222, 179));
		frmPageReplacement.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 267, 84, 20);
		textField_2.setBackground(new Color(245, 222, 179));
		frmPageReplacement.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 13, 335, 20);
		textField_3.setBackground(new Color(255, 250, 205));
		frmPageReplacement.getContentPane().add(textField_3);
		textField_3.setColumns(20);
		
		JLabel lblInputString = new JLabel("INPUT");
		lblInputString.setBounds(6, 15, 88, 14);
		lblInputString.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblInputString.setForeground(new Color(0, 0, 128));
		frmPageReplacement.getContentPane().add(lblInputString);
		
		textField_4 = new JTextField();
		textField_4.setBounds(148, 238, 84, 20);
		textField_4.setBackground(new Color(245, 222, 179));
		frmPageReplacement.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		btnLRU = new JButton("lruFixed");
		btnLRU.setBounds(6, 194, 114, 36);
		btnLRU.setBackground(new Color(240, 128, 128));
		btnLRU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Random ra=new Random();
				int n=ra.nextInt(8)+12;
				int F=ra.nextInt(4)+3;
				int A[]=new int[n+1];
				int[][] Table = new int[100][];
				for(int i=0;i<100;i++)
				{
					Table[i]=new int[100];
				}
				
				String x="";
				textField_3.setText("");
				for(int i=1;i<=n;i++)
				{   
					A[i]=ra.nextInt(9)+1;
					x=x+" "+A[i];
					System.out.print(A[i]+" ");
				}
				lruRandom OBJ2 = new lruRandom();
				int ans2=OBJ2.lru(n,F,A,Table);
				
				textField.setText("");
				textField_5.setText("");
				textField_7.setText("");
				textField_3.setText("");
				
				textField_3.setText(x);
				textField_1.setText(ans2+"");		
				textField_5.setText(F+"");
				textField_7.setText(n+"");
				String t6="";
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=F;j++)
					{
						if(Table[i][j]!=-1 && Table[i][j]!=0)
							t6=t6+" "+Table[i][j];
					}
					t6=t6+"\n";
				}
				SwingControlDemo oo=new SwingControlDemo();
				oo.main(t6);
			}
		});
		btnLRU.setFont(new Font("Arial Black", Font.PLAIN, 11));
		frmPageReplacement.getContentPane().add(btnLRU);
		
		btnSecondchance = new JButton("SECOND CHANCE");
		btnSecondchance.setBounds(6, 261, 114, 36);
		btnSecondchance.setBackground(new Color(240, 128, 128));
		btnSecondchance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Random ra=new Random();
				int n=ra.nextInt(8)+12;
				int F=ra.nextInt(4)+3;
				int A[]=new int[n+1];
				int[][] Table = new int[100][];
				for(int i=0;i<100;i++)
				{
					Table[i]=new int[100];
				}
				
				String x="";
				textField_3.setText("");
				for(int i=1;i<=n;i++)
				{   
					A[i]=ra.nextInt(9)+1;
					x=x+" "+A[i];
					System.out.print(A[i]+" ");
				}
				SC OBJ3 = new SC();
				int ans3=OBJ3.second_chance(n,F,A,Table);
				
				textField.setText("");
				textField_5.setText("");
				textField_7.setText("");
				textField_3.setText("");
				
				textField_3.setText(x);
				textField_2.setText(ans3+"");		
				textField_5.setText(F+"");
				textField_7.setText(n+"");
				String t6="";
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=F;j++)
					{
						if(Table[i][j]!=-1 && Table[i][j]!=0)
							t6=t6+" "+Table[i][j];
					}
					t6=t6+"\n";
				}
				SwingControlDemo oo=new SwingControlDemo();
				oo.main(t6);
			}
		});
		btnSecondchance.setFont(new Font("Arial Black", Font.PLAIN, 10));
		frmPageReplacement.getContentPane().add(btnSecondchance);
		
		btnOptimal = new JButton("optimalFixed");
		btnOptimal.setBounds(6, 230, 114, 36);
		btnOptimal.setBackground(new Color(240, 128, 128));
		btnOptimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Random ra=new Random();
				int n=ra.nextInt(8)+12;
				int F=ra.nextInt(4)+3;
				int A[]=new int[n+1];
				int[][] Table = new int[100][];
				for(int i=0;i<100;i++)
				{
					Table[i]=new int[100];
				}
				
				String x="";
				textField_3.setText("");
				for(int i=1;i<=n;i++)
				{   
					A[i]=ra.nextInt(9)+1;
					x=x+" "+A[i];
					System.out.print(A[i]+" ");
				}
				optimalRandom OBJ3 = new optimalRandom();
				int ans3=OBJ3.optimal(n,F,A,Table);
				
				textField.setText("");
				textField_5.setText("");
				textField_7.setText("");
				textField_3.setText("");
				textField_3.setText(x);
				textField_4.setText(ans3+"");		
				textField_5.setText(F+"");
				textField_7.setText(n+"");
				String t6="";
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=F;j++)
					{
						if(Table[i][j]!=-1 && Table[i][j]!=0)
							t6=t6+" "+Table[i][j];
					}
					t6=t6+"\n";
				}
				SwingControlDemo oo=new SwingControlDemo();
				oo.main(t6);
			}
		});
		btnOptimal.setFont(new Font("Arial Black", Font.PLAIN, 11));
		frmPageReplacement.getContentPane().add(btnOptimal);
		
		textField_5 = new JTextField();
		textField_5.setBounds(135, 44, 46, 20);
		textField_5.setBackground(new Color(238, 232, 170));
		frmPageReplacement.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNoOfFrames = new JLabel("TOTAL FRAMES");
		lblNoOfFrames.setBounds(6, 47, 114, 14);
		lblNoOfFrames.setForeground(new Color(0, 0, 139));
		lblNoOfFrames.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNoOfFrames.setBackground(new Color(0, 0, 139));
		frmPageReplacement.getContentPane().add(lblNoOfFrames);
		
		btnCompare = new JButton("COMPARE NOW");
		btnCompare.setBackground(new Color(219, 112, 147));
		btnCompare.setBounds(256, 104, 186, 90);
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random ra=new Random();
				int A[]=new int[20];
				String x="";
				textField.setText("");
				textField_5.setText("");
				textField_7.setText("");
				textField_3.setText("");
				for(int i=0;i<20;i++)
				{   
					A[i]=ra.nextInt(10);
					x=x+" "+A[i];
					System.out.print(A[i]+" ");
				}
				textField_3.setText(x);
				FIFO o1=new FIFO(); int a1=o1.main(A);
				lruFixed o2=new lruFixed(); int a2=o2.main(A);
				Secondchance o3=new Secondchance(); int a3=o3.main(A);
				optimalFixed o4=new optimalFixed(); int a4=o4.main(A);
				textField_2.setText(a3+"");
				textField_1.setText(a2+"");
				textField.setText(a1+"");
				textField_4.setText(a4+"");
				textField_5.setText(3+"");
				textField_7.setText(20+"");
				double m[]=new double[4];
				m[0]=(double) a1; m[1]=(double)a2; m[2]=(double) a3; m[3]= (double) a4;
				Piechart_AWT ooo=new Piechart_AWT("",m);
				ooo.main(m);
			}
		});
		btnCompare.setFont(new Font("Arial Black", Font.PLAIN, 13));
		frmPageReplacement.getContentPane().add(btnCompare);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(238, 232, 170));
		textField_7.setBounds(135, 81, 46, 20);
		frmPageReplacement.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		lblLengthOfInput = new JLabel("INPUT LENGTH");
		lblLengthOfInput.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblLengthOfInput.setBounds(6, 80, 209, 23);
		lblLengthOfInput.setForeground(new Color(0, 0, 139));
		frmPageReplacement.getContentPane().add(lblLengthOfInput);
		
	}
}
