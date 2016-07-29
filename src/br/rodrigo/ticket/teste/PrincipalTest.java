package br.rodrigo.ticket.teste;

import static org.junit.Assert.*;


import org.junit.Test;


import br.rodrigo.ticket.modelo.PrecoPessoa;

public class PrincipalTest {
	
	TipoClienteTest tipoClienteTest = new TipoClienteTest();
	PrecoPessoa pessoa =  new PrecoPessoa(5.50, 8.00, 6.00, 1);
	PrecoPessoa pessoa1 = new PrecoPessoa(5.50, 8.00, 6.00, 2);
	PrecoPessoa pessoa2 = new PrecoPessoa(5.50, 8.00, 6.00, 3);
	PrecoPessoa pessoa3 = new PrecoPessoa(5.50, 8.00, 6.00, 4);
	

	@Test
	public void TestDescontoCriancas() {
		int tipoPessoa = 1; // Criança
		
		diaDaSemana(pessoa);
		tipoClienteTest.tipoCliente(pessoa, tipoPessoa);
		assertEquals(5.50,pessoa.getNovoPreco(),0.00001);
		
		diaDaSemana(pessoa1);
		tipoClienteTest.tipoCliente(pessoa1, tipoPessoa);
		assertEquals(4.95,pessoa1.getNovoPreco(),0.00001);
		
		diaDaSemana(pessoa2);
		tipoClienteTest.tipoCliente(pessoa2, tipoPessoa);
		assertEquals(4.675,pessoa2.getNovoPreco(),0.00001);
		
		diaDaSemana(pessoa3);
		tipoClienteTest.tipoCliente(pessoa3, tipoPessoa);
		assertEquals(3.85,pessoa3.getNovoPreco(),0.00001);
		
	}
	
	@Test
	public void TestDescontoIdosos(){
		
		int tipoPessoa = 3; // Idoso
		
		diaDaSemana(pessoa);
		tipoClienteTest.tipoCliente(pessoa, tipoPessoa);
		assertEquals(5.7, pessoa.getNovoPreco(),0.00001);
		
		diaDaSemana(pessoa1);
		tipoClienteTest.tipoCliente(pessoa1, tipoPessoa);
		assertEquals(5.4, pessoa1.getNovoPreco(),0.00001);
		
		diaDaSemana(pessoa2);
		tipoClienteTest.tipoCliente(pessoa2, tipoPessoa);
		assertEquals(5.1, pessoa2.getNovoPreco(),0.00001);
		
		diaDaSemana(pessoa3);
		tipoClienteTest.tipoCliente(pessoa3, tipoPessoa);
		assertEquals(3.60, pessoa3.getNovoPreco(),0.00001);
		
	}
	


	public static void diaDaSemana(PrecoPessoa pessoa) {
		System.out.println("1 - Domingo\n2 - Segunda-feira\n3 - Terça-feira ");
		System.out.println("4 - Quarta-feira\n5 - Quinta-feira\n6 - Sexta-feira");
		System.out.println("7 - Sabado");
		System.out.print("\nINFORME O DIA DA SEMANA: ");
		int diaDaSemana = pessoa.getDiaSemana();
		pessoa.setDiaSemana(diaDaSemana);
	}

}
