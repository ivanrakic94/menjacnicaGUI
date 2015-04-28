package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textField_4;
	private JTextField textField_5;
	private JCheckBox chckbxZaistaObrisiKurs;
	private JButton btnObrisi;
	private JButton btnOdustani;
	
	private MenjacnicaGUI glavniProzor;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI glavniProzor) {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		
		this.glavniProzor = glavniProzor;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNaziv.setBounds(245, 13, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 36, 188, 28);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(245, 38, 188, 26);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblProdajniKurs.setBounds(10, 75, 131, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblKupovniKurs.setBounds(245, 75, 131, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(10, 100, 188, 28);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setBounds(245, 100, 188, 28);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSrednjiKurs.setBounds(10, 139, 118, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSkraceniNaziv.setBounds(245, 139, 118, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setBounds(10, 164, 188, 28);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setBounds(245, 164, 188, 28);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
					if(chckbxZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
						textField.setEditable(true);
						textField_1.setEditable(true);
						textField_2.setEditable(true);
						textField_3.setEditable(true);
						textField_4.setEditable(true);
					} else {
						btnObrisi.setEnabled(false);
						textField.setEditable(false);
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						textField_3.setEditable(false);
						textField_4.setEditable(false);
					}
				}
			});
			chckbxZaistaObrisiKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxZaistaObrisiKurs.setBounds(6, 199, 159, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String tekst = "Obrisan kurs - Sifra: " + textField.getText() + ", Naziv:" + textField_1.getText() + ", Prodajni kurs: " + textField_2.getText() +
							 ", Srednji kurs: " + textField_3.getText() + ", Kupovni kurs: " + textField_4.getText() + ", Skraceni naziv: " + textField_5.getText();
					glavniProzor.getTextArea().setText(glavniProzor.getTextArea().getText() + "\n" + tekst);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnObrisi.setBounds(10, 229, 188, 28);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnOdustani.setBounds(245, 229, 188, 28);
		}
		return btnOdustani;
	}
}
