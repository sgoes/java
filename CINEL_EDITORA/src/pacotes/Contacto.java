package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contacto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldTelefone;
	private JTextField textFieldemail;
	private JTextField textFieldGrupo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contacto frame = new Contacto();
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
	public Contacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 395, 281);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(186, 85, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setForeground(new Color(186, 85, 211));
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel.setBounds(54, 108, 64, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setForeground(new Color(186, 85, 211));
		lblNewLabel_1.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel_1.setBounds(54, 51, 64, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setForeground(new Color(186, 85, 211));
		lblNewLabel_2.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel_2.setBounds(36, 80, 64, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setForeground(new Color(186, 85, 211));
		lblGrupo.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblGrupo.setBounds(54, 137, 64, 18);
		contentPane.add(lblGrupo);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(119, 51, 215, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(119, 77, 215, 20);
		contentPane.add(textFieldTelefone);
		
		textFieldemail = new JTextField();
		textFieldemail.setColumns(10);
		textFieldemail.setBounds(119, 108, 215, 20);
		contentPane.add(textFieldemail);
		
		textFieldGrupo = new JTextField();
		textFieldGrupo.setForeground(new Color(186, 85, 211));
		textFieldGrupo.setFont(new Font("Ebrima", Font.BOLD, 13));
		textFieldGrupo.setColumns(10);
		textFieldGrupo.setBounds(119, 137, 215, 20);
		contentPane.add(textFieldGrupo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\cancelamento.png"));
		btnCancelar.setSelectedIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\cancelamento.png"));
		btnCancelar.setForeground(new Color(186, 85, 211));
		btnCancelar.setFont(new Font("Ebrima", Font.BOLD, 14));
		btnCancelar.setBounds(196, 182, 125, 40);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_3 = new JLabel("Inserir novo contacto");
		lblNewLabel_3.setFont(new Font("Ebrima", Font.PLAIN, 13));
		lblNewLabel_3.setForeground(new Color(186, 85, 211));
		lblNewLabel_3.setBounds(119, 11, 140, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// definir mensagem se os campos estiverem vazios
				if(textFieldNome.getText().trim().equals("")  || textFieldTelefone.getText().trim().equals("") || textFieldemail.getText().trim().equals("") || textFieldGrupo.getSelectedText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
				}else {
					// Guardar os dados inseridos pelo utilizador
					String nome = textFieldNome.getText();
					String telefone = textFieldTelefone.getText();
					String email = textFieldemail.getText();
					String grupo = textFieldGrupo.getText();
					
					GuardaContacto novoContacto = new GuardaContacto();
					// Vou declarar o metodo para procurar na classe procurar
					novoContacto.GuardaContactos(nome, telefone, email, grupo);
					
					
				}
			}
		});
		btnGuardar.setForeground(new Color(186, 85, 211));
		btnGuardar.setFont(new Font("Ebrima", Font.BOLD, 14));
		btnGuardar.setBounds(49, 182, 125, 40);
		contentPane.add(btnGuardar);
	}

}
