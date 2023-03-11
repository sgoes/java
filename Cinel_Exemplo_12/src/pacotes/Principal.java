package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeCliente;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	//criação do objeto para ligar ao objeto clientes
	Clientes novoCliente = new Clientes();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Cliente");
		lblNewLabel.setFont(new Font("Ebrima", Font.PLAIN, 14));
		lblNewLabel.setBounds(70, 64, 93, 29);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 746, 29);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ficheiro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("SAIR");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_1);
		
		// ADICIONAR DADOS À LISTA
		// listaClientes é um objeto
		DefaultListModel<String> listaClientes = new DefaultListModel<String>();
		
		// vai permitir-me inserir dados 
		JList<String> list = new JList<String>(listaClientes);
				
		JList llist = new JList();
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ver dados");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listaClientes.removeAllElements();
				// percorrer o dados da minha JList
				// se nao tiver dados
				if(novoCliente.baseDados.size() == 0) {
					JOptionPane.showConfirmDialog(null, "Não existem dados para serem apresentados");
				}else {
					// agora vou percorrer o meu arrayList e guardar os dados na minha lista
					for( int i = 0; i < novoCliente.baseDados.size(); ++i) {
						listaClientes.addElement(novoCliente.baseDados.get(i));
					}
				}
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Localidade");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// criar evento que diga quantos clientes existem de uma determinada localidade
				int count = 0;
				String opcao = JOptionPane.showInputDialog("Indique a localidade dos clientes que deseja saber o total");
				
				for(String linha:novoCliente.baseDados) {
					if(linha.contains(opcao)) {
						count++;
					}
					JOptionPane.showMessageDialog(null, "Existem" + count + " Cliente(s) em" + opcao + "!");
				}
				
				

			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Total");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				novoCliente.TotalClientesGuardados();
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		textFieldNomeCliente = new JTextField();
		textFieldNomeCliente.setBounds(162, 70, 178, 20);
		contentPane.add(textFieldNomeCliente);
		textFieldNomeCliente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Localidade");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(80, 117, 83, 20);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBoxLocalidade = new JComboBox();
		comboBoxLocalidade.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma opção:", "Porto", "Lisboa", "Funchal", "Coimbra", "Faro"}));
		comboBoxLocalidade.setBounds(163, 118, 177, 22);
		contentPane.add(comboBoxLocalidade);
		
		JLabel lblNewLabel_2 = new JLabel("Género");
		lblNewLabel_2.setFont(new Font("Ebrima", Font.PLAIN, 14));
		lblNewLabel_2.setToolTipText("Género");
		lblNewLabel_2.setBounds(102, 164, 61, 29);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton radioMasculino = new JRadioButton("Masculino");
		buttonGroup.add(radioMasculino);
		radioMasculino.setFont(new Font("Ebrima", Font.PLAIN, 14));
		radioMasculino.setBounds(159, 167, 100, 23);
		contentPane.add(radioMasculino);
		
		JRadioButton radioFeminino = new JRadioButton("Feminino");
		buttonGroup.add(radioFeminino);
		radioFeminino.setFont(new Font("Ebrima", Font.PLAIN, 14));
		radioFeminino.setBounds(264, 167, 109, 23);
		contentPane.add(radioFeminino);
		
		JButton btnNewButton = new JButton("Submeter Dados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome, localidade, genero;
				
				
				// se a minha caixa de nome estiver vaziar ou o combo box da localidade tambem estiver vazio ... do this
				if(textFieldNomeCliente.getText().trim().equals("") || comboBoxLocalidade.getSelectedIndex() == 0) {
					
					JOptionPane.showMessageDialog(null, "Os campos são preenchimento obrigatório");
					
					// se o radioFem e o radio Masc não estiveram selecionados aparece a mensagem "atenção ao genero
				} else if (radioFeminino.isSelected() == false && radioMasculino.isSelected() == false) {
					JOptionPane.showConfirmDialog(null, "Atenção ao género!");
					
				// o else vai ser responsável por colectar os valores inseridos pelo utilizador	
				}else {
					// o nome que estiver no textFieldNomeCliente vem para aqui
					nome = textFieldNomeCliente.getText();
					
					// toString serve para converter em texto
					// a var localidade vai receber o valor que foi selecionado na comboBox
					localidade = comboBoxLocalidade.getSelectedItem().toString();
					
					// tenho de ver qual é a que está selecionada
					if(radioFeminino.isSelected() == true) {
						genero = "Feminino";
					}else {
						genero = "Masculino";
					}
					
					//JOptionPane.showConfirmDialog(null, "Nome: " + nome + "\nLocalidade: " + localidade + "\nGénero: " + genero);
					
					// chamei o objeto para se ligar à classe cliente, com os atributos aqui selecionados (da classe principal)
					novoCliente.GuardarDadosClientes(nome, localidade, genero);
					
				}
				
				
				// LIMPAR CAMPOS DEPOIS DO PRENCHIMENTO - LIMPAR TEXTFIELD - LIMPAR COMBOBOX - LIMPAR RADIO BUTTON
				textFieldNomeCliente.setText("");
				
				comboBoxLocalidade.setSelectedIndex(0);
				
				buttonGroup.clearSelection();
				
				
			}
		});
		btnNewButton.setFont(new Font("Ebrima", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(186, 85, 211));
		btnNewButton.setBounds(112, 204, 199, 48);
		contentPane.add(btnNewButton);
		
		list.setBounds(422, 64, 251, 188);
		contentPane.add(list);
		
		JLabel lblNewLabel_3 = new JLabel("Dados dos clientes guardados");
		lblNewLabel_3.setFont(new Font("Ebrima", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(435, 40, 228, 14);
		contentPane.add(lblNewLabel_3);
	}
}
