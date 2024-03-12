package projetosFinais_M9;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculoIMCGUI {

	private JFrame frame;
	CalculoIMC imc;
	  double altura;
	  double peso;
	 double calculoIMC;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMCGUI window = new CalculoIMCGUI();
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
	public CalculoIMCGUI() {
		 imc = new CalculoIMC();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 831, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPeso.setBounds(56, 75, 141, 50);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAltura.setBounds(42, 136, 141, 50);
		frame.getContentPane().add(lblAltura);
		
		JSpinner spinnerPeso = new JSpinner();
		spinnerPeso.setModel(new SpinnerNumberModel(Double.valueOf(0), Double.valueOf(0), null, Double.valueOf(1)));
		spinnerPeso.setBounds(134, 92, 131, 26);
		frame.getContentPane().add(spinnerPeso);
		
		JSpinner spinnerAltura = new JSpinner();
		spinnerAltura.setModel(new SpinnerNumberModel(Double.valueOf(0), Double.valueOf(0), null, Double.valueOf(1)));
		spinnerAltura.setBounds(134, 153, 131, 26);
		frame.getContentPane().add(spinnerAltura);
		
		JButton btnCaucular = new JButton("Calcular IMC");
		btnCaucular.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCaucular.setBounds(75, 218, 190, 37);
		frame.getContentPane().add(btnCaucular);
		
		JSpinner spinnerImc = new JSpinner();
		spinnerImc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		spinnerImc.setForeground(new Color(0, 0, 255));
		spinnerImc.setBounds(518, 92, 96, 23);
		frame.getContentPane().add(spinnerImc);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblImc.setBounds(455, 75, 141, 50);
		frame.getContentPane().add(lblImc);
		
		JLabel lblNewLabel = new JLabel("___________________");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(37, 181, 302, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNivelImc = new JLabel("");
		lblNivelImc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNivelImc.setBounds(43, 274, 276, 54);
		frame.getContentPane().add(lblNivelImc);
		
		btnCaucular.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        altura = (Double) spinnerAltura.getValue();
		        imc.setAltura(altura);
		        peso = (Double) spinnerPeso.getValue();
		        imc.setPeso(peso);

		        calculoIMC = imc.calcularIMC();
		        spinnerImc.setValue(calculoIMC);
		    }
		});
	}

}
