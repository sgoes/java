package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

public class MarcarConsultaII extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeUtente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarcarConsultaII frame = new MarcarConsultaII();
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
	public MarcarConsultaII() {
		// ELEMENTO CORTADO E COLOCADO AQUI - acrescentou-se "STRING"
		JComboBox<String> comboBoxEspecialidade = new JComboBox<String>();
		// ELEMENTO CORTADO E COLOCADO AQUI
		JComboBox<String> comboBoxMedico = new JComboBox<String>();
		comboBoxEspecialidade.addPropertyChangeListener(new PropertyChangeListener() {
			
			// este método não faz sentido 
			public void propertyChange(PropertyChangeEvent evt) {
				
				//JOptionPane.showMessageDialog(null, "Estou aqui!!");
			}
		});
		comboBoxEspecialidade.addItemListener(new ItemListener() {
			
			// estivemos a testar outros eventos associados à comboBox especialidade
			public void itemStateChanged(ItemEvent e) {
				
				//JOptionPane.showMessageDialog(null, "Estou aqui!!");
				
			}
		});
		comboBoxEspecialidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Apenas so para testar que quando abro a comboBox acontece alguma coisa
				//JOptionPane.showMessageDialog(null, "Estou aqui!!");
				
				if(comboBoxEspecialidade.getSelectedIndex() == 0)
				{
					comboBoxMedico.removeAllItems();
					comboBoxMedico.insertItemAt("Defina uma Especialidade", 0);
				}
				else
				{
					comboBoxMedico.removeAllItems();
					comboBoxMedico.insertItemAt("Escolha um Médico", 0);
					try {
						
						FileReader ler = new FileReader("C:\\docs\\ficheiros\\medico.txt");
						
						BufferedReader dados = new BufferedReader(ler);
						
						while(dados.read() != -1)
						{
							String[] linha = dados.readLine().split(";");
							
							//JOptionPane.showMessageDialog(null, linha[1]);
							
							//comboBoxEspecialidade.addItem(linha[1]);
							
							if(linha[1].equals(comboBoxEspecialidade.getSelectedItem()))
							{
								comboBoxMedico.addItem(linha[0]);
							}
							
						}
						dados.close();
						ler.close();
					}catch(Exception erro)
					{
						JOptionPane.showMessageDialog(null, "Algo correu mal, contacte o administrador !", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
				
				// definir a posição que vai estar selecionada
				comboBoxMedico.setSelectedIndex(0);
				
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				// Quando a minha janela é aberta é para isto que esta janela serve
				//JOptionPane.showMessageDialog(null, "Estou aqui!!");
				
				 // Vou dizer que o meu primeiro item da comboBox é para escolher uma opção
comboBoxEspecialidade.addItem("Escolha uma Especialidade");
				
				try {
					
					FileReader ler = new FileReader("C:\\docs\\ficheiros\\medico.txt");
					
					BufferedReader dados = new BufferedReader(ler);
					
					while(dados.read() != -1)
					{
						String[] linha = dados.readLine().split(";");
						
						//JOptionPane.showMessageDialog(null, linha[1]);
						
						//esta variável tem o intuito de controlar a existencia da especialidade na comboBox
						int aux = 0;
						
						for(int i = 0; i < comboBoxEspecialidade.getItemCount(); i++)
						{
							
							comboBoxEspecialidade.setSelectedIndex(i);
							if(comboBoxEspecialidade.getSelectedItem().equals(linha[1]))
							{
								//ao mudar de estado, estou a dizer que a especialidade já existe na comboBox
								aux = 1;
							}
								
						}
						if(aux == 0)
						{
							comboBoxEspecialidade.addItem(linha[1]);
						}
						
						
						comboBoxEspecialidade.setSelectedIndex(0);
						//comboBoxEspecialidade.addItem(linha[1]);
						
					}
					
					dados.close();
					ler.close();
				}catch(Exception erro)
				{
					JOptionPane.showMessageDialog(null, "Algo correu mal, contacte o administrador !", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		setTitle("Marcar Consulta II");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\clinica.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Utente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 36, 126, 17);
		contentPane.add(lblNewLabel);
		
		textFieldNomeUtente = new JTextField();
		textFieldNomeUtente.setBounds(136, 36, 241, 20);
		contentPane.add(textFieldNomeUtente);
		textFieldNomeUtente.setColumns(10);
		
		
		comboBoxEspecialidade.setBounds(136, 78, 241, 22);
		contentPane.add(comboBoxEspecialidade);
		
		JLabel lblNewLabel_1 = new JLabel("Especialidade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(28, 80, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome do Médico:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 111, 126, 14);
		contentPane.add(lblNewLabel_2);
		
		
		comboBoxMedico.setModel(new DefaultComboBoxModel(new String[] {"Defina uma especialidade"}));
		comboBoxMedico.setBounds(136, 111, 241, 22);
		contentPane.add(comboBoxMedico);
		
		JButton btnNewButton = new JButton("Ver Leitura");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// o botão foi criado para verificar se está tudo ok
				// vou então ligar-me aos meus médicos, chamar o método
				Medicos ler = new Medicos();
				// chamo o médico
				ler.LerDadosFicheiro();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnNewButton.setBounds(198, 0, 93, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Data da consulta: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 141, 126, 14);
		contentPane.add(lblNewLabel_3);
		
		
		// VER SE ISTO ESTÁ ANTES - IMPORTANTE
		JDateChooser dateChooserConsulta = new JDateChooser();
		dateChooserConsulta.setBounds(136, 144, 241, 20);
		contentPane.add(dateChooserConsulta);
		
		
		// ==================== METODO PARA O BOTÃO================================== METODO PARA O BOTAO
		/*
		 * 1. VERIFICAR SE TODOS OS CAMPOS ESTÃO PREENCHIDOS
		 * 2. CASO ESTEJAM - GUARDAR OS DADOS NAS RESPETIVAS VARIAVEIS
		 * */
		JButton btnNewButton_1 = new JButton("Marcar Consulta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// se os campos Nome do utente e Nome do medico estiverem sozinhas --- basta um deles não estar preenchido
				if(textFieldNomeUtente.getText().trim().equals("") || comboBoxEspecialidade.getSelectedIndex() == 0 || comboBoxMedico.getSelectedIndex() == 0 || dateChooserConsulta.getDate() == null){
					JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório",  "Aviso", JOptionPane.WARNING_MESSAGE);
				}else {
					//JOptionPane.showMessageDialog(null, dateChooser.getDate());
					
					// Definição da formatação pretendida para a data
					SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
					
					// Formatação da data que é escolhida através do interface e guardar a dada inserida pelo user 
					String data = dataFormatada.format(dateChooserConsulta.getDate());
					
					// Guardar os dados que sao inseridos pelo user
					String utente = textFieldNomeUtente.getText();
					
					String especialidade = comboBoxEspecialidade.getSelectedItem().toString();
					
					String medico = comboBoxMedico.getSelectedItem().toString();
					
					// criação do objeto para ligar a classe Consulta
					Consulta novaConsulta = new Consulta();
					novaConsulta.MarcarConsulta2(utente, medico, especialidade, data);
					
					//JOptionPane.showMessageDialog(null, "Marcação realizada com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
				}
				
				// Limpar os campos após a insercao de dados
				textFieldNomeUtente.setText("");
				comboBoxMedico.setSelectedIndex(0);
				comboBoxEspecialidade.setSelectedIndex(0);
				dateChooserConsulta.setCalendar(null);
				
			}
		});
			
		btnNewButton_1.setForeground(new Color(186, 85, 211));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(87, 180, 251, 42);
		contentPane.add(btnNewButton_1);
	}
}
