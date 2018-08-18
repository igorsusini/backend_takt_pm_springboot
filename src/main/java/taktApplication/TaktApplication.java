import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by igors on 16/01/2018.
 */
@SpringBootApplication
public class TaktApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaktApplication.class, args);
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/takt_v2");
        dataSource.setUsername("root");
        dataSource.setPassword("petar@86");
        return dataSource;
    }
}