package br.rodrigo.ticket;

import java.util.Scanner;

import br.rodrigo.ticket.modelo.PrecoPessoa;

public class Descontos {
	
	public void precoComDescontoIdoso(PrecoPessoa pessoa) {
		double precoComDesconto = 0;
		double precoIngressoIdoso = pessoa.getIdoso();
		int diaDaSemana = pessoa.getDiaSemana();
		if(diaDaSemana == 2){
			precoComDesconto = precoIngressoIdoso * 0.1;
			precoComDesconto = precoIngressoIdoso - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);
	    } else if (diaDaSemana == 3) {
	    	precoComDesconto = precoIngressoIdoso * 0.15;
	    	precoComDesconto = precoIngressoIdoso - precoComDesconto;
	    	pessoa.setNovoPreco(precoComDesconto);
	    } else if (diaDaSemana == 4) {
	    	precoComDesconto = precoIngressoIdoso * 0.4;
	    	precoComDesconto = precoIngressoIdoso - precoComDesconto;
	    	pessoa.setNovoPreco(precoComDesconto);
	    } else if (diaDaSemana == 5) {
	    	precoComDesconto = precoIngressoIdoso * 0.3;
	    	precoComDesconto = precoIngressoIdoso - precoComDesconto;
	    	pessoa.setNovoPreco(precoComDesconto);
	    } else if (diaDaSemana == 7 || diaDaSemana == 1) {
	    	precoComDesconto = precoIngressoIdoso * 0.05;
	    	precoComDesconto = precoIngressoIdoso - precoComDesconto;
	    	pessoa.setNovoPreco(precoComDesconto);
	    } else {
	    	pessoa.setNovoPreco(precoComDesconto);
	    }
	}



	public void descontoSemCarteirinha(PrecoPessoa pessoa){
		double precoComDesconto = 0;
		double precoIngressoEstudante = pessoa.getEstudante();
		int diaDaSemana = pessoa.getDiaSemana();
		if(diaDaSemana == 2){
			precoComDesconto = precoIngressoEstudante * 0.1;
			precoComDesconto = precoIngressoEstudante - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);	
		} else if (diaDaSemana == 3){
			precoComDesconto = precoIngressoEstudante * 0.05;
			precoComDesconto = precoIngressoEstudante - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);
		} else if (diaDaSemana == 4){
			precoComDesconto = precoIngressoEstudante * 0.5;
			precoComDesconto = precoIngressoEstudante - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);
		} else if (diaDaSemana == 5){
			precoComDesconto = precoIngressoEstudante * 0.3;
			precoComDesconto = precoIngressoEstudante - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);
		} else {
		pessoa.setNovoPreco(precoIngressoEstudante);
		}
	}



	public void descontoComCarteirinha(PrecoPessoa pessoa) {
		double precoComDesconto = 0;
		double precoIngressoEstudante = pessoa.getEstudante();
		int diaDaSemana = pessoa.getDiaSemana();
		if(diaDaSemana == 4){
			precoComDesconto = precoIngressoEstudante * 0.5;
			precoComDesconto = precoIngressoEstudante - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);	
		} else if (diaDaSemana == 1 || diaDaSemana == 7){
			pessoa.setNovoPreco(precoIngressoEstudante);
		} else if (diaDaSemana == 2 || diaDaSemana == 3 || diaDaSemana == 5 || diaDaSemana == 6){
			precoComDesconto = precoIngressoEstudante * 0.35;
			precoComDesconto = precoIngressoEstudante - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);	
		} else {
		 pessoa.setNovoPreco(precoIngressoEstudante);
		}
	}



	public void precoComDescontoCrianca(PrecoPessoa pessoa) {
		int diaDaSemana = pessoa.getDiaSemana();
		double precoComDesconto = 0;
		double precoIngressoCrianca = pessoa.getCrianca();
		
		if(diaDaSemana == 2){
			precoComDesconto = precoIngressoCrianca * 0.1;
			precoComDesconto = precoIngressoCrianca - precoComDesconto;
			pessoa.setNovoPreco(precoComDesconto);		
	    } else if (diaDaSemana == 3) {
	    	precoComDesconto = precoIngressoCrianca * 0.15;
	    	precoComDesconto = precoIngressoCrianca - precoComDesconto;
	    	pessoa.setNovoPreco(precoComDesconto);	
	    } else if (diaDaSemana == 4) {
	    	precoComDesconto = precoIngressoCrianca * 0.3;
	    	precoComDesconto = precoIngressoCrianca - precoComDesconto;
	    	pessoa.setNovoPreco(precoComDesconto);	
	    } else if (diaDaSemana == 6) {
	    	precoComDesconto = precoIngressoCrianca * 0.11;
	    	precoComDesconto = precoIngressoCrianca - precoComDesconto;
	    	pessoa.setNovoPreco(precoComDesconto);	
	    } else {
	    	pessoa.setNovoPreco(precoIngressoCrianca);
	    }
	}



	public void descontoEstudante(PrecoPessoa pessoa) {
		int diaDaSemana = pessoa.getDiaSemana();
		int carteirinha = 0;
		Scanner input = new Scanner(System.in);
	
		if(diaDaSemana != 4 && diaDaSemana != 1 && diaDaSemana != 7){
			System.out.println("Possui carteirinha de estudante: ");
			System.out.println("1 - SIM\n2 - NAO");
			carteirinha = input.nextInt();
			input.close();
		}
		if(carteirinha == 1) {
			descontoComCarteirinha(pessoa);
		} else {
			descontoSemCarteirinha(pessoa);
		}
	}
	
	
	

}
