import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;

public class ListarEncomendas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarEncomendas frame = new ListarEncomendas();
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
	public ListarEncomendas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\demonstracao-na-loja.png"));
		
		DefaultListModel<String> listarEncomendas = new DefaultListModel<String>();
		
		JList<String> list = new JList<String>(listarEncomendas);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				//JOptionPane.showMessageDialog(null, "ola");
				listarEncomendas.removeAllElements();
				
				// se o meu arrayList estiver vazio 
				if(Encomendas.baseDados.size() == 0) {
					JOptionPane.showMessageDialog(null, "Não existem encomendas para apresentar!");
				}else {
					for(int i = 0; i < Encomendas.baseDados.size(); i++) {
						listarEncomendas.addElement(Encomendas.baseDados.get(i));
					}
				}
				
			}
		});
		setTitle("Listar Encomendas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		list.setBounds(106, 57, 398, 259);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Listagem de todos os dados guardados");
		lblNewLabel.setForeground(new Color(147, 112, 219));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(124, 24, 327, 28);
		contentPane.add(lblNewLabel);
	}
}
