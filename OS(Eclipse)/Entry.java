import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Entry {
	private static JPanel panel_1;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome Page");
		frame.setBounds(200, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(panel_1);
		placeComponents(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(0, 199, 784, 131);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblOsSimulator = new JLabel("Operating Systems SIMULATOR");
		lblOsSimulator.setHorizontalAlignment(SwingConstants.CENTER);
		lblOsSimulator.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		lblOsSimulator.setForeground(new Color(0, 0, 0));
		lblOsSimulator.setBounds(91, 0, 560, 131);
		panel.add(lblOsSimulator);
		
		JTextPane txtpnGroupMembers = new JTextPane();
		txtpnGroupMembers.setEditable(false);
		txtpnGroupMembers.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnGroupMembers.setBackground(new Color(255, 218, 185));
		txtpnGroupMembers.setText("Group Members: Prathyush,Srijan,Rutvik,Sahaj");
		txtpnGroupMembers.setBounds(183, 0, 394, 26);
		panel_1.add(txtpnGroupMembers);

		frame.setVisible(true);
	}
       
	    private static void placeComponents(JPanel panel) {
		panel_1.setLayout(null);

		JButton entryButton = new JButton("Click to Continue!");
		entryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				    Dashboard o=new Dashboard();
					o.main();
			}
		});
		entryButton.setBackground(new Color(255, 0, 0));
		entryButton.setFont(new Font("Arial Black", Font.BOLD, 12));
		entryButton.setBounds(260, 405, 231, 39);
		panel.add(entryButton);
	}
}