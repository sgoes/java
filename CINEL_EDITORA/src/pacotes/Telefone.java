package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Telefone extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeProcurarTelf;
	private JTextField textFieldTelefoneProcurarTelf;
	private JTextField textFieldEmailProcurarTelf;
	private JTextField textFieldGrupoProcurarTelf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telefone frame = new Telefone();
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
	public Telefone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel.setBounds(41, 51, 69, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblTelefone.setBounds(25, 80, 69, 18);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail: ");
		lblEmail.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblEmail.setBounds(41, 124, 69, 18);
		contentPane.add(lblEmail);
		
		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblGrupo.setBounds(41, 153, 69, 18);
		contentPane.add(lblGrupo);
		
		textFieldNomeProcurarTelf = new JTextField();
		textFieldNomeProcurarTelf.setEditable(false);
		textFieldNomeProcurarTelf.setBounds(87, 51, 156, 20);
		contentPane.add(textFieldNomeProcurarTelf);
		textFieldNomeProcurarTelf.setColumns(10);
		
		textFieldTelefoneProcurarTelf = new JTextField();
		textFieldTelefoneProcurarTelf.setBounds(87, 80, 156, 20);
		contentPane.add(textFieldTelefoneProcurarTelf);
		textFieldTelefoneProcurarTelf.setColumns(10);
		
		textFieldEmailProcurarTelf = new JTextField();
		textFieldEmailProcurarTelf.setEnabled(false);
		textFieldEmailProcurarTelf.setBounds(93, 124, 150, 20);
		contentPane.add(textFieldEmailProcurarTelf);
		textFieldEmailProcurarTelf.setColumns(10);
		
		textFieldGrupoProcurarTelf = new JTextField();
		textFieldGrupoProcurarTelf.setEnabled(false);
		textFieldGrupoProcurarTelf.setBounds(93, 153, 150, 20);
		contentPane.add(textFieldGrupoProcurarTelf);
		textFieldGrupoProcurarTelf.setColumns(10);
		
		JButton btnProcurarTelefone = new JButton("Procurar");
		btnProcurarTelefone.setBounds(57, 195, 89, 23);
		contentPane.add(btnProcurarTelefone);
		
		JButton btnCancelarTelefone = new JButton("Cancelar");
		btnCancelarTelefone.setBounds(166, 195, 89, 23);
		contentPane.add(btnCancelarTelefone);
	}

}
