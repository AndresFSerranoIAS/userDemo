package co.com.bancolombia.userdemo.infrastructure.dto;

import co.com.bancolombia.userdemo.domain.model.user.User;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserEmail;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserId;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserImage;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private Long userId;
    private String userName;
    private String userEmail;
    private String userImage;

    public static UserDTO fromDomain(User user){
        return new UserDTO(user.getUserId().getValue(),
                user.getUserName().getValue(),
                user.getUserEmail().getValue(),
                user.getUserImage().getValue());
    }
    public static User toDomain(UserDTO userDTO){
        return new User(new UserId(userDTO.getUserId()),
                new UserName(userDTO.getUserName()),
                new UserEmail(userDTO.getUserEmail()),
                new UserImage(userDTO.getUserImage()));
    }
}
