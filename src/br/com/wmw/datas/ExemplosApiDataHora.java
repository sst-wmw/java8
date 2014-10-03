package br.com.wmw.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class ExemplosApiDataHora {	
	
	public void exemploInstant() {
		Instant agora = Instant.now();
		System.out.println(agora);				
	}
	
	public void exemploDatas() {
		//criar datas
		LocalDate dataAtual = LocalDate.now(); //data atual
		LocalDate data1 = LocalDate.of(2014, 3, 22); //22-mar-2014
		LocalDate data2 = LocalDate.of(2014, Month.MARCH, 22); //22-mar-2014
		LocalDate data3 = Year.of(2010).atMonth(12).atDay(24); //24-dez-2010
						
		System.out.println(dataAtual);		
		         
		//criar objeto com data e hora
		LocalDateTime dateTimeAtual = LocalDateTime.now();
		LocalDateTime dateTime1 = LocalDateTime.of(2013, Month.MARCH, 21, 21, 10, 1); //21-mar-2013 as 21h10m1s
		
		System.out.println(dateTimeAtual);
	}
	
	public void exemploDurarion() {
		Instant inicio = Instant.now();
		int count = 0;
		for (int i = 0; i < 1000000; i++) {
			count ++;
		}
		Instant fim = Instant.now();
		 
		Duration duracao = Duration.between(inicio, fim);
		long duracaoEmMilissegundos = duracao.toMillis();
		
		System.out.println(duracao);
		System.out.println(duracaoEmMilissegundos);
	}
	
	public void exemploZonedDateTime() {
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");
		 
		LocalDateTime saidaDeSaoPauloSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
		LocalDateTime chegadaEmNovaYorkSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);
		     
		ZonedDateTime saidaDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario, fusoHorarioDeSaoPaulo);
		System.out.println(saidaDeSaoPauloComFusoHorario); //2014-04-04T22:30-03:00[America/Sao_Paulo]
		 
		ZonedDateTime chegadaEmNovaYorkComFusoHorario = ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario, fusoHorarioDeNovaYork);
		System.out.println(chegadaEmNovaYorkComFusoHorario); //2014-04-05T07:10-04:00[America/New_York]
		   
		Duration duracaoDoVoo = Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
		System.out.println(duracaoDoVoo); //PT9H40M
		
	}

}
