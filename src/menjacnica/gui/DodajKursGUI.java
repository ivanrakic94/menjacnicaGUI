package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textField;
	private JLabel lblNaziv;
	private JTextField textField_1;
	private JLabel lblProdajniKurs;
	private JTextField textField_2;
	private JLabel lblKupovniKurs;
	private JTextField textField_3;
	private JLabel lblSrednjiKurs;
	private JTextField textField_4;
	private JLabel lblSkraceniNaziv;
	private JTextField textField_5;
	private JButton btnDodaj;
	private JButton btnOdustani;
	
	private MenjacnicaGUI glavniProzor;


	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI glavniProzor) {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextField());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextField_1());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField_2());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField_3());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextField_4());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextField_5());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		setLocationRelativeTo(glavniProzor);
		this.glavniProzor = glavniProzor;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSifra.setBounds(25, 11, 68, 14);
		}
		return lblSifra;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(25, 36, 175, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNaziv.setBounds(259, 13, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(259, 36, 175, 29);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblProdajniKurs.setBounds(25, 79, 109, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(25, 104, 175, 29);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblKupovniKurs.setBounds(259, 81, 109, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(259, 104, 175, 29);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSrednjiKurs.setBounds(25, 149, 109, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(25, 174, 175, 29);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSkraceniNaziv.setBounds(259, 151, 109, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(259, 174, 175, 29);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String tekst = "Dodat kurs - Sifra: " + textField.getText() + ", Naziv:" + textField_1.getText() + ", Prodajni kurs: " + textField_2.getText() +
							 ", Srednji kurs: " + textField_3.getText() + ", Kupovni kurs: " + textField_4.getText() + ", Skraceni naziv: " + textField_5.getText();
					glavniProzor.getTextArea().setText(glavniProzor.getTextArea().getText() + "\n" + tekst);
					dispose();
				}
			});
			btnDodaj.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnDodaj.setBounds(25, 218, 175, 29);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnOdustani.setBounds(259, 218, 163, 29);
		}
		return btnOdustani;
	}
}
