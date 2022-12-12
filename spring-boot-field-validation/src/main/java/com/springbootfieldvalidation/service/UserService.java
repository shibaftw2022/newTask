package com.springbootfieldvalidation.service;

import com.springbootfieldvalidation.dto.LoginResponseDTO;
import com.springbootfieldvalidation.model.User;


public interface UserService {

    LoginResponseDTO getUser(String username, String password);
}
