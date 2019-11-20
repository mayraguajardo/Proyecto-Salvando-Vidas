import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import java.awt.SystemColor;
import java.awt.Font;

public class Window {

	private JFrame frame;
	private JTextField minutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Border border = LineBorder.createGrayLineBorder();
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setForeground(Color.BLACK);
		
		JLabel lblDatosCargados = new JLabel("Datos Cargados");
		lblDatosCargados.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDatosCargados.setBackground(Color.BLACK);
		lblDatosCargados.setForeground(Color.BLACK);
		lblDatosCargados.setBorder(border);
		
		JLabel lblCiudadOrigen = new JLabel("Ciudad Origen:");
		lblCiudadOrigen.setForeground(Color.BLACK);
		lblCiudadOrigen.setBackground(Color.WHITE);
		
		JLabel lblCiudadDestino = new JLabel("Ciudad Destino");
		lblCiudadDestino.setForeground(Color.BLACK);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setForeground(Color.BLACK);
		
		JLabel lblMinutos = new JLabel("minutos");
		lblMinutos.setForeground(Color.BLACK);
		
		JComboBox ciudadesOrigen = new JComboBox();
		
		JComboBox ciudadesDestino = new JComboBox();
		
		minutos = new JTextField();
		minutos.setColumns(10);
		
		JButton btnBuscarVuelo = new JButton("Buscar Vuelo");
		btnBuscarVuelo.setForeground(Color.BLACK);
		
		JLabel lblResultado = new JLabel("Se puede llegar de -  a - en- minutos");
		lblResultado.setBackground(Color.WHITE);
		lblResultado.setForeground(Color.BLACK);
		lblResultado.setBorder(border);
		
		JLabel lblTitle = new JLabel("Salvando Vidas");
		lblTitle.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblResultado, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
						.addComponent(btnBuscarVuelo, Alignment.TRAILING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(ciudadesOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCiudadOrigen))
									.addGap(86)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblCiudadDestino)
										.addComponent(ciudadesDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(102)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(minutos, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTiempo, Alignment.TRAILING)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDatosCargados, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCargar)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblMinutos, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
									.addGap(9)))))
					.addGap(58))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(232)
					.addComponent(lblTitle)
					.addContainerGap(256, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblTitle)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblDatosCargados, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCargar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCiudadDestino)
						.addComponent(lblCiudadOrigen)
						.addComponent(lblTiempo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ciudadesOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ciudadesDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(minutos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMinutos))
					.addGap(55)
					.addComponent(btnBuscarVuelo)
					.addGap(18)
					.addComponent(lblResultado, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
