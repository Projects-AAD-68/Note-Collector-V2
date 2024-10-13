package lk.ijse.gdse.aad68.NoteCollectorV2.controller;

import lk.ijse.gdse.aad68.NoteCollectorV2.jwtodels.JWTResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    @PostMapping(value = "signup")
    public ResponseEntity<JWTResponse> signUp(){
        return null;
    }
    @PostMapping(value = "signin")
    public ResponseEntity<JWTResponse> signIn(){
        return null;
    }

}
