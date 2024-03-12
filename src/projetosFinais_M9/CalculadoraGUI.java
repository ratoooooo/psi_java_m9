package projetosFinais_M9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;

public class CalculadoraGUI {

	private JFrame frame;
	private Calculadora calc; 
	double num1, num2, resultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGUI window = new CalculadoraGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculadoraGUI() {
		calc = new Calculadora(); 
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 957, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNumero1 = new JLabel("Número 1:");
		lblNumero1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumero1.setBounds(34, 55, 122, 44);
		frame.getContentPane().add(lblNumero1);

		JLabel lblNumero2 = new JLabel("Número 2:");
		lblNumero2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumero2.setBounds(34, 122, 122, 44);
		frame.getContentPane().add(lblNumero2);

		JSpinner spinnerNumero2 = new JSpinner();
		spinnerNumero2.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerNumero2.setBounds(141, 133, 66, 29);
		frame.getContentPane().add(spinnerNumero2);

		JSpinner spinnerNumero1 = new JSpinner();
		spinnerNumero1.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerNumero1.setBounds(141, 66, 66, 29);
		frame.getContentPane().add(spinnerNumero1);

		JLabel lblAdicao = new JLabel("Adição");
		lblAdicao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdicao.setBounds(362, 55, 122, 44);
		frame.getContentPane().add(lblAdicao);

		JLabel lblSubtracao = new JLabel("Subtração");
		lblSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSubtracao.setBounds(362, 122, 122, 44);
		frame.getContentPane().add(lblSubtracao);

		JLabel lblMultiplicacao = new JLabel("Multiplicação");
		lblMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMultiplicacao.setBounds(362, 191, 122, 44);
		frame.getContentPane().add(lblMultiplicacao);

		JLabel lblDivisao = new JLabel("Divisão");
		lblDivisao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDivisao.setBounds(362, 261, 122, 44);
		frame.getContentPane().add(lblDivisao);

		JSpinner spinnerAdicao = new JSpinner();
		spinnerAdicao.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerAdicao.setEnabled(false);
		spinnerAdicao.setBounds(461, 66, 94, 29);
		frame.getContentPane().add(spinnerAdicao);

		JSpinner spinnerSubtracao = new JSpinner();
		spinnerSubtracao.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerSubtracao.setEnabled(false);
		spinnerSubtracao.setBounds(461, 133, 94, 29);
		frame.getContentPane().add(spinnerSubtracao);

		JSpinner spinnerMultiplicacao = new JSpinner();
		spinnerMultiplicacao.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerMultiplicacao.setEnabled(false);
		spinnerMultiplicacao.setBounds(461, 202, 94, 29);
		frame.getContentPane().add(spinnerMultiplicacao);

		JSpinner spinnerDivisao = new JSpinner();
		spinnerDivisao.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerDivisao.setEnabled(false);
		spinnerDivisao.setBounds(461, 272, 94, 29);
		frame.getContentPane().add(spinnerDivisao);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        num1 = (Double) spinnerNumero1.getValue();
		        num2 = (Double) spinnerNumero2.getValue();

		        calc.setNum1(num1);
		        calc.setNum2(num2);

		        double resultadoAdicao = calc.somarNumeros(num1, num2);
		        double resultadoSubtracao = calc.subtrairNumeros(num1, num2);
		        double resultadoMultiplicacao = calc.multiplicarNumeros(num1, num2);
		        double resultadoDivisao;

		        if (num2 != 0) {
		            resultadoDivisao = calc.dividirNumeros(num1, num2);
		        } else {
		            resultadoDivisao = 0;
		        }

		        spinnerAdicao.setValue(resultadoAdicao);
		        spinnerSubtracao.setValue(resultadoSubtracao);
		        spinnerMultiplicacao.setValue(resultadoMultiplicacao);
		        spinnerDivisao.setValue(resultadoDivisao);
		    }
		});

		btnCalcular.setBounds(54, 205, 89, 23);
		frame.getContentPane().add(btnCalcular);
		btnCalcular.setBounds(54, 205, 89, 23);
		frame.getContentPane().add(btnCalcular);
	}
}
