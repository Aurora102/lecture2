package config;

import filehandle.HandleInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

        @Bean(name = "inputHandle")
        public HandleInput myInput() {
            return new HandleInput();
        }
}

