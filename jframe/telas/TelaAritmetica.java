package jframe.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;

public class TelaAritmetica extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAritmetica frame = new TelaAritmetica();
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
	public TelaAritmetica() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setEnabled(false);
		setLocationRelativeTo(this);;
		contentPane.setFocusable(false);
		contentPane.setFocusTraversalKeysEnabled(false);
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBorder(UIManager.getBorder("CheckBox.border"));
		header.setBackground(new Color(64, 0, 128));
		header.setBounds(10, 21, 414, 63);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aritmetica");
		lblNewLabel.setBounds(145, 11, 122, 36);
		header.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		
		JPanel main = new JPanel();
		main.setBorder(UIManager.getBorder("CheckBox.border"));
		main.setBackground(new Color(64, 0, 128));
		main.setBounds(10, 95, 414, 145);
		contentPane.add(main);
		main.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("Numero 1");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1.setBounds(33, 34, 81, 23);
		main.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Numero 2");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(292, 34, 81, 23);
		main.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operação");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(163, 34, 81, 23);
		main.add(lblNewLabel_1_2);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(33, 68, 86, 20);
		main.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(287, 68, 86, 20);
		main.add(txtNum2);
		
		JComboBox op = new JComboBox();
		op.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		op.setFocusable(false);
		op.setFont(new Font("Calibri", Font.PLAIN, 12));
		op.setModel(new DefaultComboBoxModel(new String[] {"Adição", "Subtração", "Multiplicação", "Divisão"}));
		op.setBounds(151, 68, 106, 22);
		main.add(op);
		
		Button btnCalcular = new Button("Calcular");
		btnCalcular.setBounds(151, 101, 106, 34);
		main.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtNum1.getText().isEmpty() && !txtNum2.getText().isEmpty()) {
					
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double resultado = 0;
					String operacao = op.getSelectedItem().toString();
					
					if (operacao.equals("Adição")) {
						resultado = num1 + num2;
						
					} else if (operacao.equals("Subtração")) {
						resultado = num1 - num2;
						
					} else if (operacao.equals("Multiplicação")) {
						resultado = num1 * num2;
						
					} else {
						resultado = num1 / num2;
					}

					
					JOptionPane.showMessageDialog(btnCalcular, "Resultado = " + resultado);
					txtNum1.setText("");
					txtNum2.setText("");
							
				
				} else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "CalculaTudo", JOptionPane.WARNING_MESSAGE);
                }
				
			}
		});
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 15));
		btnCalcular.setFocusable(false);
		btnCalcular.setBackground(new Color(64, 0, 128));
	}
}
