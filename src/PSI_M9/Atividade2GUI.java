package PSI_M9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Atividade2GUI {

	private JFrame frame; 
	private Alarme despertador;
	private Alarme alarme;
	LocalDateTime agora = LocalDateTime.now();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade2GUI window = new Atividade2GUI();
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
	public Atividade2GUI() {
		despertador = new Alarme(7, 5, 0);
		alarme = new Alarme();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		frame.setBounds(100, 100, 1022, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alarmes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 51));
		lblNewLabel.setBounds(28, 24, 231, 87);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\img\\relogio.png"));
		lblNewLabel_1.setBounds(690, 247, 273, 269);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblHoraAtual = new JLabel("");
		lblHoraAtual.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblHoraAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraAtual.setBounds(227, 144, 216, 87);
		frame.getContentPane().add(lblHoraAtual);
		
		JLabel lblIndicarHoraAtual = new JLabel("Hora Atual");
		lblIndicarHoraAtual.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblIndicarHoraAtual.setBounds(28, 165, 200, 44);
		frame.getContentPane().add(lblIndicarHoraAtual);
		
		
		JLabel lblIndicaDespertador = new JLabel("Despertador");
		lblIndicaDespertador.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblIndicaDespertador.setBounds(28, 241, 200, 44);
		frame.getContentPane().add(lblIndicaDespertador);
		
		JLabel lblDespertador = new JLabel("15:3:36");
		lblDespertador.setHorizontalAlignment(SwingConstants.CENTER);
		lblDespertador.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblDespertador.setBounds(278, 220, 216, 87);
		frame.getContentPane().add(lblDespertador);
		
		JLabel lblIndicaAlarme = new JLabel("Alarme");
		lblIndicaAlarme.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblIndicaAlarme.setBounds(28, 322, 200, 44);
		frame.getContentPane().add(lblIndicaAlarme);
		
		//mostrar horas
		lblHoraAtual.setText(String.valueOf(agora.getHour() + ":" + agora.getMinute() + ":" + agora.getSecond()));
		lblDespertador.setText(despertador.toString());
		
		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoras.setBounds(28, 415, 64, 44);
		frame.getContentPane().add(lblHoras);
		
		JLabel lblMinutos = new JLabel("Minutos");
		lblMinutos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinutos.setBounds(172, 415, 74, 44);
		frame.getContentPane().add(lblMinutos);
		
		JLabel lblSegundos = new JLabel("Segundos");
		lblSegundos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSegundos.setBounds(338, 415, 97, 44);
		frame.getContentPane().add(lblSegundos);
		
		JSpinner spinnerHora = new JSpinner();
		spinnerHora.setModel(new SpinnerNumberModel(0, null, 23, 1));
		spinnerHora.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int hora = (Integer) spinnerHora.getValue();
				alarme.setHora(hora);
			}
		});
		spinnerHora.setBounds(83, 415, 43, 36);
		frame.getContentPane().add(spinnerHora);
		
		JSpinner spinnerMinuto = new JSpinner();
		spinnerMinuto.setModel(new SpinnerNumberModel(0, null, 59, 1));
		spinnerMinuto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int minuto = (Integer) spinnerMinuto.getValue();
				alarme.setMinuto(minuto);
			}
		});
		spinnerMinuto.setBounds(244, 415, 43, 36);
		frame.getContentPane().add(spinnerMinuto);
		
		JSpinner spinnerSegundo = new JSpinner();
		spinnerSegundo.setModel(new SpinnerNumberModel(0, null, 59, 1));
		spinnerSegundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int segundo = (Integer) spinnerSegundo.getValue();
				alarme.setSegundo(segundo);
			}
		});
		spinnerSegundo.setBounds(422, 415, 43, 36);
		frame.getContentPane().add(spinnerSegundo);
		
		JLabel lblAlarme = new JLabel("");
		lblAlarme.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarme.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAlarme.setBounds(164, 301, 216, 87);
		frame.getContentPane().add(lblAlarme);
		
		JButton btnNewButton = new JButton("ConfirmarAlarme");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAlarme.setText(alarme.toString());
			}
		});
		btnNewButton.setBounds(227, 477, 153, 39);
		frame.getContentPane().add(btnNewButton);
		
	}
}
