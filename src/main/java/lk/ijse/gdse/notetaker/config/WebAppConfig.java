package lk.ijse.gdse.notetaker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.notetaker")
@EnableWebMvc
public class WebAppConfig {
}
