package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class MarcarConsultas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeUtente;
	private JTextField textFieldNomeMedico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarcarConsultas frame = new MarcarConsultas();
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
	public MarcarConsultas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\clinica.png"));
		setResizable(false);
		setTitle("Marcar Consultas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 517, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do utente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(71, 47, 118, 24);
		contentPane.add(lblNewLabel);
		
		textFieldNomeUtente = new JTextField();
		textFieldNomeUtente.setBounds(199, 51, 212, 20);
		contentPane.add(textFieldNomeUtente);
		textFieldNomeUtente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do médico");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(71, 97, 128, 29);
		contentPane.add(lblNewLabel_1);
		
		textFieldNomeMedico = new JTextField();
		textFieldNomeMedico.setBounds(199, 103, 212, 24);
		contentPane.add(textFieldNomeMedico);
		textFieldNomeMedico.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Data da consulta");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(71, 158, 118, 24);
		contentPane.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(199, 162, 217, 20);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("Marcar Consulta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// se os campos Nome do utente e Nome do medico estiverem sozinhas --- basta um deles não estar preenchido
				if(textFieldNomeUtente.getText().trim().equals("") || textFieldNomeMedico.getText().trim().equals("") || dateChooser.getDate() == null){
					JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório",  "Aviso", JOptionPane.WARNING_MESSAGE);
				}else {
					//JOptionPane.showMessageDialog(null, dateChooser.getDate());
					
					// Definição da formatação pretendida para a data
					SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
					
					// Formatação da data que é escolhida através do interface e guardar a dada inserida pelo user 
					String data = dataFormatada.format(dateChooser.getDate());
					
					// Guardar os dados que sao inseridos pelo user
					String utente = textFieldNomeUtente.getText();
					String medico = textFieldNomeMedico.getText();
					
					// criação do objeto para ligar a classe Consulta
					Consulta novaConsulta = new Consulta();
					//novaConsulta.MarcarConsulta(utente, medico, medico, data);
					
					//JOptionPane.showMessageDialog(null, "Marcação realizada com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
				}
				
				// Limpar os campos após a insercao de dados
				textFieldNomeUtente.setText("");
				textFieldNomeMedico.setText("");
				dateChooser.setCalendar(null);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(145, 220, 239, 65);
		contentPane.add(btnNewButton);
	}
}
