package co.com.bancolombia.userdemo.infrastructure.adapters.jpa.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USER")
@Getter
@Setter
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
}
