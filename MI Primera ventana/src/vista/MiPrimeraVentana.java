package vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class MiPrimeraVentana extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnVer;
	private JButton btnOcultar;
	private JLabel lblHola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPrimeraVentana frame = new MiPrimeraVentana();
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
	public MiPrimeraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVer.setBounds(51, 45, 89, 23);
		contentPane.add(btnVer);
		
		btnOcultar = new JButton("Ocultar");
		btnOcultar.setBounds(51, 158, 89, 23);
		contentPane.add(btnOcultar);
		
		
		lblHola = new JLabel("Hola");
		lblHola.setBounds(328, 72, 64, 40);
		contentPane.add(lblHola);
		
		btnVer.addActionListener(this);
		btnOcultar.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
