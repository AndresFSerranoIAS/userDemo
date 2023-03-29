package co.com.bancolombia.userdemo.infrastructure.adapters.jpa.entity;

import co.com.bancolombia.userdemo.domain.model.user.User;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserEmail;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserId;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserImage;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_TABLE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name ="USER_NAME",nullable = false)
    private String userName;
    @Column(name = "USER_EMAIL",nullable = false)
    private String userEmail;
    @Column(name = "USER_IMAGE",nullable = false)
    private String userImage;

    public static User toDomain(UserDBO userDBO){
       return new User(new UserId(userDBO.getUserId()),
               new UserName(userDBO.getUserName()),
               new UserEmail(userDBO.getUserEmail()),
               new UserImage(userDBO.getUserImage()));
    }
    public static UserDBO fromDomain(User user){
        return new UserDBO(user.getUserId().getValue(),
                user.getUserName().getValue(),
                user.getUserEmail().getValue(),
                user.getUserImage().getValue());
    }
}
