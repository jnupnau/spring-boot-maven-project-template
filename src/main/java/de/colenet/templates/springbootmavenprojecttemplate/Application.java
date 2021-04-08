package de.colenet.templates.springbootmavenprojecttemplate;

import java.time.Clock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  @Bean
  public Clock clock() {
    // We provide this bean here because it's useful to have and
    // to get rid of the PMD Rule:UseUtilityClass warning
    return Clock.systemUTC();
  }

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
