package com.example.myproject.turf.Auth;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class AuthService {
@Autowired
 
AuthRepo authRepository;
public List<AuthEntity> shashAll(){
	return authRepository.findAll();
}
public void saveUser(AuthEntity authEntity) {
    authRepository.save(authEntity);
}

}