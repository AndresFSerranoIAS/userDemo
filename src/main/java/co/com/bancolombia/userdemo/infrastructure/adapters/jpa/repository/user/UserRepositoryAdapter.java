package co.com.bancolombia.userdemo.infrastructure.adapters.jpa.repository.user;

import co.com.bancolombia.userdemo.domain.model.gateways.IUserRepository;
import co.com.bancolombia.userdemo.domain.model.user.User;
import co.com.bancolombia.userdemo.infrastructure.adapters.jpa.entity.UserDBO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static co.com.bancolombia.userdemo.infrastructure.adapters.jpa.entity.UserDBO.fromDomain;
import static co.com.bancolombia.userdemo.infrastructure.adapters.jpa.entity.UserDBO.toDomain;

@Repository
public class UserRepositoryAdapter implements IUserRepository {

    private final IUserAdapterRepository iUserAdapterRepository;

    public UserRepositoryAdapter(IUserAdapterRepository iUserAdapterRepository) {
        this.iUserAdapterRepository = iUserAdapterRepository;
    }

    @Override
    public User saveUser(User user) {

//        /* Mapear el objeto sin guardar a la infraestructura */
//        UserDBO userDBOWithoutSave = UserDBO.fromDomain(user);
//        /* Guardar el objeto llamando el repositorio, usando el método SAVE de JPA el cual siempre devuelve un DBO*/
//        UserDBO userDBOSaved = iUserAdapterRepository.save(userDBOWithoutSave);
//        /* Mapear el objeto guardado al dominio */
//        User userToDomain = UserDBO.toDomain(userDBOSaved);
//
//        return userToDomain;
        return toDomain(iUserAdapterRepository.save(fromDomain(user)));
    }

    @Override
    public List<User> getUsers() {
        return iUserAdapterRepository.findAll()
                .stream()
                .map(UserDBO::toDomain)
                .collect(Collectors.toList());
    }
}
