package com.mucahitarslan.security.auth;

import com.mucahitarslan.security.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final AuthenticationService service;

    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }
}