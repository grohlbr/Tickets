package br.rodrigo.ticket;

import java.util.Scanner;

import br.rodrigo.ticket.modelo.PrecoPessoa;

public class TipoCliente {
	
	public void tipoCliente(PrecoPessoa pessoa) {
		Descontos desconto = new Descontos();
		int opcao = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\n1 - Crianca\n2 - Estudante\n3 - Idoso");
		System.out.print("\nOPÇÃO: ");
		opcao = input.nextInt();
		input.close();
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
