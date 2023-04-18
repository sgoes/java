package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NovoMedico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeMedico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovoMedico frame = new NovoMedico();
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
	public NovoMedico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\clinica.png"));
		setTitle("Inserir Medico");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do médico");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(60, 55, 125, 14);
		contentPane.add(lblNewLabel);
		
		textFieldNomeMedico = new JTextField();
		textFieldNomeMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNomeMedico.setBounds(195, 52, 162, 20);
		contentPane.add(textFieldNomeMedico);
		textFieldNomeMedico.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Especialidade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(60, 93, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBoxEspecialidade = new JComboBox();
		comboBoxEspecialidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxEspecialidade.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma opção", "Clínica Geral", "Obstreta", "Pediatra", "Oftamologista", "Cardiologiasta", "Genicologista", "Psicologia"}));
		comboBoxEspecialidade.setBounds(195, 89, 162, 22);
		contentPane.add(comboBoxEspecialidade);
		
		JButton btnNewButton = new JButton("Guardar Dados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldNomeMedico.getText().trim().equals("") || comboBoxEspecialidade.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "O nome do médico tem de ser inserido");
				}else {
					// Guardar os dados que são inseridos pelo user
					
					String medico = textFieldNomeMedico.getText();
					String especialidade = comboBoxEspecialidade.getSelectedItem().toString();
					
					// Criação do objeto para ligar a classe consulta
					Medicos novoMedico = new Medicos();
					
					//chama o método da classe medicos e passa atributos
					novoMedico.MedicoInserir(medico, especialidade);
				}
				
				// Limpar os campos após a inserção de dados
				textFieldNomeMedico.setText("");
				comboBoxEspecialidade.setSelectedIndex(0);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(140, 148, 183, 52);
		contentPane.add(btnNewButton);
	}
}
