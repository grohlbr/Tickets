package br.rodrigo.ticket.teste;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import br.rodrigo.ticket.Descontos;
import br.rodrigo.ticket.modelo.PrecoPessoa;

public class TipoClienteTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTipoCliente() {
		fail("Not yet implemented");
	}
	
	public void tipoCliente(PrecoPessoa pessoa, int opcao) {
		Descontos desconto = new Descontos();
		System.out.println("\n1 - Crianca\n2 - Estudante\n3 - Idoso");
		System.out.print("\nOPÇÃO: ");
		switch (opcao) {
			case 1:
				desconto.precoComDescontoCrianca(pessoa);
				break;
			case 2:
				desconto.descontoEstudante(pessoa);
				break;
			case 3:
				desconto.precoComDescontoIdoso(pessoa);
				break;
			default:
				System.out.println("Error");
		
		}
		
	}

	

}
