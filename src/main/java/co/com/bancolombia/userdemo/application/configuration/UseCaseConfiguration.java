package co.com.bancolombia.userdemo.application.configuration;

import co.com.bancolombia.userdemo.domain.model.gateways.IUserRepository;
import co.com.bancolombia.userdemo.domain.usecase.user.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean("UserService")
    public UserUseCase UserUseCase(IUserRepository iUserRepository){
        return new UserUseCase(iUserRepository);
    }

}
