package de.meyer.kronik;

import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class KronikApplication {

	public static void main(String[] args) {
		SpringApplication.run(KronikApplication.class, args);
	}

	@Bean
	public DataSource datasource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/kronik");
        ds.setUsername("kronik");
        ds.setPassword("kronik");

        return ds;
	}

	@Bean
    public JdbcTemplate jdbcTemplate (DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
    }

}
