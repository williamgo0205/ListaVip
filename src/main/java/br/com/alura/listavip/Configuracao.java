package br.com.alura.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.properties")
public class Configuracao {

	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

// Bean comentado pois as configurações de conexão estão no arquivo application.properties
/*	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("SDBANCO");
		dataSource.setPassword("SDBANCO");
		dataSource.setUrl("jdbc:oracle:thin:@192.168.56.101:1521:bctst11g");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");		

		return dataSource;
	} */

}
