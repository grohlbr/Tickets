package br.rodrigo.ticket;

import java.util.Scanner;

import br.rodrigo.ticket.modelo.PrecoPessoa;

public class Principal {

	public static void main(String[] args) {
		TipoCliente tipoCliente = new TipoCliente();
		PrecoPessoa pessoa = new PrecoPessoa(5.50, 8.00, 6.00);
		
		diaDaSemana(pessoa);
		tipoCliente.tipoCliente(pessoa);
		System.out.println("O valor do ingresso foi de " + pessoa.getNovoPreco() );
		
	}

	public static void diaDaSemana(PrecoPessoa pessoa) {
		Scanner input = new Scanner(System.in);
		System.out.println("1 - Domingo\n2 - Segunda-feira\n3 - Terça-feira ");
		System.out.println("4 - Quarta-feira\n5 - Quinta-feira\n6 - Sexta-feira");
		System.out.println("7 - Sabado");
		System.out.print("\nINFORME O DIA DA SEMANA: ");
		int diaDaSemana = input.nextInt();
		pessoa.setDiaSemana(diaDaSemana);
	}
		

}
