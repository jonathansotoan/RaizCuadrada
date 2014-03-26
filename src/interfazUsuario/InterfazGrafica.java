/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfazUsuario;

/**
 *
 * @author 13
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazGrafica extends JFrame implements ActionListener {
	JTextField jtf_value;
	JLabel jl_result;
	JButton jb_calculate;

	public InterfazGrafica( String wndwTitle ) {
		super( wndwTitle);
		JPanel panel = new JPanel();
		panel.setLayout( new GridLayout( 2, 2, 10, 10 ) );
		setLayout( new BorderLayout() );
		jtf_value = new JTextField();
		jl_result = new JLabel();
		jb_calculate = new JButton( "Calculate" );
		jb_calculate.addActionListener( this );
		
		panel.add( new JLabel( "Value" ) );
		panel.add( jtf_value );
		panel.add( new JLabel( "Result: " ) );
		panel.add( jl_result );
		
		add( panel, BorderLayout.CENTER );
		add( jb_calculate, BorderLayout.SOUTH );
		
		pack();
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setVisible( true );
	}
	
	public void actionPerformed( ActionEvent ae ) {
		jl_result.setText( "" + new logicaNegocio.RaizCuadrada( Double.parseDouble( jtf_value.getText() ) ).get() );
	}
}