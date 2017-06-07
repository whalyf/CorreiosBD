package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.EstadoDao;
import br.com.caelum.jdbc.modelo.Estado;

public class TestaUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estado estados = new Estado();
		estados.setUf("WV");
		estados.setNome("Whal");
		estados.setId(32);
		
		EstadoDao bd = new EstadoDao();
		
		bd.altera(estados);
		
		System.out.println("Alterado!");
	}

}
