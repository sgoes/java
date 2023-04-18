package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class Procurar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeProcurar;
	private JTextField textFieldTelefoneProcurar;
	private JTextField textFieldEmailProcurar;
	private JTextField textFieldGrupoProcurar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Procurar frame = new Procurar();
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
	public Procurar() {
		setTitle("Procurar - Nome");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_editora\\imagens\\contacts.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(186, 85, 211));
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel.setBounds(45, 64, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setForeground(new Color(186, 85, 211));
		lblNewLabel_1.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel_1.setBounds(45, 104, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setForeground(new Color(186, 85, 211));
		lblNewLabel_1_1.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(45, 145, 78, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Grupo: ");
		lblNewLabel_1_1_1.setForeground(new Color(186, 85, 211));
		lblNewLabel_1_1_1.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(45, 181, 78, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textFieldNomeProcurar = new JTextField();
		textFieldNomeProcurar.setBounds(112, 62, 211, 20);
		contentPane.add(textFieldNomeProcurar);
		textFieldNomeProcurar.setColumns(10);
		
		textFieldTelefoneProcurar = new JTextField();
		textFieldTelefoneProcurar.setEditable(false);
		textFieldTelefoneProcurar.setColumns(10);
		textFieldTelefoneProcurar.setBounds(112, 102, 211, 20);
		contentPane.add(textFieldTelefoneProcurar);
		
		textFieldEmailProcurar = new JTextField();
		textFieldEmailProcurar.setEditable(false);
		textFieldEmailProcurar.setColumns(10);
		textFieldEmailProcurar.setBounds(112, 143, 211, 20);
		contentPane.add(textFieldEmailProcurar);
		
		textFieldGrupoProcurar = new JTextField();
		textFieldGrupoProcurar.setEditable(false);
		textFieldGrupoProcurar.setColumns(10);
		textFieldGrupoProcurar.setBounds(112, 179, 211, 20);
		contentPane.add(textFieldGrupoProcurar);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProcurar.setForeground(new Color(186, 85, 211));
		btnProcurar.setBounds(162, 227, 89, 23);
		contentPane.add(btnProcurar);
	}

}
