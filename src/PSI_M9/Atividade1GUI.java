package PSI_M9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Atividade1GUI {

	private JFrame frame;
	private Premio premio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade1GUI window = new Atividade1GUI();
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
	public Atividade1GUI() {
		 premio = new Premio("10M", "5M", "20M", "1M");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSortearPremio = new JButton("Sorteio Premio");
		btnSortearPremio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSortearPremio.setBounds(52, 261, 190, 54);
		frame.getContentPane().add(btnSortearPremio);
		
		JLabel lblPremii = new JLabel("");
		lblPremii.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremii.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblPremii.setBounds(282, 29, 256, 257);
		frame.getContentPane().add(lblPremii);
		
		JLabel lblPremio1 = new JLabel("");
		lblPremio1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPremio1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremio1.setBounds(24, 61, 107, 84);
		frame.getContentPane().add(lblPremio1);
		
		JLabel lblPremio3 = new JLabel("");
		lblPremio3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPremio3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremio3.setBounds(24, 156, 107, 84);
		frame.getContentPane().add(lblPremio3);
		
		JLabel lblPremio4 = new JLabel("");
		lblPremio4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPremio4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremio4.setBounds(147, 156, 107, 84);
		frame.getContentPane().add(lblPremio4);
		
		JLabel lblPremio2 = new JLabel("");
		lblPremio2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPremio2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremio2.setBounds(147, 61, 107, 84);
		frame.getContentPane().add(lblPremio2);
		
		//mostrar premios
		/*
		lblPremio1.setText(premio.getPremio1());
		lblPremio2.setText(premio.getPremio2());
		lblPremio3.setText(premio.getPremio3());
		lblPremio4.setText(premio.getPremio4());
		*/
		
		//events
		btnSortearPremio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPremii.setText(premio.gerarPremio());
			}
		});
		
		
	}
}
