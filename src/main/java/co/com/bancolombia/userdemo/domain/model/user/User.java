package co.com.bancolombia.userdemo.domain.model.user;

import co.com.bancolombia.userdemo.domain.model.user.attributes.UserEmail;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserId;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserImage;
import co.com.bancolombia.userdemo.domain.model.user.attributes.UserName;

public class User {
    private final UserId userId;
    private final UserName userName;
    private final UserEmail userEmail;
    private final UserImage userImage;

    public User(UserId userId, UserName userName, UserEmail userEmail, UserImage userImage) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userImage = userImage;
    }

    public UserId getUserId() {
        return userId;
    }

    public UserName getUserName() {
        return userName;
    }

    public UserEmail getUserEmail() {
        return userEmail;
    }

    public UserImage getUserImage() {
        return userImage;
    }
}
