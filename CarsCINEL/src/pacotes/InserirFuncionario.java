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

public class InserirFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeFunc;
	private JTextField textFieldCodFunc;
	
	// criação do objeto que envia os dados desta para a class funcionarios
	Funcionarios novoFuncionario = new Funcionarios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirFuncionario frame = new InserirFuncionario();
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
	public InserirFuncionario() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_cars\\imagens\\carro.png"));
		setTitle("Inserir Funcionario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 343, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserir novo funcionário");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNewLabel.setBounds(90, 23, 171, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel_1.setBounds(31, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Código");
		lblNewLabel_1_1.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(31, 106, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldNomeFunc = new JTextField();
		textFieldNomeFunc.setBounds(90, 65, 208, 20);
		contentPane.add(textFieldNomeFunc);
		textFieldNomeFunc.setColumns(10);
		
		textFieldCodFunc = new JTextField();
		textFieldCodFunc.setColumns(10);
		textFieldCodFunc.setBounds(90, 104, 208, 20);
		contentPane.add(textFieldCodFunc);
		
		JButton btnGuardarFunc = new JButton("Guardar funcionário");
		btnGuardarFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldNomeFunc.getText().trim().equals("") || textFieldCodFunc.getText().trim().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório", "ERRO", JOptionPane.ERROR_MESSAGE);
					
				}else if (textFieldCodFunc.getText().length()!=6) {
					
					JOptionPane.showMessageDialog(null, "O campo Codigo tem de ser composto por 6 algarismos", "ERRO", JOptionPane.ERROR_MESSAGE);
				}else {
					try {
						// Converter o Codigo para inteiro
						int Codigo = Integer.parseInt(textFieldCodFunc.getText().trim());
					
					// efetuar verficação do Codigo, se já existe, e é na classe Funcionarios que vou proceder a essa verificacao.
			// Criar o objeto no topo desta classe que permite enviar os dados desta para a class Funcionarios
					
					novoFuncionario.BaseDadosFuncionarios(Codigo, textFieldNomeFunc.getText().trim());
					
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "Contacte o administrador", "Erro", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnGuardarFunc.setFont(new Font("Ebrima", Font.PLAIN, 13));
		btnGuardarFunc.setBounds(100, 135, 149, 48);
		contentPane.add(btnGuardarFunc);
	}

}
