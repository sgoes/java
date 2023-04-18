package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class FichaAluguer extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeCliente;
	private JTextField textFieldValor;
	int valor = 0;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaAluguer frame = new FichaAluguer();
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
	public FichaAluguer() {
		JComboBox<String> comboBoxNIF = new JComboBox<String>();
		comboBoxNIF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxNIF.getSelectedIndex() != 0) {
					for(int i = 0; i < Cliente.dadosCliente.size(); i++) {
						String[] linha = Cliente.dadosCliente.get(i).split(";");
						
						// comparar e fazer match quando encontrar
						if(linha[0].equals(comboBoxNIF.getSelectedItem())) {
							textFieldNomeCliente.setText(linha[1]);
					
						}
					}
				}
				
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
					comboBoxNIF.addItem("Escolha um cliente");
					// De seguida tenho de ir buscar os outros
					for(int i = 0; i < Cliente.dadosCliente.size(); i++) {
						 // preciso ver que quando guardamos os dados, guardamos em formato linha, é necessário fazer o split
						String[] linha = Cliente.dadosCliente.get(i).split(";");
						// depois de separadados adiciono a minha comboBox
						comboBoxNIF.addItem(linha[0]);
					}
					// Para "zerar" a comboBox na posicao inicial
					comboBoxNIF.setSelectedIndex(0);
					
				}
		});
		setTitle("Ficha de Aluguer");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_cars\\imagens\\carro.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data de levantamento");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel.setBounds(56, 89, 143, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblFichaDoAluguer = new JLabel("Ficha do aluguer");
		lblFichaDoAluguer.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblFichaDoAluguer.setBounds(210, 41, 150, 23);
		contentPane.add(lblFichaDoAluguer);
		
		JDateChooser dateChooserDataLevantamento = new JDateChooser();
		dateChooserDataLevantamento.setBounds(201, 89, 205, 20);
		contentPane.add(dateChooserDataLevantamento);
		
		JLabel lblMatrcula = new JLabel("Matrícula");
		lblMatrcula.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblMatrcula.setBounds(56, 120, 143, 20);
		contentPane.add(lblMatrcula);
		
		JFormattedTextField formattedTextFieldMatricula = new JFormattedTextField();
		formattedTextFieldMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldMatricula.setBounds(201, 120, 205, 20);
		MaskFormatter novaMatricula = null;
		try {
			
			novaMatricula = new MaskFormatter("??-##-??");

		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Matrícula está no formato incorreto!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		novaMatricula.install(formattedTextFieldMatricula);
		contentPane.add(formattedTextFieldMatricula);
		
		
		JLabel lblNifCliente = new JLabel("NIF Cliente");
		lblNifCliente.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNifCliente.setBounds(56, 151, 143, 20);
		contentPane.add(lblNifCliente);
		
		
		comboBoxNIF.setBounds(201, 151, 205, 22);
		contentPane.add(comboBoxNIF);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do Cliente");
		lblNomeDoCliente.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNomeDoCliente.setBounds(56, 182, 143, 20);
		contentPane.add(lblNomeDoCliente);
		
		textFieldNomeCliente = new JTextField();
		textFieldNomeCliente.setEditable(false);
		textFieldNomeCliente.setBounds(201, 182, 205, 20);
		contentPane.add(textFieldNomeCliente);
		textFieldNomeCliente.setColumns(10);
		
		JLabel lblDataDeEntrega = new JLabel("Data de Entrega");
		lblDataDeEntrega.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblDataDeEntrega.setBounds(56, 231, 143, 20);
		contentPane.add(lblDataDeEntrega);
		
		JCheckBox chckbxOpel = new JCheckBox("Opel - Astra");
		buttonGroup.add(chckbxOpel);
		chckbxOpel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxOpel.isSelected()==true) {
					valor += 100;
					textFieldValor.setText(Integer.toString(valor));
				}else {
					valor =-100;
				}
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		chckbxOpel.setBounds(56, 292, 97, 23);
		contentPane.add(chckbxOpel);
		
		JLabel lblSelecioneAViatura = new JLabel("Selecione a viatura");
		lblSelecioneAViatura.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblSelecioneAViatura.setBounds(56, 265, 143, 20);
		contentPane.add(lblSelecioneAViatura);
		
		JCheckBox chckbxRenaultClio = new JCheckBox("Renault - Clio");
		buttonGroup.add(chckbxRenaultClio);
		chckbxRenaultClio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRenaultClio.isSelected()==true) {
					valor += 90;
					textFieldValor.setText(Integer.toString(valor));
				}else {
					valor =-90;
				}
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		chckbxRenaultClio.setBounds(56, 325, 97, 23);
		contentPane.add(chckbxRenaultClio);
		
		JCheckBox chckbxLandRover = new JCheckBox("Land Rover - Discovery");
		buttonGroup.add(chckbxLandRover);
		chckbxLandRover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLandRover.isSelected()==true) {
					valor += 250;
					textFieldValor.setText(Integer.toString(valor));
				}else {
					valor =-250;
				}
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		chckbxLandRover.setBounds(56, 351, 143, 23);
		contentPane.add(chckbxLandRover);
		
		JCheckBox chckbxJeep = new JCheckBox("Jeep");
		buttonGroup.add(chckbxJeep);
		chckbxJeep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxJeep.isSelected()==true) {
					valor += 150;
					textFieldValor.setText(Integer.toString(valor));
				}else {
					valor =-150;
				}
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		chckbxJeep.setBounds(210, 351, 143, 23);
		contentPane.add(chckbxJeep);
		
		JCheckBox chckbxCintroenC = new JCheckBox("Cintroen - C3");
		buttonGroup.add(chckbxCintroenC);
		chckbxCintroenC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCintroenC.isSelected()==true) {
					valor += 100;
					textFieldValor.setText(Integer.toString(valor));
				}else {
					valor =-100;
				}
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		chckbxCintroenC.setBounds(210, 325, 143, 23);
		contentPane.add(chckbxCintroenC);
		
		textFieldValor = new JTextField();
		JCheckBox chckbxMercedes = new JCheckBox("Mercedes");
		buttonGroup.add(chckbxMercedes);
		chckbxMercedes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMercedes.isSelected()==true) {
					valor += 180;
					textFieldValor.setText(Integer.toString(valor));
				}else {
					valor =-180;
				}
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		chckbxMercedes.setBounds(210, 292, 143, 23);
		contentPane.add(chckbxMercedes);
		
		JButton btnNewButton = new JButton("Novo Aluguer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(dateChooserDataLevantamento.getDate() == null || formattedTextFieldMatricula.getText().trim().equals("") || comboBoxNIF.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório", "ERRO", JOptionPane.ERROR_MESSAGE);
					
					
				}else if(chckbxOpel.isSelected() == false && chckbxRenaultClio.isSelected()==false && chckbxLandRover.isSelected()==false && chckbxJeep.isSelected()==false && chckbxCintroenC.isSelected()==false && chckbxMercedes.isSelected()==false ){
					
					
					JOptionPane.showMessageDialog(null, "Deve selecionar pelo meno uma viatura!", "ERRO", JOptionPane.ERROR_MESSAGE);
					textFieldValor.setText("100");
					
				}
				
				
				
				else {
					
					SimpleDateFormat novaData = new SimpleDateFormat("dd/MM/yyyy");
					String data = novaData.format(dateChooserDataLevantamento.getDate());
					
					String aluguer = "";
					if(chckbxOpel.isSelected() == true) {
						aluguer = "Opel Astra";
						}
					if(chckbxRenaultClio.isSelected()==true) {
						aluguer += "Renault Clio";
							}
					if(chckbxLandRover.isSelected()==true) {
					aluguer += "Land Rover Discovery";
						}
					if(chckbxJeep.isSelected()==true) {
					aluguer += "Jeep";
						}
					if(chckbxCintroenC.isSelected()==true) {
					aluguer += "Cintroen C3";
						}
					if(chckbxMercedes.isSelected()==true) {
					aluguer += "Mercedes";
				}
					int valor = Integer.parseInt(textFieldValor.getText());
					
					NovoAluguer enviarDados = new NovoAluguer();
					enviarDados.BaseDadosAluguer(data, formattedTextFieldMatricula.getText().trim(), comboBoxNIF.getSelectedItem().toString(), textFieldNomeCliente.getText(), aluguer, valor);
					
					// limpar os campos
					dateChooserDataLevantamento.setCalendar(null);
					formattedTextFieldMatricula.setValue("");
					comboBoxNIF.setSelectedIndex(0);
					textFieldNomeCliente.setText("");
					textFieldValor.setText("");
					aluguer = "";
					
					chckbxOpel.setSelected(false);
					chckbxRenaultClio.setSelected(false);
					chckbxLandRover.setSelected(false);
					chckbxJeep.setSelected(false);
					chckbxCintroenC.setSelected(false);
					chckbxMercedes.setSelected(false);
				}
				
			}
		});
		btnNewButton.setBounds(179, 414, 213, 41);
		contentPane.add(btnNewButton);
		
		
		textFieldValor.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldValor.setText("0");
		textFieldValor.setEditable(false);
		textFieldValor.setBounds(372, 316, 108, 41);
		contentPane.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor a pagar");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.BOLD, 11));
		lblNewLabel_1.setBounds(394, 292, 74, 14);
		contentPane.add(lblNewLabel_1);
	}
}
