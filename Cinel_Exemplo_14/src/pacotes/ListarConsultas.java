package pacotes;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class ListarConsultas extends JFrame {

	private JPanel contentPane;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarConsultas frame = new ListarConsultas();
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
	public ListarConsultas() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\clinica.png"));
		setResizable(false);
		setTitle("Listagem das Consultas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setBounds(0, 0, 434, 261);
		contentPane.add(scrollPane);
		
		
		table = new JTable();
		// criar os cabeçalhos da minha tabela 
		DefaultTableModel tabela = new DefaultTableModel();
		String[] coluna = {"Utente", "Médico", "Especialidade", "Data Consulta"};
		tabela.setColumnIdentifiers(coluna);
		table.setModel(tabela);
		
		scrollPane.setViewportView(table);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				//JOptionPane.showMessageDialog(null, "Estou aqui!");
				try {
					FileReader ler = new FileReader("C:\\docs\\ficheiros\\marcarConsultas.txt"); 
					BufferedReader dados = new BufferedReader(ler); 
					
					while(dados.read() != -1) {
				
						String[] linha = dados.readLine().split(";");
						//JOptionPane.showMessageDialog(null, linha[1]); 
						tabela.addRow(linha);
						
					}
					}catch(Exception erro) {
				
					}
				} 
		});
	}
}
