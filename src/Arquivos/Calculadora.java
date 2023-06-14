package Arquivos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField TXT_CALCULOS;
	private JTextField TXT_RESU;
	
	Double N1, N2;
	String tipoOperacao = "nada";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora Magno Alves");
		frmCalculadora.setBounds(100, 100, 361, 328);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 7);
			}
		});
		btn_7.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_7.setBounds(10, 76, 57, 43);
		frmCalculadora.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 8);
			}
		});
		btn_8.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_8.setBounds(75, 76, 57, 43);
		frmCalculadora.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 9);
			}
		});
		btn_9.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_9.setBounds(142, 76, 57, 43);
		frmCalculadora.getContentPane().add(btn_9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText("");
				TXT_CALCULOS.setText("");
				tipoOperacao = "nada";
			}
		});
		btnC.setFont(new Font("Arial", Font.PLAIN, 18));
		btnC.setBounds(209, 76, 57, 43);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText("");
			}
		});
		btnCe.setFont(new Font("Arial", Font.PLAIN, 17));
		btnCe.setBounds(276, 76, 58, 43);
		frmCalculadora.getContentPane().add(btnCe);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 4);
			}
		});
		btn_4.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_4.setBounds(10, 127, 57, 43);
		frmCalculadora.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 5);
			}
		});
		btn_5.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_5.setBounds(75, 127, 57, 43);
		frmCalculadora.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 6);
			}
		});
		btn_6.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_6.setBounds(142, 127, 57, 43);
		frmCalculadora.getContentPane().add(btn_6);
		
		JButton btn_MAIS = new JButton("+");
		btn_MAIS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tipoOperacao.equals("nada")) {
					
					TXT_CALCULOS.setText(TXT_CALCULOS.getText() + TXT_RESU.getText());
					
				}else {
					
				}
				TXT_CALCULOS.setText(TXT_CALCULOS.getText() + "+");
				N1 = Double.parseDouble(TXT_RESU.getText());
				TXT_RESU.setText("");
				tipoOperacao = "adicao";
				
			}
		});
		btn_MAIS.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_MAIS.setBounds(209, 127, 57, 97);
		frmCalculadora.getContentPane().add(btn_MAIS);
		
		JButton btn_DIMI = new JButton("-");
		btn_DIMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipoOperacao.equals("nada")) {
					
					TXT_CALCULOS.setText(TXT_CALCULOS.getText() + TXT_RESU.getText());
					
				}else {
					
				}
				TXT_CALCULOS.setText(TXT_CALCULOS.getText() + "-");
				N1 = Double.parseDouble(TXT_RESU.getText());
				TXT_RESU.setText("");
				tipoOperacao = "subtracao";
				
			}
		});
		btn_DIMI.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_DIMI.setBounds(276, 127, 57, 43);
		frmCalculadora.getContentPane().add(btn_DIMI);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 1);
			}
		});
		btn_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_1.setBounds(10, 181, 57, 43);
		frmCalculadora.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 2);
			}
		});
		btn_2.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_2.setBounds(75, 181, 57, 43);
		frmCalculadora.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 3);
			}
		});
		btn_3.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_3.setBounds(142, 181, 57, 43);
		frmCalculadora.getContentPane().add(btn_3);
		
		JButton btn_MULT = new JButton("X");
		btn_MULT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tipoOperacao.equals("nada")) {
					
					TXT_CALCULOS.setText(TXT_CALCULOS.getText() + TXT_RESU.getText());
					
				}else {
					
				}
				TXT_CALCULOS.setText(TXT_CALCULOS.getText() + "X");
				N1 = Double.parseDouble(TXT_RESU.getText());
				TXT_RESU.setText("");
				tipoOperacao = "multiplicacao";
				
			}
		});
		btn_MULT.setBounds(276, 181, 57, 43);
		frmCalculadora.getContentPane().add(btn_MULT);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TXT_RESU.setText(TXT_RESU.getText() + 0);
			}
		});
		btn_0.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_0.setBounds(10, 235, 57, 43);
		frmCalculadora.getContentPane().add(btn_0);
		
		JButton btn_PONTO = new JButton(".");
		btn_PONTO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TXT_RESU.setText(TXT_RESU.getText() + ".");;
			}
		});
		btn_PONTO.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_PONTO.setBounds(75, 235, 57, 43);
		frmCalculadora.getContentPane().add(btn_PONTO);
		
		JButton btn_IGUAL = new JButton("=");
		btn_IGUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TXT_CALCULOS.setText(TXT_CALCULOS.getText() + TXT_RESU.getText());
				N2 = Double.parseDouble(TXT_RESU.getText());
				TXT_RESU.setText("");
				if(tipoOperacao.equals("adicao")) {
					TXT_RESU.setText(String.valueOf(N1 + N2));
				}
				else if(tipoOperacao.equals("subtracao")){
					TXT_RESU.setText(String.valueOf(N1 - N2));
				}
				else if(tipoOperacao.equals("multiplicacao")) {
					TXT_RESU.setText(String.valueOf(N1 * N2));
				}
				else if(tipoOperacao.equals("divisao")) {
					TXT_RESU.setText(String.valueOf(N1 / N2));
				}else {
					JOptionPane.showMessageDialog(null, "Por favor escolha uma operação.");
				}
			}
		});
		btn_IGUAL.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_IGUAL.setBounds(142, 235, 124, 43);
		frmCalculadora.getContentPane().add(btn_IGUAL);
		
		JButton btn_DIVID = new JButton("/");
		btn_DIVID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipoOperacao.equals("nada")) {
					
					TXT_CALCULOS.setText(TXT_CALCULOS.getText() + TXT_RESU.getText());
					
				}else {
					
				}
				TXT_CALCULOS.setText(TXT_CALCULOS.getText() + "/");
				N1 = Double.parseDouble(TXT_RESU.getText());
				TXT_RESU.setText("");
				tipoOperacao = "divisao";
				
			}
		});
		btn_DIVID.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_DIVID.setBounds(276, 235, 57, 43);
		frmCalculadora.getContentPane().add(btn_DIVID);
		
		TXT_CALCULOS = new JTextField();
		TXT_CALCULOS.setEditable(false);
		TXT_CALCULOS.setFont(new Font("Arial", Font.PLAIN, 18));
		TXT_CALCULOS.setBounds(10, 11, 319, 23);
		frmCalculadora.getContentPane().add(TXT_CALCULOS);
		TXT_CALCULOS.setColumns(10);
		
		TXT_RESU = new JTextField();
		TXT_RESU.setEditable(false);
		TXT_RESU.setFont(new Font("Arial", Font.PLAIN, 18));
		TXT_RESU.setColumns(10);
		TXT_RESU.setBounds(10, 45, 319, 23);
		frmCalculadora.getContentPane().add(TXT_RESU);
	}
}
