import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;

public class Main extends JFrame {
	private JTextField textFieldNome;
	private JTextField textFieldIdade;
	private JTextField textFieldNomeMax;
	private JTextField textFieldIdadeMax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// atributos
	public int idadeMax = 0;
	public String nomeMax = "";

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 322);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ficheiro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("SAIR");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// é sempre uma mensagem informativa
				//JOptionPane.showMessageDialog(null, "Tem a certeza que quer sair?  " Informação", JOptionPane.OK_CANCEL_OPTION);
				int resposta = JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair", " Informação", JOptionPane.YES_NO_CANCEL_OPTION ); 
				JOptionPane.showMessageDialog(null, resposta, " Informação", JOptionPane.OK_CANCEL_OPTION);
				
				if(resposta == 0) {
					// se a resposta for afirmativa (igual a zero) fecha o programa 
					System.exit(0);
				}
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(65, 35, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(121, 33, 151, 20);
		getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Localidade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(37, 72, 74, 18);
		getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma opção:", "Porto", "Lisboa", "Braga", "Funchal", "Faro"}));
		comboBox.setBounds(121, 70, 151, 22);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Inserir Dados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// primeiro  a combobox
				if(comboBox.getSelectedIndex() == 0 || textFieldNome.getText().trim().equals("") || textFieldIdade.getText().trim().equals(" "))
				{
					JOptionPane.showMessageDialog(null, "Os campos são de preenchimento obrigatório");
				}else {
					JOptionPane.showMessageDialog(null, "Nome: " + textFieldNome.getText() + "\nLocalidade: " + comboBox.getSelectedItem());
					if( Integer.parseInt(textFieldIdade.getText()) > idadeMax) {
						// GUARDAR OS DADOS NAS VARIAVEIS
						idadeMax = Integer.parseInt(textFieldIdade.getText());
						nomeMax = textFieldNome.getText();
						
						// MOSTRAR DADOS
						textFieldNomeMax.setText(nomeMax);
						textFieldIdadeMax.setText(String.valueOf(idadeMax));
						
						
					}
				}
				
				// limpar os campos
				textFieldNome.setText("");
				//  forçar para voltar ao momento inicial
				comboBox.setSelectedIndex(0);
				
				// primeiro  a combobox
				/*
				if(comboBox.getSelectedItem().equals("Escolha uma opção")|| textFieldNome.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Os campos são de preenchimento obrigatório");
				}else {
					JOptionPane.showMessageDialog(null, "Nome: " + textFieldNome.getText() + "\nLocalidade: " + comboBox.getSelectedItem());
				}*/
				
			}
		});
		btnNewButton.setForeground(new Color(186, 85, 211));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(294, 31, 183, 59);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(65, 101, 46, 30);
		getContentPane().add(lblNewLabel_2);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(124, 103, 148, 20);
		getContentPane().add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		textFieldNomeMax = new JTextField();
		textFieldNomeMax.setEditable(false);
		textFieldNomeMax.setBounds(367, 143, 86, 20);
		getContentPane().add(textFieldNomeMax);
		textFieldNomeMax.setColumns(10);
		
		JLabel Aluno_mais_Velho = new JLabel("Aluno + velho");
		Aluno_mais_Velho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Aluno_mais_Velho.setBounds(335, 121, 91, 14);
		getContentPane().add(Aluno_mais_Velho);
		
		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(318, 145, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Idade");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(318, 170, 46, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		textFieldIdadeMax = new JTextField();
		textFieldIdadeMax.setEditable(false);
		textFieldIdadeMax.setColumns(10);
		textFieldIdadeMax.setBounds(367, 164, 86, 20);
		getContentPane().add(textFieldIdadeMax);
	}
}
