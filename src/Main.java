import java.util.ArrayList;
import java.util.List;

import br.com.wmw.datas.ExemplosApiDataHora;
import br.com.wmw.lambda.ExemplosLambda;
import br.com.wmw.lambda.Funcionario;


public class Main {

	public static void main(String[] args) {
		
		ExemplosLambda examploLambda = new ExemplosLambda();
		List<Funcionario> funcionarioList = new ArrayList<Funcionario>();
		funcionarioList = examploLambda.populaListaFuncionarios();		
		
		//calcular a média salarial dos funcionários com idade miníma especificada
		System.out.println(examploLambda.mediaSalarialOld(funcionarioList, 20));
		System.out.println(examploLambda.mediaSalarial(funcionarioList, 20));
		
		examploLambda.exemploLambda();
		
		//------------------------------------//
		
		ExemplosApiDataHora exemplosData = new ExemplosApiDataHora();
		exemplosData.exemploInstant();
		exemplosData.exemploDatas();
		exemplosData.exemploDurarion();
		exemplosData.exemploZonedDateTime();
			
		
		
		
	}

}
