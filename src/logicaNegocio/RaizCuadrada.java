/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logicaNegocio;

/**
 *
 * @author 13
 */

public class RaizCuadrada {
	private double number;
	
	public RaizCuadrada( double number ) {
		this.number = number;
	}
	
	public double get(){
		return Math.sqrt( number );
	}
}