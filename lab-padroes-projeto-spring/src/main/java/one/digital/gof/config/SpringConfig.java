package one.digital.gof.config;

import one.digital.gof.service.ClienteService;
import one.digital.gof.service.impl.ClienteServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public ClienteService clienteService() {
        return new ClienteServiceImpl();
    }
}
