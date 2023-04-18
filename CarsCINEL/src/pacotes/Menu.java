package pacotes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	
	// objeto para criar a licagao ao ficheiroCliente // é preciso fazer o mesmo para os outros ficheiros 
	FicheiroCliente ligacao = new FicheiroCliente();
	FicheiroFuncionarios ligacaoFunc = new FicheiroFuncionarios();
	FicheiroAluguer ligacaoAluguer = new FicheiroAluguer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				ligacao.LerFicheiroCliente();
				ligacaoFunc.LerFicheiroFuncionario();
				ligacaoAluguer.LerFicheiroAluguer();
				
			}
		});
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_cars\\imagens\\carro.png"));
		setTitle("CINEL Cars");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 477, 360);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ficheiro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair da aplicação", "Aviso", JOptionPane.YES_NO_OPTION);
				if(resposta == 0)
				{
					// no topo desta classe está o objeto criado, preciso disto para quando fechar o programa, seja gravado os clientes que existem
					ligacao.EscreverFicheiroCliente();
					ligacaoFunc.EscreverFicheiroFuncionarios();
					ligacaoAluguer.EscreverFicheiroAluguer();
					System.exit(0);
				}
				
			}
		});
		mntmSair.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\sair.png"));
		mnNewMenu.add(mntmSair);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmInserirCliente = new JMenuItem("Inserir Cliente");
		mntmInserirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InserirCliente abrir = new InserirCliente();
				abrir.setVisible(true);
				
			}
		});
		mntmInserirCliente.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\add-user.png"));
		mnNewMenu_1.add(mntmInserirCliente);
		
		JMenuItem mntmAtualizarCliente = new JMenuItem("Atualizar Cliente");
		mntmAtualizarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AtualizarCliente open = new AtualizarCliente();
				open.setVisible(true);
				
			}
		});
		mntmAtualizarCliente.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\recycle.png"));
		mnNewMenu_1.add(mntmAtualizarCliente);
		
		JMenu mnNewMenu_2 = new JMenu("Funcionarios");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmInserirFuncionario = new JMenuItem("Inserir Funcionario");
		mntmInserirFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InserirFuncionario abrir = new InserirFuncionario();
				abrir.setVisible(true);
			}
		});
		mntmInserirFuncionario.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\call-service.png"));
		mnNewMenu_2.add(mntmInserirFuncionario);
		
		JMenuItem mntmAtualizarFuncionario = new JMenuItem("Atualizar Funcionario");
		mntmAtualizarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtualizarFuncionario open = new AtualizarFuncionario();
				open.setVisible(true);
			}
		});
		mntmAtualizarFuncionario.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\cv.png"));
		mnNewMenu_2.add(mntmAtualizarFuncionario);
		
		JMenu mnNewMenu_3 = new JMenu("Aluguer");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNovaEntradaAluguer = new JMenuItem("Nova Entrada");
		mntmNovaEntradaAluguer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FichaAluguer open = new FichaAluguer();
				open.setVisible(true);
			}
		});
		mntmNovaEntradaAluguer.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\car-rent.png"));
		mnNewMenu_3.add(mntmNovaEntradaAluguer);
		
		JMenu mnListagensAluguer = new JMenu("Listagens");
		mnListagensAluguer.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\headhunting.png"));
		mnNewMenu_3.add(mnListagensAluguer);
		
		JMenuItem mntmListAluCliente = new JMenuItem("Cliente");
		mntmListAluCliente.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\customer.png"));
		mnListagensAluguer.add(mntmListAluCliente);
		
		JMenuItem mntmListAluData = new JMenuItem("Data");
		mntmListAluData.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\payment-day.png"));
		mnListagensAluguer.add(mntmListAluData);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\docs\\cinel_cars\\imagens\\pexels-mihis-alex-21014.jpg"));
		lblNewLabel.setBounds(0, 0, 461, 299);
		contentPane.add(lblNewLabel);
	}
}
