package com.geffry.user_service.User.UserController;

import org.springframework.web.bind.annotation.RestController;

import com.geffry.user_service.User.UserEntity.UserEntity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
    
    @GetMapping
    public ResponseEntity<UserEntity> getUserEntity() {
        return ResponseEntity.ok(null);
    }
    
    @PostMapping
    public ResponseEntity<UserEntity> postUserEntity(@RequestBody UserEntity userEntity) {        
        return null;
    }
    
}
