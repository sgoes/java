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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InserirCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNIF;
	private JTextField textFieldNomeCliente;
	private JTextField textFieldEmailCliente;
	
	// criação do objeto para manipular a classe cliente
	Cliente novoCliente = new Cliente();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirCliente frame = new InserirCliente();
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
	public InserirCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_cars\\imagens\\carro.png"));
		setTitle("Inserir Cliente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 364, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIF");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 52, 54, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserir novo cliente");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNewLabel_1.setBounds(108, 11, 147, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNome.setBounds(46, 82, 54, 19);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_2_1 = new JLabel("E-mail");
		lblNewLabel_2_1.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(46, 112, 54, 19);
		contentPane.add(lblNewLabel_2_1);
		
		textFieldNIF = new JTextField();
		textFieldNIF.setBounds(99, 53, 184, 20);
		contentPane.add(textFieldNIF);
		textFieldNIF.setColumns(10);
		
		textFieldNomeCliente = new JTextField();
		textFieldNomeCliente.setColumns(10);
		textFieldNomeCliente.setBounds(99, 83, 184, 20);
		contentPane.add(textFieldNomeCliente);
		
		textFieldEmailCliente = new JTextField();
		textFieldEmailCliente.setColumns(10);
		textFieldEmailCliente.setBounds(99, 113, 184, 20);
		contentPane.add(textFieldEmailCliente);
		
		JButton btnGuardarCliente = new JButton("Guardar Cliente");
		btnGuardarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldNIF.getText().trim().equals("")|| textFieldNomeCliente.getText().trim().equals("") || textFieldEmailCliente.getText().trim().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório!", "ERRO", JOptionPane.ERROR_MESSAGE);
					
				}else if (textFieldNIF.getText().length() != 9) {
					
					JOptionPane.showMessageDialog(null, "O campo NIF tem de ser composto por 9 algarismos", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				// verificação se temos apenas algarismos (não pode conter letras)
				else {
					try {
						// converter o NIF para inteiro
						int NIF = Integer.parseInt(textFieldNIF.getText().trim());
						// temos de verificar se o NIF já existe de forma a não repetir clientes, esta verificação é feita na classe Cliente
						
						// agora pego nos dados mando para a classe cliente, e é na classe cliente que vou verificar se os dados já existem ou não
						// objeto criado no topo desta class, este objeto permite enviar os dados para a class Cliente
						novoCliente.BaseDadosClientes(NIF, textFieldNomeCliente.getText().trim(),textFieldEmailCliente.getText().trim());
						
						
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "O campo NIF tem de ser constituído apenas por algarismos!", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnGuardarCliente.setFont(new Font("Ebrima", Font.PLAIN, 13));
		btnGuardarCliente.setBounds(108, 163, 147, 53);
		contentPane.add(btnGuardarCliente);
	}
}
