package br.rodrigo.ticket.modelo;

public class PrecoPessoa {
	
	private double crianca;
	private double estudante;
	private double Idoso;
	private double novoPreco;
	private int diaSemana;
	
	public PrecoPessoa(){
		
	}
	
	public PrecoPessoa(double crianca, double estudante, double Idoso, int diaSemana){
		
		this.crianca = crianca;
		this.estudante = estudante;
		this.Idoso = Idoso;
		this.diaSemana = diaSemana;
		
	}
	
	public PrecoPessoa(double crianca, double estudante, double Idoso){
		
		this.crianca = crianca;
		this.estudante = estudante;
		this.Idoso = Idoso;
		
	}
	
	public int getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}
	public double getNovoPreco() {
		return novoPreco;
	}
	public void setNovoPreco(double novoPreco) {
		this.novoPreco = novoPreco;
	}
	public double getCrianca() {
		return crianca;
	}
	public void setCrianca(double crianca) {
		this.crianca = crianca;
	}
	public double getEstudante() {
		return estudante;
	}
	public void setEstudante(double estudante) {
		this.estudante = estudante;
	}
	public double getIdoso() {
		return Idoso;
	}
	public void setIdoso(double idoso) {
		Idoso = idoso;
	}
	
	

}
