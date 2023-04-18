import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class InserirCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCC;
	private JTextField textFieldNomeCompleto;
	//criação do objeto para manipular a classe Cliente
	Cliente novoCliente = new Cliente();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirCliente frame = new InserirCliente();
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
	public InserirCliente() {
		setTitle("Inserir Cliente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 615, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(47, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		textFieldCC = new JTextField();
		textFieldCC.setBounds(139, 37, 181, 20);
		contentPane.add(textFieldCC);
		textFieldCC.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Completo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 91, 107, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldNomeCompleto = new JTextField();
		textFieldNomeCompleto.setBounds(139, 89, 181, 20);
		contentPane.add(textFieldNomeCompleto);
		textFieldNomeCompleto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Data Nascimento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 141, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		JDateChooser dateChooserNascimento = new JDateChooser();
		dateChooserNascimento.setBounds(139, 141, 181, 20);
		contentPane.add(dateChooserNascimento);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
				if(textFieldCC.getText().trim().equals("") || textFieldNomeCompleto.getText().trim().equals("") || dateChooserNascimento.getDate() == null)
				{
					JOptionPane.showMessageDialog(null, "Os campos são de preenchimento obrigatório !", "ERRO",JOptionPane.ERROR_MESSAGE);
				}
				else if (textFieldCC.getText().length() != 8)
				{
					JOptionPane.showMessageDialog(null, "O campo CC tem que ter 8 algarismos!", "ERRO",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					try {
						
						int CC = Integer.parseInt(textFieldCC.getText().trim());
						
						SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
						
						String data = dataFormatada.format(dateChooserNascimento.getDate());
						
						novoCliente.BaseDadosClientes(CC, textFieldNomeCompleto.getText().trim(), data);
						
					}catch(Exception erro) {
						
						JOptionPane.showMessageDialog(null, "O campo CC tem que ser constituído apenas por algarismos !", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\docs\\imagens_cars\\inserir_cliente.jpg"));
		btnNewButton.setBounds(339, 11, 236, 168);
		contentPane.add(btnNewButton);
	}
}