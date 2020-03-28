package com.formacionbdi.springboot.app.commons;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
/*deshabilitar la configuracion del DataSource*/
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootServicioCommonsApplication {

}
