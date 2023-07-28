package jframe.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jframe.telas.TelaAritmetica;

import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaBhaskara extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBhaskara frame = new TelaBhaskara();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaBhaskara() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setEnabled(false);
		contentPane.setFocusable(false);
		setLocationRelativeTo(this);;
		contentPane.setFocusTraversalKeysEnabled(false);
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(10, 21, 414, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bhaskara");
		lblNewLabel.setBounds(153, 11, 108, 36);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_1 = new JLabel("Coeficiente A\r\n");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 130, 106, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Coeficiente B");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(168, 130, 100, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Coeficiente C\r\n");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(313, 130, 100, 23);
		contentPane.add(lblNewLabel_1_2);
		
		txtA = new JTextField();
		txtA.setColumns(10);
		txtA.setBounds(20, 175, 106, 20);
		contentPane.add(txtA);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(168, 175, 100, 20);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(313, 175, 100, 20);
		contentPane.add(txtC);
		
		Button btnResolva = new Button("Resolva");
		btnResolva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!txtA.getText().isEmpty() && !txtB.getText().isEmpty() && !txtC.getText().isEmpty()) {
					
					DecimalFormat formata = new DecimalFormat();
					
					double a = Double.parseDouble(txtA.getText());
					double b = Double.parseDouble(txtB.getText());
					double c = Double.parseDouble(txtC.getText());
					double delta = b * b -4*a*c;
			
					if (delta < 0) {
						JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
					} else if (delta == 0 ) {
						double x = -b / (2*a);
						JOptionPane.showMessageDialog(null, "A equação possui somento uma raíz real. ( X = " + formata.format(x) + " )");
					} else {
						double x1 = (-b - Math.sqrt(delta)) / (2*a); 
						double x2 = (-b + Math.sqrt(delta)) / (2*a); 
						JOptionPane.showMessageDialog(null, "O valor da raízes reais são. ( X1 = " + formata.format(x1) + " )" + "( X2 = " + formata.format(x2) + " )");
					}
					
					txtA.setText("");
					txtB.setText("");
					txtC.setText("");
					
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "CalculaTudo", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnResolva.setActionCommand("Resolva");
		btnResolva.setForeground(Color.WHITE);
		btnResolva.setFont(new Font("Arial", Font.BOLD, 15));
		btnResolva.setFocusable(false);
		btnResolva.setBackground(new Color(64, 0, 128));
		btnResolva.setBounds(168, 217, 106, 34);
		contentPane.add(btnResolva);
	}
}
