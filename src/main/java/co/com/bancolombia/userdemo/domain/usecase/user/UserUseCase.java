package co.com.bancolombia.userdemo.domain.usecase.user;

import co.com.bancolombia.userdemo.domain.model.gateways.IUserRepository;
import co.com.bancolombia.userdemo.domain.model.user.User;

import java.util.List;

public class UserUseCase {

    private final IUserRepository iUserRepository;

    public UserUseCase(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public User saveUser(User userRequest){
        return iUserRepository.saveUser(userRequest);
        /*Todo lo funcional va aquí */
    }
    public List<User> getUsers(){
        return iUserRepository.getUsers();
    }

}
