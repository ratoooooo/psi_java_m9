package PSI_M9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;

public class Atividadade4GUI {

	private JFrame frame;
	private JTextField textFieldNome;
	private JTextField textField_1;
	private Pessoa registo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividadade4GUI window = new Atividadade4GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atividadade4GUI() {
		registo = new Pessoa();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 841, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNome.setBounds(23, 65, 112, 53);
		frame.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblIdade.setBounds(23, 162, 112, 53);
		frame.getContentPane().add(lblIdade);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAltura.setBounds(23, 265, 124, 53);
		frame.getContentPane().add(lblAltura);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(140, 74, 139, 31);
		frame.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JSpinner spinnerIdade = new JSpinner();
		spinnerIdade.setBounds(140, 176, 139, 31);
		frame.getContentPane().add(spinnerIdade);
		
		JSpinner spinnerAltura = new JSpinner();
		spinnerAltura.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerAltura.setBounds(140, 274, 139, 31);
		frame.getContentPane().add(spinnerAltura);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(163, 355, 89, 23);
		frame.getContentPane().add(btnGravar);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinner_1_1.setEnabled(false);
		spinner_1_1.setBounds(577, 274, 139, 31);
		frame.getContentPane().add(spinner_1_1);
		
		JLabel lblAltura_1 = new JLabel("Altura");
		lblAltura_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAltura_1.setBounds(460, 265, 124, 53);
		frame.getContentPane().add(lblAltura_1);
		
		JLabel lblIdade_1 = new JLabel("Idade");
		lblIdade_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblIdade_1.setBounds(460, 162, 112, 53);
		frame.getContentPane().add(lblIdade_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setEnabled(false);
		spinner_2.setBounds(577, 176, 139, 31);
		frame.getContentPane().add(spinner_2);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNome_1.setBounds(460, 65, 112, 53);
		frame.getContentPane().add(lblNome_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(577, 74, 139, 31);
		frame.getContentPane().add(textField_1);
		
		btnGravar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//buscar os valores dos com+ponentes
				String nome = textFieldNome.getText();
				int idd = (Integer) spinnerIdade.getValue(); 
				double altura = (Double) spinnerAltura.getValue();
				
				//guardar os valores dos com+obejtos
				registo.setNome(nome);
				registo.setIdd(idd);
				registo.setAltura(altura);
				
				//mostrar os valores dos com+ponentes
				textField_1.setText(registo.getNome());
				spinner_2.setValue(registo.getIdd());
				spinner_1_1.setValue(registo.getAltura());
			}
		});
	}
}
