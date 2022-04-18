package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.entity.Cliente;
import model.entity.Telefone;

import javax.swing.JComboBox;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.SwingConstants;

import controller.ClienteController;

import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarTodosCadastro {

	private JFrame frame;
	private ClienteController clienteController = new ClienteController();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarTodosCadastro window = new ListarTodosCadastro();
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
	public ListarTodosCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel cabecalhoTela = new JLabel("                         tela de cadstro cliente");
		cabecalhoTela.setVerticalAlignment(SwingConstants.TOP);
		cabecalhoTela.setFont(new Font("Arial Black", Font.ITALIC, 14));
		cabecalhoTela.setForeground(new Color(255, 255, 255));
		cabecalhoTela.setBackground(new Color(72, 209, 204));
		
		JButton btnExcluir = new JButton("excluir\r\n");
		
		
		
		
		JButton btnEditar = new JButton("editar\r\n");
		
		
		
		
		
		JButton btnNovoCliente = new JButton("novo cliente");
		btnNovoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaCadastroCliente().setVisible(true);
				frame.setVisible(false);
			
			
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
			
			
			
			
			
			
			
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(btnNovoCliente)
					.addGap(43)
					.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(cabecalhoTela, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(cabecalhoTela)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNovoCliente)
						.addComponent(btnExcluir)
						.addComponent(btnEditar))
					.addGap(11))
		);
		frame.getContentPane().setLayout(groupLayout);
	
	}
}

