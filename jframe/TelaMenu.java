package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jframe.telas.TelaAritmetica;
import jframe.telas.TelaBhaskara;
import jframe.telas.TelaPitagoras;

import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
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

public class TelaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
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
	public TelaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblNewLabel = new JLabel("CalculaTudo");
		lblNewLabel.setBounds(125, 11, 146, 36);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		
		Button btnAritmetica = new Button("Aritmética");
		btnAritmetica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAritmetica aritmetica = new TelaAritmetica();
				aritmetica.setVisible(true);
			}
		});
		btnAritmetica.setForeground(new Color(255, 255, 255));
		btnAritmetica.setFont(new Font("Arial", Font.BOLD, 15));
		btnAritmetica.setFocusable(false);
		btnAritmetica.setBackground(new Color(64, 0, 128));
		btnAritmetica.setBounds(10, 147, 105, 34);
		contentPane.add(btnAritmetica);
		
		Button btnBhaskara = new Button("Bhaskara");
		btnBhaskara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaBhaskara bhaskara = new TelaBhaskara();
				bhaskara.setVisible(true);
			}
		});
		btnBhaskara.setForeground(Color.WHITE);
		btnBhaskara.setFont(new Font("Arial", Font.BOLD, 15));
		btnBhaskara.setFocusable(false);
		btnBhaskara.setBackground(new Color(64, 0, 128));
		btnBhaskara.setBounds(167, 147, 105, 34);
		contentPane.add(btnBhaskara);
		
		Button btnPitagoras = new Button("Pitágoras");
		btnPitagoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPitagoras pitagora = new TelaPitagoras();
				pitagora.setVisible(true);
			}
		});
		btnPitagoras.setForeground(Color.WHITE);
		btnPitagoras.setFont(new Font("Arial", Font.BOLD, 15));
		btnPitagoras.setFocusable(false);
		btnPitagoras.setBackground(new Color(64, 0, 128));
		btnPitagoras.setBounds(319, 147, 105, 34);
		contentPane.add(btnPitagoras);
	}
}
