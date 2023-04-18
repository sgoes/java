package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class InserirCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNIF;
	private JTextField textFieldNomeCliente;
	private JTextField textFieldEmailCliente;
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
		setTitle("Inserir cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIF");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(49, 54, 50, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(49, 88, 50, 23);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(49, 118, 50, 23);
		contentPane.add(lblEmail);
		
		textFieldNIF = new JTextField();
		textFieldNIF.setBounds(99, 57, 147, 20);
		contentPane.add(textFieldNIF);
		textFieldNIF.setColumns(10);
		
		textFieldNomeCliente = new JTextField();
		textFieldNomeCliente.setColumns(10);
		textFieldNomeCliente.setBounds(99, 88, 147, 20);
		contentPane.add(textFieldNomeCliente);
		
		textFieldEmailCliente = new JTextField();
		textFieldEmailCliente.setColumns(10);
		textFieldEmailCliente.setBounds(99, 121, 147, 20);
		contentPane.add(textFieldEmailCliente);
		
		JButton btnNewButton = new JButton("Guardar cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldNIF.getText().trim().equals("") || textFieldNomeCliente.getText().trim().equals("") || textFieldEmailCliente.getText().trim().equals(""))
						{
					JOptionPane.showMessageDialog(null, "Os campos são de preenchimento obrigatório", "ERRO", JOptionPane.ERROR_MESSAGE);
				} else if(textFieldNIF.getText().length() != 9){
					JOptionPane.showMessageDialog(null, "O campo NIF tem que ter 9 algarismos", "ERRO", JOptionPane.ERROR_MESSAGE);
				}else {
					try {
						// converter o NIF para inteiro
						int NIF = Integer.parseInt(textFieldNIF.getText().trim());
						// criar o objeto novoCliente para aceder a toda a informação da classe cliente 
						novoCliente.BaseDadosClientes(NIF,  textFieldNomeCliente.getText().trim(), textFieldEmailCliente.getText().trim() );
						
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "O campo NIF tem que ser constítuido apenas por algarismos!", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		btnNewButton.setBounds(127, 182, 119, 45);
		contentPane.add(btnNewButton);
	}
	}
	

