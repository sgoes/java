package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeFuncionario;
	int posicao = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarFuncionario frame = new AtualizarFuncionario();
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
	public AtualizarFuncionario() {
		
		JComboBox<String> comboBoxAtualizarFuncionario = new JComboBox<String>();
		textFieldNomeFuncionario = new JTextField();
		
		//Evento para a comboBox
		comboBoxAtualizarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxAtualizarFuncionario.getSelectedIndex() != 0) {
					for(int i = 0; i < Funcionarios.dadosFuncionario.size(); i++) {
						String[] linha = Funcionarios.dadosFuncionario.get(i).split(";");
						
						// comparar e faze match quando encontrar
						if(linha[0].equals(comboBoxAtualizarFuncionario.getSelectedItem())) {
							textFieldNomeFuncionario.setText(linha[1]);
							
							posicao = i;
						}
						
					}
				}
				
				
			}
		});
		

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				// O primeiro item que vai aparecer na comboBox
				comboBoxAtualizarFuncionario.addItem("Escolha um funcionário");
				// Ler os funcionarios existentes
				for(int i = 0; i<Funcionarios.dadosFuncionario.size(); i++) {
					String[] linha = Funcionarios.dadosFuncionario.get(i).split(";");
					// após estarem separados adiciono à comboBox
					comboBoxAtualizarFuncionario.addItem(linha[0]);
				}
				
				// zerar comboBox
				comboBoxAtualizarFuncionario.setSelectedIndex(0);
				
				// No menu --> Atualizar Funcionario menuItem é preciso atribuir a ação para abrir a janela, 1ºobjeto, depois setVisible
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_cars\\imagens\\carro.png"));
		setTitle("Atualizar Dados Funcionário");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 412, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código Funcionario");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel.setBounds(40, 49, 127, 14);
		contentPane.add(lblNewLabel);
		
		
		comboBoxAtualizarFuncionario.setBounds(177, 46, 127, 22);
		contentPane.add(comboBoxAtualizarFuncionario);
		
		JLabel lblNomeFuncionario = new JLabel("Nome Funcionário");
		lblNomeFuncionario.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNomeFuncionario.setBounds(40, 93, 127, 14);
		contentPane.add(lblNomeFuncionario);
		
		
		textFieldNomeFuncionario.setBounds(177, 91, 127, 20);
		contentPane.add(textFieldNomeFuncionario);
		textFieldNomeFuncionario.setColumns(10);
		
		JButton btnAtualizarDadosFuncionario = new JButton("Atualizar Dados Funcionário");
		btnAtualizarDadosFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxAtualizarFuncionario.getSelectedIndex() == 0 || textFieldNomeFuncionario.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Os campos são de preenchimento brigatorio", "ERRO",JOptionPane.ERROR_MESSAGE);
				}else {
					String linha = comboBoxAtualizarFuncionario.getSelectedItem() + ";" + textFieldNomeFuncionario.getText().trim();
					Funcionarios.dadosFuncionario.set(posicao,  linha);
					JOptionPane.showMessageDialog(null, "Os dados foram atualizados com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				textFieldNomeFuncionario.setText("");
				comboBoxAtualizarFuncionario.setSelectedIndex(0);
				
			}
		});
		btnAtualizarDadosFuncionario.setBounds(51, 132, 274, 41);
		contentPane.add(btnAtualizarDadosFuncionario);
	}

}
