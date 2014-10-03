package br.com.wmw.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.wmw.lambda.Funcionario.Sexo;

public class ExemplosLambda {
	
	public List<Funcionario> populaListaFuncionarios() {
		List<Funcionario> funcionarioList = new ArrayList<Funcionario>();
		
		Funcionario func1 = new Funcionario();
		func1.setNome("Leonardo");
		func1.setIdade(24);
		func1.setSalario(2590.00);
		func1.setSexo(Sexo.MASCULINO);
		//--
		Funcionario func2 = new Funcionario();
		func2.setNome("Tiago");
		func2.setIdade(20);
		func2.setSalario(1450.00);
		func2.setSexo(Sexo.MASCULINO);
		//--
		Funcionario func3 = new Funcionario();
		func3.setNome("Julia");
		func3.setIdade(18);
		func3.setSalario(5500.00);
		func3.setSexo(Sexo.FEMININO);
		
		funcionarioList.add(func1);
		funcionarioList.add(func2);
		funcionarioList.add(func3);
		
		return funcionarioList;
	}
		
	
	public Double mediaSalarialOld(List<Funcionario> funcionarios, int idadeMinima) {		 
	    double soma = 0d;
	    int contagem = 0;
	 
	    for (Funcionario f : funcionarios) {
	        if (f.getIdade() >= idadeMinima) {
	            soma = soma + f.getSalario();
	            contagem++;
	        }
	    }
	    return soma / contagem;
	}
		
	public Double mediaSalarial(List<Funcionario> funcionarios, int idadeMinima) {
		Double media = funcionarios
				.stream()
				.filter(f -> f.getIdade() >= idadeMinima)
				.mapToDouble(f -> f.getSalario())
				.average()
				.getAsDouble();
		
		return media;		
	}
	
	public void exemploLambda() {
		List<String> palavras = Arrays.asList("Rodrigo", "Paulo", "João");		
		palavras.forEach(s -> System.out.println(s));
	}
	

}
