package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.EstadoDao;
import br.com.caelum.jdbc.modelo.Estado;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estado estados = new Estado();
		estados.setUf("CA");
		estados.setNome("Caelum");
		
		EstadoDao bd = new EstadoDao();
		
		bd.adiciona(estados);
		
		System.out.println("Gravado!");

	}
}
