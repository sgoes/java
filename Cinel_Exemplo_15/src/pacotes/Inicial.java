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
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Inicial extends JFrame {

	private JPanel contentPane;

	FicheiroCliente ligacao = new FicheiroCliente();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				ligacao.LerFicheiroCliente();
				
				
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\imagens_cars\\mecanico_oficinal.png"));
		setTitle("CINEL CARS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 568, 366);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ficheiro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair da aplicação", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
				if (resposta == 0) {
					
					// metodo para garantir que estou a guardar os dados no ficheiro
					ligacao.EscreverFicheiroCliente();
					System.exit(0);
				}
				
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\sair.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Inserir Cliente");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InserirCliente abrir = new InserirCliente();
				abrir.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\adicionar-usuario.png"));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Atualizar Cliente");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AtualizarCliente open = new AtualizarCliente();
				// abrir a janela e tornar a janela visivel
				open.setVisible(true);
				
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\atualizar.png"));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Reparações");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Nova Entrada");
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\editar.png"));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_3 = new JMenu("Listagens");
		mnNewMenu_2.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Cliente");
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\procura-de-emprego.png"));
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Data");
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\procurar.png"));
		mnNewMenu_3.add(mntmNewMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\trabalhador-de-servico-de-carro-muscular-reparando-o-veiculo.jpg"));
		lblNewLabel.setBounds(0, 0, 552, 305);
		contentPane.add(lblNewLabel);
	}
}
