package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Principal extends JFrame {

	private JPanel contentPane;

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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\clinica.png"));
		setTitle("CINEL Clinic");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 576, 427);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ficheiro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Perguntar ao user se tem a certeza que quer sair 
				int resposta = JOptionPane.showConfirmDialog(null, "Tem a certeza que quer sair?", "Informação", JOptionPane.INFORMATION_MESSAGE);
				
				if(resposta == 0) {
					JOptionPane.showMessageDialog(null, "See you later alligator!", "Informação", JOptionPane.CLOSED_OPTION);
					System.exit(0);
				}else {
					/////// ver 
				}
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\exit.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Consultas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Marcar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MarcarConsultas open = new MarcarConsultas();
				open.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\consulta-medica.png"));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Marcar II");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MarcarConsultaII open = new MarcarConsultaII();
				open.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\consulta-medica.png"));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Médicos");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Novo Médico");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Para deixar o itemMenu habilitado
				NovoMedico open = new NovoMedico();
				open.setVisible(true);
				
				
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\medico.png"));
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_3 = new JMenu("Listagens");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Consultas");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarConsultas open = new ListarConsultas();
				open.setVisible(true);
				
				
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\consulta-de-pesquisa.png"));
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Médico");
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\medico.png"));
		mnNewMenu_3.add(mntmNewMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_14\\src\\imagens\\Workforce Report 1200x666.jpg"));
		lblNewLabel.setBounds(0, 11, 563, 344);
		contentPane.add(lblNewLabel);
	}
}
