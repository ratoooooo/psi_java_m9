package projetosFinais_M9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConversorGUI {

	private JFrame frame;
	Conversor converter;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorGUI window = new ConversorGUI();
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
	public ConversorGUI() {
		Conversor converter = new Conversor();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(44, 56, 134, 48);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblConvertido = new JLabel("Convertido");
		lblConvertido.setHorizontalAlignment(SwingConstants.CENTER);
		lblConvertido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConvertido.setBounds(44, 135, 134, 48);
		frame.getContentPane().add(lblConvertido);

		JSpinner spinnerConverter = new JSpinner();
		spinnerConverter.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerConverter.setBounds(169, 68, 134, 31);
		frame.getContentPane().add(spinnerConverter);

		JSpinner spinnerConvertido = new JSpinner();
		spinnerConvertido.setEnabled(false);
		spinnerConvertido.setBounds(169, 147, 134, 31);
		frame.getContentPane().add(spinnerConvertido);

		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setBounds(187, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Opções:", "euro to dolar", "dolar to euro",
				"euro to real", "real to euro", "kg to g", "g to kg" }));
		comboBox.setBounds(63, 214, 89, 22);
		frame.getContentPane().add(comboBox);

		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        double valorConverter = (Double) spinnerConverter.getValue();
		        double valorConvertido = 0;

		        int op = comboBox.getSelectedIndex();
		        switch (op) {
		            case 1:
		                valorConvertido = converter.converterEuroToDolar(valorConverter);
		                break;
		            case 2:
		                valorConvertido = converter.converterDolarToEuro(valorConverter);
		                break;
		            case 3:
		                valorConvertido = converter.converterEurotoReal(valorConverter);
		                break;
		            case 4:
		                valorConvertido = converter.converterRealToEuro(valorConverter);
		                break;
		            case 5:
		                valorConvertido = converter.converterKgToG(valorConverter);
		                break;
		            case 6:
		                valorConvertido = converter.converterGtoKg(valorConverter);
		                break;
		            default:
		                break;
		        }

		        //converter.setValor(valorConvertido);
		        valorConvertido=converter.getValor();
		        spinnerConvertido.setValue(converter.getValor());
		    }
		});


	}
}
