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

public class TelaPitagoras extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdjacente;
	private JTextField txtHipotenusa;
	private JTextField txtOposto;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPitagoras frame = new TelaPitagoras();
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
	public TelaPitagoras() {
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
		
		JLabel lblNewLabel = new JLabel("Pitágoras");
		lblNewLabel.setBounds(153, 11, 112, 36);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_1 = new JLabel("Cateto adjacente");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 130, 138, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hipotenusa");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(179, 130, 86, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cateto oposto");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(299, 130, 114, 23);
		contentPane.add(lblNewLabel_1_2);
		
		txtAdjacente = new JTextField();
		txtAdjacente.setColumns(10);
		txtAdjacente.setBounds(36, 175, 81, 20);
		contentPane.add(txtAdjacente);
		
		txtHipotenusa = new JTextField();
		txtHipotenusa.setColumns(10);
		txtHipotenusa.setBounds(188, 175, 66, 20);
		contentPane.add(txtHipotenusa);
		
		Button btnResolva = new Button("Resolva");
		btnResolva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtAdjacente.getText().isEmpty() && !txtHipotenusa.getText().isEmpty() && !txtOposto.getText().isEmpty()) {
					
					DecimalFormat formata = new DecimalFormat();
					
					double adjacente = Double.parseDouble(txtAdjacente.getText());
					double hipotenusa = Double.parseDouble(txtHipotenusa.getText());
					double oposto = Double.parseDouble(txtOposto.getText());
					
					double c1 = adjacente * adjacente;
					double h = hipotenusa * hipotenusa;
					double c2 = oposto * oposto;
					
					if (hipotenusa == 0) {
						h = c1 + c2;
						hipotenusa = Math.sqrt(h);					
						JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + formata.format(hipotenusa));
						
					} else if (adjacente == 0) {
						if (h > c2) {
							c1 = h - c2;
							adjacente = Math.sqrt(c1);
							JOptionPane.showMessageDialog(null, "O valor do cateto adjacente é: " + formata.format(adjacente));
						} else {
							c1 = -h + c2;
							adjacente = Math.sqrt(c1);
							JOptionPane.showMessageDialog(null, "O valor do cateto adjacente é: " + formata.format(adjacente));
						}
						
					} else if (oposto == 0) {
						if (h > c1) {
							c2 = h - c1;
							oposto = Math.sqrt(c2);
							JOptionPane.showMessageDialog(null, "O valor do cateto oposto é: " + formata.format(oposto));
						} else {
							c2 = -h + c1;
							oposto = Math.sqrt(c2);
							JOptionPane.showMessageDialog(null, "O valor do cateto oposto é: " + formata.format(oposto));
						}
					} else {
	                    JOptionPane.showMessageDialog(null, "Operação nao realizada por favor tentar denovo", "CalculaTudo", JOptionPane.WARNING_MESSAGE);
					}
					
					txtAdjacente.setText("");
					txtHipotenusa.setText("");
					txtOposto.setText("");
					
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
		
		txtOposto = new JTextField();
		txtOposto.setColumns(10);
		txtOposto.setBounds(315, 175, 81, 20);
		contentPane.add(txtOposto);
	}
}
