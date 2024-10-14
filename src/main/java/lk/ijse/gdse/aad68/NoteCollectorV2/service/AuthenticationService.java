package lk.ijse.gdse.aad68.NoteCollectorV2.service;


import lk.ijse.gdse.aad68.NoteCollectorV2.dto.impl.UserDTO;
import lk.ijse.gdse.aad68.NoteCollectorV2.jwtmodels.JwtAuthResponse;
import lk.ijse.gdse.aad68.NoteCollectorV2.jwtmodels.SignIn;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(UserDTO signUp);
    JwtAuthResponse refreshToken(String accessToken);
}
