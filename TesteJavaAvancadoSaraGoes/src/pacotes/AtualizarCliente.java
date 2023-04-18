package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AtualizarCliente extends JFrame {
	public AtualizarCliente() {
	}

	private JPanel contentPane;

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
	public Reparações() {
		JComboBox<String> comboBoxCC = new JComboBox<String>();
		comboBoxCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxCC.getSelectedIndex() != 0)
				{
					for(int i=0; i< Cliente.dadosCliente.size(); i++)
					{
						String[] linha = Cliente.dadosCliente.get(i).split(";");
						
						if(linha[0].equals(comboBoxCC.getSelectedItem()))
						{
							textFieldNomeCliente.setText(linha[1]);
							
						}
					}
				}
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				comboBoxCC.addItem("Escolha um cliente");
				
				
				for(int i=0; i< Cliente.dadosCliente.size(); i++)
				{
					String[] linha = Cliente.dadosCliente.get(i).split(";");
					
					comboBoxCC.addItem(linha[0]);
				}
				
				//vai colocar a combobox na posição inicial
				comboBoxCC.setSelectedIndex(0);
				
			}
		});
		setTitle("Nova Reparação");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 555, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Entrada");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(49, 38, 97, 15);
		contentPane.add(lblNewLabel);
		
		JDateChooser dateChooserDataEntrada = new JDateChooser();
		dateChooserDataEntrada.setBounds(164, 33, 149, 20);
		contentPane.add(dateChooserDataEntrada);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(55, 81, 91, 15);
		contentPane.add(lblNewLabel_1);
		
		JFormattedTextField formattedTextFieldMatricula = new JFormattedTextField();
		formattedTextFieldMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldMatricula.setBounds(166, 79, 147, 20);
		MaskFormatter novaMatricula = null;
		try {
			 novaMatricula = new MaskFormatter("??-##-??");
		}catch(Exception erro)
		{
			JOptionPane.showMessageDialog(null, "Matricula está no formato incorreto !", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		novaMatricula.install(formattedTextFieldMatricula);
		contentPane.add(formattedTextFieldMatricula);
		
		JLabel lblNewLabel_2 = new JLabel("CC Cliente");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(49, 125, 91, 14);
		contentPane.add(lblNewLabel_2);
		
		
		comboBoxCC.setBounds(164, 122, 149, 22);
		contentPane.add(comboBoxCC);
		
		JLabel lblNewLabel_3 = new JLabel("Nome Cliente");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(49, 167, 99, 14);
		contentPane.add(lblNewLabel_3);
		
		textFieldNomeCliente = new JTextField();
		textFieldNomeCliente.setEditable(false);
		textFieldNomeCliente.setBounds(164, 165, 149, 20);
		contentPane.add(textFieldNomeCliente);
		textFieldNomeCliente.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Folha de Serviço");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(111, 213, 147, 14);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox checkFiltros = new JCheckBox("Filtros");
		checkFiltros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkFiltros.isSelected() == true)
				{
					valor +=10;
					
				}
				else
				{
					valor -=10;
				}
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		checkFiltros.setBounds(49, 244, 60, 23);
		contentPane.add(checkFiltros);
		
		JCheckBox checkPastilhas = new JCheckBox("Pastilhas");
		checkPastilhas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkPastilhas.isSelected() == true)
				{
					valor +=25;
					
				}
				else
				{
					valor -=25;
				}
				
				textFieldValor.setText(Integer.toString(valor));
				
			}
		});
		checkPastilhas.setBounds(142, 244, 88, 23);
		contentPane.add(checkPastilhas);
		
		JCheckBox checkOleo = new JCheckBox("Óleo");
		checkOleo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(checkOleo.isSelected() == true)
				{
					valor +=150;
					
				}
				else
				{
					valor -=150;
				}
				
				textFieldValor.setText(Integer.toString(valor));
				
				
				
			}
		});
		checkOleo.setBounds(251, 244, 97, 23);
		contentPane.add(checkOleo);
		
		JCheckBox checkDiscos = new JCheckBox("Discos");
		checkDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkDiscos.isSelected() == true)
				{
					valor +=200;
					
				}
				else
				{
					valor -=200;
				}
				
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		checkDiscos.setBounds(49, 279, 75, 23);
		contentPane.add(checkDiscos);
		
		JCheckBox checkLavagens = new JCheckBox("Lavagens");
		checkLavagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(checkLavagens.isSelected() == true)
				{
					valor +=12;
					
				}
				else
				{
					valor -=12;
				}
				
				textFieldValor.setText(Integer.toString(valor));
			}
		});
		checkLavagens.setBounds(142, 279, 88, 23);
		contentPane.add(checkLavagens);
		
		JCheckBox checkPneus = new JCheckBox("Pneus");
		checkPneus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkPneus.isSelected() == true)
				{
					valor +=450;
					
				}
				else
				{
					valor -=450;
				}
				
				textFieldValor.setText(Integer.toString(valor));
				
			}
		});
		checkPneus.setBounds(253, 279, 75, 23);
		contentPane.add(checkPneus);
		
		textFieldValor = new JTextField();
		
		JButton btnNewButton = new JButton("Nova Entrada");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(dateChooserDataEntrada.getDate() == null || formattedTextFieldMatricula.getText().trim().equals("") || comboBoxCC.getSelectedIndex() == 0)
				{
					JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório !", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				else if(checkFiltros.isSelected() == false && checkPastilhas.isSelected() == false && checkOleo.isSelected() == false && checkDiscos.isSelected() == false && checkLavagens.isSelected() == false && checkPneus.isSelected() == false)
				{
					JOptionPane.showMessageDialog(null,"Deve selecionar pelo menos um serviço !" ,"ERRO", JOptionPane.ERROR_MESSAGE);
					
				}
				else
				{
				
					SimpleDateFormat novaData = new SimpleDateFormat("dd/MM/yyyy");
					
					String data = novaData.format(dateChooserDataEntrada.getDate());
					
					String serviço = "";
					
					if(checkFiltros.isSelected() == true)
					{
						serviço = "Filtros, ";
					}
					if(checkPastilhas.isSelected() == true)
					{
						serviço += "Pastilhas, ";
					}
					if(checkOleo.isSelected() == true)
					{
						serviço += "Óleo, ";
					}
					if(checkDiscos.isSelected() == true)
					{
						serviço += "Discos, ";
					}
					if(checkLavagens.isSelected() == true)
					{
						serviço += "Lavagens, ";
					}
					if(checkPneus.isSelected() == true)
					{
						serviço += "Pneus";
					}
					
						//serviço = serviço.s
				    
					JOptionPane.showMessageDialog(null, serviço + " " + serviço.length());
					
					int valor = Integer.parseInt(textFieldValor.getText());
					
					NovaEntrada enviarDados = new NovaEntrada();
					
					enviarDados.BaseDadosReparações(data, formattedTextFieldMatricula.getText().trim(),comboBoxCC.getSelectedItem().toString(),textFieldNomeCliente.getText(), serviço, valor);
					
					
					dateChooserDataEntrada.setCalendar(null);
					
					formattedTextFieldMatricula.setText("");
					 
					
					comboBoxCC.setSelectedIndex(0);
					
					textFieldNomeCliente.setText("");
					
					textFieldValor.setText("");
					
					serviço = "";
					
					checkFiltros.setSelected(false);
					checkPastilhas.setSelected(false);
					checkOleo.setSelected(false);
					checkDiscos.setSelected(false);
					checkLavagens.setSelected(false);
					checkPneus.setSelected(false);
					
				}
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(354, 16, 155, 232);
		contentPane.add(btnNewButton);
		
		
		textFieldValor.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldValor.setText("0");
		textFieldValor.setEditable(false);
		textFieldValor.setBounds(392, 280, 86, 20);
		contentPane.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(411, 259, 45, 14);
		contentPane.add(lblNewLabel_5);
	}
}
