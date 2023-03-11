import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class InserirEncomendas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeProduto;
	private JTextField textFieldPrecoProduto;
	
	
	// criacao do objeto
	Encomendas novaEncomenda = new Encomendas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirEncomendas frame = new InserirEncomendas();
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
	public InserirEncomendas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\cinel_java\\Cinel_Exemplo_13\\src\\imagens\\demonstracao-na-loja.png"));
		setTitle("Inserir Encomendas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 468, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data da encomenda");
		lblNewLabel.setForeground(new Color(147, 112, 219));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(60, 36, 139, 30);
		contentPane.add(lblNewLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(200, 36, 179, 30);
		contentPane.add(dateChooser);
		
		textFieldNomeProduto = new JTextField();
		textFieldNomeProduto.setBounds(200, 77, 179, 29);
		contentPane.add(textFieldNomeProduto);
		textFieldNomeProduto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome produto");
		lblNewLabel_1.setForeground(new Color(147, 112, 219));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(99, 77, 91, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Preço Produto");
		lblNewLabel_1_1.setForeground(new Color(147, 112, 219));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(88, 117, 111, 18);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldPrecoProduto = new JTextField();
		textFieldPrecoProduto.setColumns(10);
		textFieldPrecoProduto.setBounds(200, 117, 179, 30);
		contentPane.add(textFieldPrecoProduto);
		

		
		JCheckBox checkLisboa = new JCheckBox("Lisboa");
		checkLisboa.setBounds(200, 183, 97, 23);
		contentPane.add(checkLisboa);
		
		JCheckBox checkFaro = new JCheckBox("Faro");
		checkFaro.setBounds(299, 182, 97, 23);
		contentPane.add(checkFaro);
		
		JCheckBox checkPorto = new JCheckBox("Porto");
		checkPorto.setBounds(119, 182, 97, 23);
		contentPane.add(checkPorto);
		
		JButton btnNewButton = new JButton("Inserir Encomenda");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data, nome, loja = "" ;
				double preco;
				
				if(dateChooser.getDate()== null || textFieldNomeProduto.getText().equals("") || textFieldPrecoProduto.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Os campos são de preenchimento obrigatória!");
				} else if(checkPorto.isSelected()==false && checkLisboa.isSelected()==false && checkFaro.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Deve escolher pelo meno uma loja!");
				}else {
					
					SimpleDateFormat novaData = new SimpleDateFormat("dd/MM/yyyy");
					
					data = novaData.format(dateChooser.getDate());
					//JOptionPane.showMessageDialog(null, data);
					
					nome = textFieldNomeProduto.getText();
					
					try {
						preco = Double.parseDouble(textFieldPrecoProduto.getText());
						if(checkPorto.isSelected()== true) {
							loja = "Porto " + "; ";
						}
						if(checkLisboa.isSelected()== true) {
							loja += checkLisboa.getText() + "; "; // loja += "Lisboa"
						} 
						
											
						if(checkFaro.isSelected()== true) {
							loja += checkFaro.getText();
						}
						
						// enviar os dados guardados para a classe encomendas
						novaEncomenda.GuardarEncomendas(data, preco, nome, loja);
						
					} catch (Exception erro) {
						JOptionPane.showMessageDialog(null, "O preço tem que ser um valor númerico");
					}
					// JOptionPane.showMessageDialog(null, loja);
					
					
					
					
					
					
				}
				
			}
		});
		btnNewButton.setForeground(new Color(147, 112, 219));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(99, 229, 228, 56);
		contentPane.add(btnNewButton);
	}
}
