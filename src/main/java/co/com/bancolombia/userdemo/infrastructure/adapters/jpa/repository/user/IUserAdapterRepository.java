package co.com.bancolombia.userdemo.infrastructure.adapters.jpa.repository.user;

import co.com.bancolombia.userdemo.infrastructure.adapters.jpa.entity.UserDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface IUserAdapterRepository extends JpaRepository<UserDBO,Long> {

}
