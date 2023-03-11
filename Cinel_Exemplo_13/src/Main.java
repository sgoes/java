import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\demonstracao-na-loja.png"));
		setTitle("CINEL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 642, 31);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ficheiro");
		mnNewMenu.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\folder.png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\sair.jpg"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Encomendas");
		mnNewMenu_1.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\encomenda.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Procurar");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\procurar.jpg"));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarEncomendas abrirJanela = new ListarEncomendas();
				abrirJanela.setVisible(true);
				
			}
			
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\listar.jpg"));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Inserir encomendas");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// criacao do objeto
				InserirEncomendas abrirJanela = new InserirEncomendas();
				
				//abrirjanela
				abrirJanela.setVisible(true);
			}
		});
		menuBar.add(mntmNewMenuItem_3);
	}
}
