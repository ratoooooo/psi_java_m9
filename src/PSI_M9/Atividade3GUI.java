package PSI_M9;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Atividade3GUI {

	private JFrame frame;
	private Lampada luz;
	JLabel lblLampada = new JLabel("");
	JCheckBox chckbxNewCheckBoxOnOff = new JCheckBox("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade3GUI window = new Atividade3GUI();
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
	public Atividade3GUI() {
		luz = new Lampada();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		chckbxNewCheckBoxOnOff.setBounds(23, 175, 99, 23);
		frame.getContentPane().add(chckbxNewCheckBoxOnOff);
		
		atualizaImagemLampada();
		lblLampada.setBounds(108, 46, 214, 256);
		frame.getContentPane().add(lblLampada);
		
		//events
		chckbxNewCheckBoxOnOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxNewCheckBoxOnOff.isSelected())
				{
					luz.acender();
				}
				else
				{
					luz.apagar();
				}
				
				atualizaImagemLampada();
			}
		});
	}
	
	public void atualizaImagemLampada()
	{
		if(luz.isAcesa())
		{
			lblLampada.setIcon(new ImageIcon("D:\\img\\lampadaAcesa.png"));
			lblLampada.setText("Acesa");
		}
		else
		{
			lblLampada.setIcon(new ImageIcon("D:\\img\\LampadaApagada.png"));
			lblLampada.setText("Apagada");
		}
	}
}
