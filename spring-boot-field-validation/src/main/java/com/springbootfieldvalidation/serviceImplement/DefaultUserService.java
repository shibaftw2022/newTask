package com.springbootfieldvalidation.serviceImplement;



import com.springbootfieldvalidation.dto.LoginResponseDTO;
import com.springbootfieldvalidation.model.User;
import com.springbootfieldvalidation.repository.UserRepository;
import com.springbootfieldvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DefaultUserService implements UserService {

    @Autowired
    UserRepository userRepository;

    public LoginResponseDTO getUser(String username, String password){
        User validUser = userRepository.getUser(username, password);
        if(validUser != null) {
            LoginResponseDTO loginResponseDTO = new LoginResponseDTO(validUser);
            return loginResponseDTO;
        }
        else
        {
            return null;
        }
    }
}
