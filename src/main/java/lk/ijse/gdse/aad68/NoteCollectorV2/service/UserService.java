package lk.ijse.gdse.aad68.NoteCollectorV2.service;

import lk.ijse.gdse.aad68.NoteCollectorV2.customObj.UserResponse;
import lk.ijse.gdse.aad68.NoteCollectorV2.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(String userId);
    UserResponse getSelectedUser(String userId);
    List<UserDTO> getAllUsers();
}
