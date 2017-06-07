package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.EstadoDao;
import br.com.caelum.jdbc.modelo.Estado;

public class TestaRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estado estados = new Estado();
		estados.setId(32);
		
		EstadoDao bd = new EstadoDao();
		
		bd.remove(estados);
		
		System.out.println("Removido!");
	}

}
