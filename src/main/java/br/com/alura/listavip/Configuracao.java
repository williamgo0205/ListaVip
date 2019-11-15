package br.com.alura.listavip;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class Configuracao {

	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("sdbanco");
		dataSource.setPassword("sdbanco");
		//dataSource.setUrl("jdbc:oracle:thin:@192.168.56.101:1521:bctst11g");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:bctst11g");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");		

		return dataSource;
	}

}
