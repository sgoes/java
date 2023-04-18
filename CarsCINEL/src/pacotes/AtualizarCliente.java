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

public class AtualizarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeCliente;
	private JTextField textFieldEmailCliente;
	int posicao = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarCliente frame = new AtualizarCliente();
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
	public AtualizarCliente() {
		// Tive que colocar o <String> na comboBox // voi necessario cortar de baixo e trazê-la para aqui, a linha do textFieldNome e a linha do textFieldEmail
				JComboBox<String> comboBoxNIF = new JComboBox<String>();
				textFieldNomeCliente = new JTextField();
				textFieldEmailCliente = new JTextField();
				comboBoxNIF.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						// Atraves deste evento vou conseguir visualizar os restantes dados do Cliente nos outros textFields
						if(comboBoxNIF.getSelectedIndex() != 0) {
							for(int i = 0; i < Cliente.dadosCliente.size(); i++) {
								String[] linha = Cliente.dadosCliente.get(i).split(";");
								
								// comparar e fazer match quando encontrar
								if(linha[0].equals(comboBoxNIF.getSelectedItem())) {
									textFieldNomeCliente.setText(linha[1]);
									textFieldEmailCliente.setText(linha[2]);
									
									// vai ser util para quando quiser apontar para a linha que quero alterar
									posicao = i;
								}
							}
						}
						
					}
				});
				// Atribuir ao botão "atualizar clientes" o evento que guarda, está mais abaixo
				
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				// Este é o primeiro item que quero que apareça na minha comoboBox
				comboBoxNIF.addItem("Escolha um cliente");
				// De seguida tenho de ir buscar os outros
				for(int i = 0; i < Cliente.dadosCliente.size(); i++) {
					 // preciso ver que quando guardamos os dados, guardamos em formato linha, é necessário fazer o split
					String[] linha = Cliente.dadosCliente.get(i).split(";");
					// depois de separadados adiciono a minha comboBox
					comboBoxNIF.addItem(linha[0]);
				}
				// Para "zerar" a comboBox na posicao inicial
				comboBoxNIF.setSelectedIndex(0);
				
				// No menu --> atualizar cliente --> é necessário dar o evento que abre a janela: 1ºCriar o objeto e depois atribuir o setVisible
				//  Na comboBoxNIF é necessário dar o evento que permite que quando o item é selecionado mostrar nos outros textFields os dados dos clientes actionPerformed(ActionEvent e)
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_cars\\imagens\\carro.png"));
		setTitle("Atualizar Dados Cliente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 409, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIF Cliente");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNewLabel.setBounds(30, 48, 78, 14);
		contentPane.add(lblNewLabel);
		
		
		
		comboBoxNIF.setBounds(137, 45, 181, 22);
		contentPane.add(comboBoxNIF);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeCliente.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblNomeCliente.setBounds(30, 88, 84, 14);
		contentPane.add(lblNomeCliente);
		
		
		textFieldNomeCliente.setBounds(137, 86, 181, 20);
		contentPane.add(textFieldNomeCliente);
		textFieldNomeCliente.setColumns(10);
		
		JLabel lblEmailCliente = new JLabel("Email Cliente");
		lblEmailCliente.setFont(new Font("Ebrima", Font.BOLD, 13));
		lblEmailCliente.setBounds(30, 126, 84, 14);
		contentPane.add(lblEmailCliente);
		
		
		textFieldEmailCliente.setColumns(10);
		textFieldEmailCliente.setBounds(137, 124, 181, 20);
		contentPane.add(textFieldEmailCliente);
		
		JButton btnAtualizarDadosCliente = new JButton("Atualizar Dados Cliente");
		btnAtualizarDadosCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxNIF.getSelectedIndex() == 0 || textFieldNomeCliente.getText().trim().equals("") || textFieldEmailCliente.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Os campos são de preenchimento obrigatório!", "ERRO", JOptionPane.ERROR_MESSAGE);
				}else {
					String linha = comboBoxNIF.getSelectedItem() + ";" + textFieldNomeCliente.getText().trim() + ";" + textFieldEmailCliente.getText().trim();
					
					// atualizar na mesma linha onde os dados foram alterados
					//JOptionPane.showInternalMessageDialog(null, Cliente.dadosCliente.get(comboBoxNIF.getSelectedIndex() - 1) + " " + (comboBoxNIF.getSelectedIndex() - 1));
					Cliente.dadosCliente.set(posicao, linha);
					JOptionPane.showMessageDialog(null, "Os dados foram atualizados com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
				}
				
				textFieldNomeCliente.setText("");
				textFieldEmailCliente.setText("");
				comboBoxNIF.setSelectedIndex(0);
				
				
			}
		});
		btnAtualizarDadosCliente.setBounds(54, 172, 264, 54);
		contentPane.add(btnAtualizarDadosCliente);
	}
}
