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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\docs\\cinel_editora\\imagens\\contacts.png"));
		setTitle("AGENDA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
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
				}
			}
	});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\power.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Contactos");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Novo");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Permite abrir a janela dos contactos
				Contacto open = new Contacto();
				open.setVisible(true);
				
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\add-user.png"));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Procurar");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Nome");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Procurar open = new Procurar();
				open.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\look-for.png"));
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Telefone");
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\phone.png"));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\docs\\cinel_editora\\imagens\\fundo.jpeg"));
		lblNewLabel.setBounds(0, 0, 434, 239);
		contentPane.add(lblNewLabel);
	}
}
