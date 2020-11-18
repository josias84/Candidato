package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class ConcursoInscricao extends JFrame {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JLabel lblIncricaoDeCandidato;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblCargo;
	private JRadioButton rdbtnProfessorEnsinoFundamental;
	private JRadioButton rdbtnProfessorEnsinoMedio;
	private JRadioButton rdbtnProfessorEnsinoSuperior;
	private JButton btnLimpar;
	private JButton btnEnviar;
	
	ButtonGroup gb;

	public ConcursoInscricao() {
		setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
		setResizable(false);
		setBounds(100, 100, 411, 428);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Handler ouvinte = new Handler();
		
		lblIncricaoDeCandidato = new JLabel("INSCRICAO DE CANDIDATO");
		lblIncricaoDeCandidato.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIncricaoDeCandidato.setBounds(83, 13, 215, 16);
		getContentPane().add(lblIncricaoDeCandidato);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNome.setBounds(83, 63, 56, 16);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(83, 92, 267, 22);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCpf.setBounds(83, 127, 56, 16);
		getContentPane().add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(83, 156, 267, 22);
		getContentPane().add(txtCpf);
		
		lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCargo.setBounds(83, 191, 56, 16);
		getContentPane().add(lblCargo);
		
		rdbtnProfessorEnsinoFundamental = new JRadioButton("Professor Ensino Fundamental");
		rdbtnProfessorEnsinoFundamental.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnProfessorEnsinoFundamental.setBounds(83, 216, 228, 25);
		getContentPane().add(rdbtnProfessorEnsinoFundamental);
		
		rdbtnProfessorEnsinoMedio = new JRadioButton("Professor Ensino M\u00E9dio");
		rdbtnProfessorEnsinoMedio.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnProfessorEnsinoMedio.setBounds(83, 246, 201, 25);
		getContentPane().add(rdbtnProfessorEnsinoMedio);
		
		rdbtnProfessorEnsinoSuperior = new JRadioButton("Professor Ensino Superior");
		rdbtnProfessorEnsinoSuperior.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnProfessorEnsinoSuperior.setBounds(83, 276, 201, 25);
		getContentPane().add(rdbtnProfessorEnsinoSuperior);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setBounds(83, 328, 97, 25);
		btnLimpar.addActionListener(ouvinte);
		getContentPane().add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEnviar.setBounds(253, 329, 97, 25);
		btnEnviar.addActionListener(ouvinte);
		getContentPane().add(btnEnviar);

		gb = new ButtonGroup();
		gb.add(rdbtnProfessorEnsinoFundamental);
		gb.add(rdbtnProfessorEnsinoMedio);
		gb.add(rdbtnProfessorEnsinoSuperior);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);


	}
	public void limpar() {
		txtNome.setText("");
		txtCpf.setText("");
	}
	public class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnLimpar) {
				limpar();
			}else {
				if(e.getSource()==btnEnviar) {
					//açao que eu quero que seja executada
					String nome = txtNome.getText();
					String cpf = txtCpf.getText();
					if((nome.equals(""))||(cpf.equals(""))) {
						JOptionPane.showMessageDialog(getContentPane(), "Todos os campos devem ser preenchidos!", "Atenção", 1);
					}
					else {
						JOptionPane.showMessageDialog(getContentPane(), "DADOS CADASTRADOS COM SUCESSO!", "Atenção", 1);

					}
				}
			}
			
		}
		
	}
}
