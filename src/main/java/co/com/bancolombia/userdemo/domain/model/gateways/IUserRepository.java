package co.com.bancolombia.userdemo.domain.model.gateways;

import co.com.bancolombia.userdemo.domain.model.user.User;

import java.util.List;

public interface IUserRepository {
    public User saveUser(User user);
    public List<User> getUsers();
}
