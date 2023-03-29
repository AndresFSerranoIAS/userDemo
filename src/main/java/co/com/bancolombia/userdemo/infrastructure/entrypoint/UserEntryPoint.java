package co.com.bancolombia.userdemo.infrastructure.entrypoint;

import co.com.bancolombia.userdemo.domain.model.user.User;
import co.com.bancolombia.userdemo.domain.usecase.user.UserUseCase;
import co.com.bancolombia.userdemo.infrastructure.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserEntryPoint {

    private final UserUseCase userUseCase;

    @PostMapping("/")
    public ResponseEntity<?> saveUser(@RequestBody UserDTO userDTO){
        try {
            UserDTO response = UserDTO.fromDomain(userUseCase.saveUser(UserDTO.toDomain(userDTO)));
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }catch(IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }


    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> response = userUseCase.getUsers()
                .stream()
                .map(UserDTO::fromDomain)
                .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }

}
