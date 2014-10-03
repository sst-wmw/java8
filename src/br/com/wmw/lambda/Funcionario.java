package br.com.wmw.lambda;

public class Funcionario {
	
	public static enum Sexo {
        MASCULINO,
        FEMININO;
    }
 
    private String nome;
    private int idade;
    private Double salario;
    private Sexo sexo;
        
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
