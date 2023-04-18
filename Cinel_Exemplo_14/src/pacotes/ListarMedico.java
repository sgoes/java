package pacotes;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ListarMedico extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarMedico frame = new ListarMedico();
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
	public ListarMedico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\clinica.png"));
		setTitle("Listar Médico");
		JComboBox<String> comboBox = new JComboBox<String>();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {				
					try {
						FileReader ler = new FileReader("C:\\docs\\ficheiros\\medico.txt");
						BufferedReader dados = new BufferedReader(ler);
						
						while(dados.read() != -1)
						{
							String[] linha = dados.readLine().split(";");
							comboBox.addItem(linha[0]);
						}
						comboBox.setSelectedIndex(0);
						dados.close();
						ler.close();
					}catch(Exception erro)
					{
						JOptionPane.showMessageDialog(null, "Algo correu mal, contacte o administrador !", "Erro", JOptionPane.ERROR_MESSAGE);
					}
				}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha um médico"}));
		comboBox.setBounds(128, 34, 187, 22);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 90, 434, 171);
		contentPane.add(scrollPane);
		
		table = new JTable();
		DefaultTableModel tabela = new DefaultTableModel();
		String[] coluna = {"Utente", "Médico", "Especialidade", "Data Consulta"};
		tabela.setColumnIdentifiers(coluna);
		table.setModel(tabela);
		scrollPane.setViewportView(table);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// aqui o medico foi escolhido
				if(comboBox.getSelectedIndex() != 0) {
					tabela.setRowCount(0);
					try {
						FileReader ler = new FileReader("C:\\docs\\ficheiros\\marcarConsultas.txt"); 
						BufferedReader dados = new BufferedReader(ler); 
						
						while(dados.read() != -1) {
					
							String[] linha = dados.readLine().split(";");
							//JOptionPane.showMessageDialog(null, linha[1] + " " + comboBox.getSelectedItem());
							String aux = comboBox.getSelectedItem().toString();
							
							if(aux.trim().equals(linha[1].trim())) {
								tabela.addRow(linha);
							}
							
							
						}
						}catch(Exception erro) {
							JOptionPane.showMessageDialog(null, "Algo correu mal, contacte o administrador !", "Erro", JOptionPane.ERROR_MESSAGE);
						}
				}
				
			}
		});
		
		
	}
}
